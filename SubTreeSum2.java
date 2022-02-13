public abstract class SubTreeSum.javaPart2 {
    int time = 0;
    int lt = new length[n+1];
    static void dfs(int node, int p){
        start[node] = ++time;
        lt[time] = val;
        for(int c : adj[node]){
            if(c != p)dfs(c,node);
        }
        end[node] = time;
    }
}
