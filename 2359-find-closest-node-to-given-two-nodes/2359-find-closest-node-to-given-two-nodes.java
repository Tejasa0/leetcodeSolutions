class Solution {
    public int closestMeetingNode(int[] edges, int node1, int node2) {
        int n = edges.length;
        int node1Dist[] = new int[n];
        int node2Dist[] = new int[n];
        bfs(node1Dist, node1, edges);
        bfs(node2Dist, node2, edges);

        int ans = -1;
        int minDistTillNow = Integer.MAX_VALUE;
        for (int currNode = 0; currNode < n; currNode++) {
            if (minDistTillNow > Math.max(node1Dist[currNode], node2Dist[currNode])) {
                ans = currNode;
                minDistTillNow = Math.max(node1Dist[currNode], node2Dist[currNode]);
            }
        }

        return ans;
    }

    public void bfs(int nodeDist[], int node, int edges[]) {
        Queue<Integer> q = new LinkedList<>();
        Arrays.fill(nodeDist, Integer.MAX_VALUE);
        Boolean visited[] = new Boolean[edges.length];
        Arrays.fill(visited, Boolean.FALSE);
        //visited[node] = true;
        q.offer(node);
        nodeDist[node] = 0;
        while (!q.isEmpty()) {
            int currNode = q.poll();
            if (visited[currNode])
                continue;
            visited[currNode] = true;
            int neigh = edges[currNode];
            if (neigh != -1 && !visited[neigh]) {
                nodeDist[neigh] = nodeDist[currNode] + 1;
                q.offer(neigh);
            }
        }
    }
}