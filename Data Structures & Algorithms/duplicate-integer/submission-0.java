class Solution {
    public boolean hasDuplicate(int[] nums) {
        HashSet<Integer> set = new HashSet<Integer>();
        for(int i = 0; i < nums.length; i++) {
	        int num = nums[i];
            if(set.contains(num)) {
	            return true;
            }
            set.add(num);
        }
        return false;
    }
}

// if any value appears twice

// [4, 5, 2, 6, 8, 9, 3, 5, 0]
// use a set, and check if the set contains the number
// checking the set is O(1)
// iterating the array is O(N)
// solution is O(N)