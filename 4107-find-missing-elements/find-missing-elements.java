class Solution {
    public List<Integer> findMissingElements(int[] nums) {

        Map<Integer,Integer> map = new HashMap<>();

        List<Integer> li = new ArrayList<>();

        for(int i=0; i<nums.length; i++){
            map.put(nums[i],map.getOrDefault(nums[i],0)+1);
        }
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;

        for(int num : nums){
            max = Math.max(num,max);
            min = Math.min(num,min);
        }

        for(int i=min; i<=max; i++){
            if(!map.containsKey(i)){
                li.add(i);
            }
        }
        return li;

        
    }
}