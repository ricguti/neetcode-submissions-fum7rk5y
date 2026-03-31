class Solution {
    public int[] twoSum(int [] numbers, int target) {
        int left = 0, right = numbers.length - 1;
        while (numbers[left] + numbers[right] != target) {
            if (numbers[left] + numbers[right] > target) {
                right--;
            }
            if (numbers[left] + numbers[right] < target) {
                left++;
            }
            System.out.println("numbers[left] + numbers[right] "
                + numbers[left] + " + " + numbers[right] + " = "
                + numbers[left] + numbers[right] );
        }
        int[] result = {left + 1, right + 1};
        return result;
    }

}
