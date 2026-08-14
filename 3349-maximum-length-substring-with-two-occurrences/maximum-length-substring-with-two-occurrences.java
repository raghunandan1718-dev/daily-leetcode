class Solution {
    public int maximumLengthSubstring(String s) {
        int l = 0;
        int ans = 0;

        Map<Character,Integer> hmap = new HashMap<>();

        for(int r=0; r<s.length(); r++){
            char ch = s.charAt(r);
             hmap.put(ch, hmap.getOrDefault(ch, 0) + 1);
           
            while(hmap.get(ch) > 2){
                char leftchar = s.charAt(l);
                hmap.put(leftchar,hmap.get(leftchar)-1);
                l++;
            }

            ans = Math.max(ans,r-l+1);
        }
        return ans;
        
    }
}