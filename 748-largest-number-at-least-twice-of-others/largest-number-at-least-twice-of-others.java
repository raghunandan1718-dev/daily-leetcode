class Solution {
    public int dominantIndex(int[] nums) {

        int largest = -1;
        int secLargest = -1;
        int idx = -1;

        for(int i = 0; i < nums.length; i++){
             if(nums[i] > largest){
                secLargest = largest;
                largest = nums[i];
                idx = i;
             }else if( nums[i] > secLargest){
                secLargest = nums[i];
             }
        }

        return largest >= (2 * secLargest) ?  idx : -1;
        
    }
}