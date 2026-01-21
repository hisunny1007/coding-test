class Solution {
    static boolean[] visited;
    
    public int solution(int n, int[][] computers) {
       
        visited = new boolean[n];
        int count = 0;
        
        for(int i = 0; i < n; i++) {
            if(!visited[i]) {
                dfs(i, computers);
                count++;
            }
        }
        return count;
    }
    
    static void dfs(int node, int[][] computers) {
        visited[node] = true;
        
        for(int i = 0; i < computers.length; i++) {
            if(computers[node][i] == 1 && !visited[i]) {
                dfs(i, computers);
            }
        }
    }
}