class Solution {
    public int longestConsecutive(int[] nums) {
        if (nums.length == 0) {
            return 0;
        }
        
        Set<Integer> dedup = new HashSet<>();
        for (int num : nums) {
            dedup.add(num);
        }

        Map<Integer, Integer> seqs = new HashMap<>();
        for (int start : dedup) {
            if (!dedup.contains(start - 1)) {
                seqs.put(start, 1);
                int next = start + 1;
                while (dedup.contains(next)) {
                    seqs.put(start, seqs.get(start) + 1);
                    next++;
                }
            }
        }
        int longest = Integer.MIN_VALUE;
        for (int seqStart : seqs.keySet()) {
            longest = Math.max(longest, seqs.get(seqStart));
        }
        return longest;
    }
}
