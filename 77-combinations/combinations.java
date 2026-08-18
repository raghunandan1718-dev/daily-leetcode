class Solution {

    List<List<Integer>> ans = new ArrayList<>();

    public List<List<Integer>> combine(int n, int k) {

        backtrack(1, n, k, new ArrayList<>());

        return ans;
    }

    public void backtrack(int start, int n, int k,
                          List<Integer> current) {

        // Base case
        if (current.size() == k) {
            ans.add(new ArrayList<>(current));
            return;
        }

        // Try every possible number
        for (int i = start; i <= n; i++) {

            // Choose
            current.add(i);

            // Explore
            backtrack(i + 1, n, k, current);

            // Undo
            current.remove(current.size() - 1);
        }
    }
}