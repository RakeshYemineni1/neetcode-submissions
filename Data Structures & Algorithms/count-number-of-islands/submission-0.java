class Solution {

    static int[][] dir = {{0,1},{0, -1},{1, 0},{-1, 0}};

    public int numIslands(char[][] grid) {
        int n = grid.length;
        int m = grid[0].length;

        boolean[][] visited = new boolean[n][m];

        int count = 0;

        for(int i = 0; i < n; i++){
            for(int j = 0; j < m; j++){
                if(!visited[i][j] && grid[i][j] == '1'){
                    count++;
                    dfs(grid, i, j, visited);
                }
            }
        }

        return count;
    }

    public static void dfs(char[][] grid, int i, int j, boolean[][] visited){
        int n = grid.length;
        int m = grid[0].length;
        //if(visited[i][j]) return;
        visited[i][j] = true;

        for(int[] d : dir){
            int ni = i + d[0];
            int nj = j + d[1];

            if(ni >= 0 && ni < n && nj >= 0 && nj < m && !visited[ni][nj] && grid[ni][nj] == '1'){
                dfs(grid, ni, nj, visited);

            }
        }
    }
}
