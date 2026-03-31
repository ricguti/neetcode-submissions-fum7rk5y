class Solution {
    public int numIslands(char[][] grid) {
        int islands = 0;

        for (int row = 0; row < grid.length; row++) {
            for (int col = 0; col < grid[row].length; col++) {
                if (grid[row][col] == '1') {
                    // expand island
                    grid = expandIsland(grid, row, col);
                    islands++;
                }
            }
        }

        return islands;
    }

    private char[][] expandIsland(char[][] grid, int row, int col) {
        grid[row][col] = '0';

        // down
        if (row + 1 < grid.length && grid[row + 1][col] == '1') {
            grid = expandIsland(grid, row + 1, col);
        }
        // up
        if (row - 1 >= 0 && grid[row - 1][col] == '1') {
            grid = expandIsland(grid, row - 1, col);
        }
        // left
        if (col - 1 >= 0 && grid[row][col - 1] == '1') {
            grid = expandIsland(grid, row, col - 1);
        }
        // right
        if (col + 1 < grid[row].length && grid[row][col + 1] == '1') {
            grid = expandIsland(grid, row, col + 1);
        }

        return grid;
    }
}


// can I modify?
// find 1
// check all directions for 1s
// continue until no 1s
// count an island