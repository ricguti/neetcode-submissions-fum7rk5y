class Solution {
    public int[][] merge(int[][] intervals) {
        Arrays.sort(intervals, (a, b) -> Integer.compare(a[0], b[0]));
        List<int[]> merged = new ArrayList<>();

        for (int [] interval : intervals) {
            if (merged.size() > 0) {
                int [] last = merged.get(merged.size() - 1);
                if (last[1] >= interval[0]) {
                    last[1] = Math.max(last[1], interval[1]);
                } else {
                    merged.add(interval);
                }
            } else {
                merged.add(interval);
            }
        }

        return merged.toArray(new int[merged.size()][]);
    }
}


// sort intervals
// comprare current to next
// check if end of current >= start of next
// merge

// O(nlogn) from sorting
// sort by start time
// [1, 3] [1, 5]
// [1, 5] [1, 3]