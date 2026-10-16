class Solution {
    public int[] sortArrayByParityII(int[] nums) {
        
        int e = 0;
        int o = 1;

        while(e <nums.length && o <nums.length){

            if(nums[e]%2 == 0){
                 e+=2;
            }else if(nums[o]%2 !=0){
                o+=2;
              
            }else{
                int temp = nums[e];
                nums[e] = nums[o];
                nums[o] = temp;

                e += 2;
                o += 2;
            }
        }

        return nums;
    }
}