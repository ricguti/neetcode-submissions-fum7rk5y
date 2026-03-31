class Solution {

    public String encode(List<String> strs) {
        StringBuilder encoded = new StringBuilder();
        for (String str : strs) {
            encoded.append(str.length()).append("#").append(str);
        }
        return encoded.toString();
    }

    public List<String> decode(String str) {
        List<String> decoded = new ArrayList<>();
        for (int i = 0; i < str.length(); i++) {
            System.out.println(i);
            StringBuilder lStr = new StringBuilder();
            while (str.charAt(i) != '#') {
                lStr.append(str.charAt(i));
                i++;
            }
            i++;
            int end = i + Integer.parseInt(lStr.toString());
            StringBuilder s = new StringBuilder();
            for (int j = i; j < end; j++) {
                s.append(str.charAt(j));
            }
            decoded.add(s.toString());
            i = end - 1;
            
        }
        return decoded;
    }
}
