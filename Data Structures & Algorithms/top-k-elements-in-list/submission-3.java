class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> f = new HashMap<>();
        for (int num : nums) {
            f.put(num, f.getOrDefault(num, 0) + 1);
        }
        PriorityQueue<Map.Entry<Integer, Integer>> pq = new PriorityQueue<>(
            (a, b) -> Integer.compare(a.getValue(), b.getValue())
        );
        for (Map.Entry<Integer, Integer> entry : f.entrySet()) {
            pq.offer(entry);
            if (pq.size() > k) {
                pq.poll();
            }
        }
        int[] most = new int[k];
        for (int i = 0; i < k; i++) {
            most[i] = pq.poll().getKey();
        }
        return most;
    }
}
