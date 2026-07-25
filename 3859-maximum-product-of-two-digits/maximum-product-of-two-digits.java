class Solution {
    public int maxProduct(int n) {
        List<Integer> l = new ArrayList<>();
        while(n > 0){
            l.add(n % 10);
            n /= 10;
        }
        Collections.sort(l);
        int size = l.size();
        return l.get(size - 1) * l.get(size - 2);
    }
}
