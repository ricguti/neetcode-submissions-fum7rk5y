class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> map = new HashMap<>();
        for (String str : strs) {
            char[] c = str.toCharArray();
            Arrays.sort(c);
            String key = Arrays.toString(c);
            List l = map.getOrDefault(key, new ArrayList<>());
            l.add(str);
            map.put(key, l);
        }
        List<List<String>> result = new ArrayList<>();
        for (List l : map.values()) {
            result.add(l);
        }
        return result;
    }
}
