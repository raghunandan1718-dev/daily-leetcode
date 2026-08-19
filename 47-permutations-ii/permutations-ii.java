class Solution {
    public List<List<Integer>> permuteUnique(int[] nums) {

        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> curr = new ArrayList<>();

        Arrays.sort(nums);

        boolean[] visited = new boolean[nums.length];

        backtrack(nums, visited, curr, ans);

        return ans;
    }

    public void backtrack(int[] nums, boolean[] visited,
                          List<Integer> curr,
                          List<List<Integer>> ans) {

        // Base case
        if (curr.size() == nums.length) {
            ans.add(new ArrayList<>(curr));
            return;
        }

        for (int i = 0; i < nums.length; i++) {

            // Already used
            if (visited[i]) {
                continue;
            }

            // Skip duplicates
            if (i > 0 && nums[i] == nums[i - 1] && !visited[i - 1]) {
                continue;
            }

            // Choose
            curr.add(nums[i]);
            visited[i] = true;

            // Explore
            backtrack(nums, visited, curr, ans);

            // Backtrack
            curr.remove(curr.size() - 1);
            visited[i] = false;
        }
    }
}