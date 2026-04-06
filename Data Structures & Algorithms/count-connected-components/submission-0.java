class Solution {
    public int countComponents(int n, int[][] edges) {
        List<List<Integer>> adjList = new ArrayList<>();
        int m = edges.length;

        for(int i = 0; i < n; i++){
            adjList.add(new ArrayList<>());
        }

        for(int i = 0; i < m; i++){
            int v = edges[i][0];
            int u = edges[i][1];
            adjList.get(v).add(u);
            adjList.get(u).add(v);
        }

        boolean[] isVisit = new boolean[n]; 
        int count = 0;
        for(int i = 0; i < n; i++){
            if(!isVisit[i]){
                count++;
                dfs(adjList, i, isVisit);
            }
        }

        return count;
    }
    public static void dfs(List<List<Integer>> adjList, int i, boolean[] isVisit){
        isVisit[i] = true;

        for(int num : adjList.get(i)){
            if(!isVisit[num]){
                dfs(adjList, num, isVisit);
            }
        }
    }
}
