class Solution {
    public boolean isPalindrome(String s) {
        Deque<Character> stack = new ArrayDeque<>();

        for (int i = 0; i < s.length(); i++) {
            if (Character.isLetterOrDigit(s.charAt(i))) {
                stack.push(Character.toLowerCase(s.charAt(i)));
            }
        }

        boolean isPalindrome = true;
        for (int j = 0; j < s.length(); j++) {
            if (Character.isLetterOrDigit(s.charAt(j)) && Character.toLowerCase(s.charAt(j)) != stack.pop()) {
                isPalindrome = false;
            }
        }

        return isPalindrome;
    }
}
