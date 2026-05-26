class Solution {

    int[][] dir = {{0,1},{0,-1},{1,0},{-1,0}};

    static class Pair {
        int i;
        int j;

        Pair(int i, int j) {
            this.i = i;
            this.j = j;
        }
    }

    public void islandsAndTreasure(int[][] grid) {

        int n = grid.length;
        int m = grid[0].length;

        int INF = 2147483647;

        for(int i = 0; i < n; i++) {

            for(int j = 0; j < m; j++) {

                if(grid[i][j] == INF) {

                    Queue<Pair> q = new LinkedList<>();

                    boolean[][] visited = new boolean[n][m];

                    q.offer(new Pair(i, j));
                    visited[i][j] = true;

                    int s = 0;

                    boolean found = false;

                    while(!q.isEmpty() && !found) {

                        int size = q.size();

                        for(int k = 0; k < size; k++) {

                            Pair p = q.poll();

                            int r = p.i;
                            int c = p.j;

                            if(grid[r][c] == 0) {
                                grid[i][j] = s;
                                found = true;
                                break;
                            }

                            for(int[] d : dir) {

                                int ni = r + d[0];
                                int nj = c + d[1];

                                if(ni >= 0 && ni < n &&
                                   nj >= 0 && nj < m &&
                                   !visited[ni][nj] &&
                                   grid[ni][nj] != -1) {

                                    visited[ni][nj] = true;

                                    q.offer(new Pair(ni, nj));
                                }
                            }
                        }

                        s++;
                    }
                }
            }
        }
    }
}