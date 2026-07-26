class Solution {
    public int maximumProduct(int[] nums) {
        Arrays.sort(nums);

        int n =  nums.length;
        // when array length is 3
        int product1 = nums[0] * nums[1]*nums[n-1];

        // when there is more than three 

        int product2 = nums[n-1]*nums[n-2]*nums[n-3];

        return Math.max(product1,product2);
    }
}