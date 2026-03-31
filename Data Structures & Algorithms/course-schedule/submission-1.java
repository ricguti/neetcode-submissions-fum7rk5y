class Solution {
    public boolean canFinish(int numCourses, int[][] prerequisites) {
        Map<Integer, Set<Integer>> dependants = new HashMap<>();
        Map<Integer, Integer> numOfPrerequisites = new HashMap<>();
        for (int i = 0; i < numCourses; i++) {
            dependants.put(i, new HashSet<>());
            numOfPrerequisites.put(i, 0);
        }

        for (int [] pair : prerequisites) {
            int c = pair[0];
            int p = pair[1];

            if (dependants.get(p).add(c)) {
                numOfPrerequisites.put(c, numOfPrerequisites.get(c) + 1);
            }
        }

        Queue<Integer> ready = new ArrayDeque<>();
        for (int i = 0; i < numCourses; i++) {
            if (numOfPrerequisites.get(i) == 0) {
                ready.offer(i);
            }
        }

        int completed = 0;
        while (!ready.isEmpty()) {
            int current = ready.poll();
            completed++;

            for (int dependant : dependants.get(current)) {
                numOfPrerequisites.put(dependant, numOfPrerequisites.get(dependant) - 1);

                if (numOfPrerequisites.get(dependant) == 0) {
                    ready.offer(dependant);
                }
            }
        }

        return completed == numCourses;
    }
}


