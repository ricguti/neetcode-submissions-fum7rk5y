class Solution {
    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) return false;
        
        char[] sArr = s.toCharArray(), tArr = t.toCharArray();

        Arrays.sort(sArr);
        Arrays.sort(tArr);

        int i = 0;
        while (i < s.length() && sArr[i] == tArr[i]) {
            i++;
        }

        return i == s.length();
    }
}
