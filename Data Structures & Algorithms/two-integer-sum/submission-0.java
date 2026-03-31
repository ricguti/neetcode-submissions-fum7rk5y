class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> mp = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int diff = target - nums[i];
            if (mp.containsKey(nums[i])) {
                return new int[] {mp.get(nums[i]), i};
            } else {
                mp.put(diff, i);
            }
        }
        return new int[0];
    }
}

// brute force: compare all

// other:
// map: index to target
// if target, return [index, target_index]