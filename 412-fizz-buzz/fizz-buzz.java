class Solution {
    public List<String> fizzBuzz(int n) {

        List<String> res = new ArrayList<>();

        for(int i = 1; i <= n; i++){
           String ans  = "";

            if(i%3 == 0){
                ans = ans + "Fizz";
            }
            if(i%5 == 0){
                ans = ans + "Buzz";
            }
            if(ans == ""){
               ans = Integer.toString(i);
            }
            res.add(ans);
        }
        return res;
    }
}