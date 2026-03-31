class Solution {
    public int lengthOfLongestSubstring(String s) {
        int longest = 0;
        for (int i = 0; i < s.length(); i++) {
            boolean hasDup = false;
            Set<Character> set = new HashSet<>();
            int count = 0, j = i;
            while (!hasDup && j < s.length()) {
                if (set.contains(s.charAt(j))) {
                    hasDup = true;
                } else {
                    set.add(s.charAt(j));
                    count++;
                }
                j++;
            }
            if (count > longest) {
                longest = count;
            }
        }
        return longest;
    }
}

// aabcaaa

// longest without duplicates
// brute force, generate all substrings and check

// example
// zxyzxyz
// for char in s
//     while set doesn't contian put char in set
//              count++