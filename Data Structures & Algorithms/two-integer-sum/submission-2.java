class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> checkmap = new HashMap<>();
        for(int i=0;i<nums.length;i++){
            int diff=target-nums[i];
            if(checkmap.containsKey(diff)){
                return new int[]{checkmap.get(diff),i};
            }
            else{
                checkmap.put(nums[i],i);
            }
        }
         return new int[]{};
    }
}
