class Solution {
    public boolean isPalindrome(String s) {
        String sLower = s.toLowerCase();
        int start = 0, end = sLower.length() - 1;
        boolean isPalindrome = true;

        while (start < sLower.length() - 1 && end >= 0 && start <= end) {
            char a = sLower.charAt(start), b = sLower.charAt(end);
            if (isLetter(a) && isLetter(b)) {
                if (a != b) {
                    return false;
                } else {
                    start++;
                    end--;
                }
            } else {
                if (!isLetter(a)) {
                    start++;
                }
                if (!isLetter(b)) {
                    end--;
                }
            }
        }

        return isPalindrome;
    }

    private boolean isLetter(char c) {
        return (c >= 'a' && c <= 'z') || (c >= '0' && c <= '9');
    }
}
