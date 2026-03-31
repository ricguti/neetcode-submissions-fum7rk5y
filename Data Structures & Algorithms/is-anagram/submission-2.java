class Solution {
    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) return false;
        int n = s.length();

        int[] freq = new int[26];
        int mismatch = 0;
        // increment with s
        // decrement with t
        // zero means balance
        for (int i = 0; i < n; i++) {
            int sAt = s.charAt(i) - 'a';
            int tAt = t.charAt(i) - 'a';

            freq[sAt]++;
            if (freq[sAt] == 1) mismatch++;
            if (freq[sAt] == 0) mismatch--;

            freq[tAt]--;
            if (freq[tAt] == -1) mismatch++;
            if (freq[tAt] == 0) mismatch--;
        }

        return mismatch == 0;
    }
}
