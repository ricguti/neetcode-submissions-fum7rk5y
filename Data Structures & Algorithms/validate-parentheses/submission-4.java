class Solution {
    public boolean isValid(String s) {
        Deque<Character> stack = new ArrayDeque<>();
        for (char c : s.toCharArray()) {
            if (isOpening(c)) {
                stack.push(c);
            } else {
                if (stack.isEmpty() || !match(stack.pop(), c)) {
                    return false;
                }
            }
        }
        return stack.isEmpty();
    }

    private boolean isOpening(char c) {
        return c == '(' || c == '{' || c == '[';
    }

    private boolean match(char open, char close) {
        Map<Character, Character> mp = new HashMap<>();
        mp.put('(', ')');
        mp.put('{', '}');
        mp.put('[', ']');

        return mp.get(open) == close;
    }
}


// iterate through the s
// put opening in stack
// else pop and compare


// O(n)
