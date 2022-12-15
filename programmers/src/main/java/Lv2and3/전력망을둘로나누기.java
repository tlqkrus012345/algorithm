package Lv2and3;
import java.util.*;
public class 전력망을둘로나누기 {
    public int solution(int n, int[][] wires) {
        int answer = n;

        int[][] graph = new int[n+1][n+1];
        for (int i=0; i<wires.length; i++){
            graph[wires[i][0]][wires[i][1]] = 1;
            graph[wires[i][1]][wires[i][0]] = 1;
        }
        for (int i=0; i<wires.length; i++){
            int a = wires[i][0];
            int b = wires[i][1];
            graph[a][b] = 0;
            graph[b][a] = 0;
            answer = Math.min(answer,bfs(n,graph,a));
            graph[a][b] = 1;
            graph[b][a] = 1;
        }
        return answer;
    }
    public int bfs(int n, int[][] graph, int start){
        boolean[] visit = new boolean[n+1];
        Queue <Integer> q = new LinkedList<>();
        q.offer(start);
        int cnt = 1;
        visit[start] = true;
        while (!q.isEmpty()){
            int now = q.poll();
            for ( int i=1; i<=n; i++){
                if (!visit[i] && graph[now][i]==1){
                    q.offer(i);
                    visit[i] = true;
                    cnt++;
                }
            }
        }
        return (int)Math.abs((n-cnt)-cnt);
    }

}
