class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> mp = new HashMap<>();
        for (String str : strs) {
            char[] charArray = str.toCharArray();
            Arrays.sort(charArray);
            String key = new String(charArray);

            if (mp.containsKey(key)) {
                mp.get(key).add(str);
            } else {
                List<String> ls = new ArrayList<>();
                ls.add(str);
                mp.put(key, ls);
            }
        }
        return new ArrayList<>(mp.values());        
    }
}

// go through each string
// get the key for its group
// map key to list of strings
// return list of string
