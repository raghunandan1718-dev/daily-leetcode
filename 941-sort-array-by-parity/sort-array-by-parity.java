class Solution {
    public int[] sortArrayByParity(int[] nums) {

        int i = 0;
        int j = nums.length -1;
        int n = nums.length;

        while( i< j ){

            while(nums[i]%2==0 && i<j ){
                i++;
            }
            while( i<j  && nums[j]%2!=0){
                j--;
            }

               if( i<j){
                int temp = nums[i];
                nums[i] = nums[j];
                nums[j] = temp;
                i++;
                j--;
            }

        }
        return nums;
        
    }
}