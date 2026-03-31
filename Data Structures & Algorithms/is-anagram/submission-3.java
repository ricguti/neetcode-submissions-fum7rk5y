class Solution {
    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) return false;
        int n = s.length();

        int[] freq = new int[26];
        int errorState = 0;
        for (int i = 0; i < n; i++) {
            int sAt = s.charAt(i) - 'a';
            int tAt = t.charAt(i) - 'a';

            freq[sAt]++;
            if (freq[sAt] == 1) errorState++;
            if (freq[sAt] == 0) errorState--;

            freq[tAt]--;
            if (freq[tAt] == -1) errorState++;
            if (freq[tAt] == 0) errorState--;
        }

        return errorState == 0;
    }
}
