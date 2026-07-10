class Solution {
    public static int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        int val1 = 0;
        int val2 = 0;
        for(int i = 0; i < nums.length; i++){
            int req = target - nums[i];
            if(map.containsKey(req)){
                val1 = map.get(req);
                val2 = i;
            } else {
                map.put(nums[i],i);
            }
        }
        int[] result = {val1,val2};
        return result;
    }
}