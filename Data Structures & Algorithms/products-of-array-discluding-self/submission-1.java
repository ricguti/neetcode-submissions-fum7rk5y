class Solution {
    public int[] productExceptSelf(int[] nums) {
        int[] output = new int[nums.length];
        int max = 1, zeros = 0;
        boolean zero = false;
        for (int num : nums) {
            if (num != 0) max = max * num;
            if (num == 0) {
                zero = true;
                zeros++;
            }                
        }
        for (int i = 0; i < nums.length; i++) {
            if (zero) {
                if (nums[i] != 0) {
                    output[i] = 0;
                } else {
                    if (zeros > 1) {
                        output[i] = 0;
                    } else {
                        output[i] = max;
                    }
                }
            } else {
                output[i] = max / nums[i];
            }
        }
        return output;
    }
}  
