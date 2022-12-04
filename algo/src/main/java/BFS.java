import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class BFS {
    public static boolean[] visit;
    public static ArrayList<ArrayList<Integer>> graph = new ArrayList<>();

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int node = sc.nextInt();
        visit = new boolean[node];

        for(int i=0; i<node; i++) {
            graph.add(new ArrayList<>());
        }

        graph.get(1).add(2);
        graph.get(1).add(4);

        graph.get(2).add(1);
        graph.get(2).add(5);

        graph.get(3).add(7);

        bfs(1);
    }
    public static void bfs(int start) {
        Queue<Integer> q = new LinkedList<>();
        visit[start] = true;
        q.offer(start);
        while(!q.isEmpty()) {
            int x = q.poll();
            System.out.print(x+" ");
            for(int i=0; i<graph.get(x).size(); i++) {
                int y = graph.get(x).get(i);
                if(!visit[y]) {
                    visit[y] = true;
                    q.offer(y);
                }
            }
        }
    }
}
/**
 * 루트 노드 혹은 임의 노드에서 인접한 노드부터 먼저 탐색한다
 * 큐를 통해 구현하며 최소 비용으로 탐색하는 경우에 적합하다
 * 시간복잡도는 행렬 O(v^2) 리스트 O(V+E)
 */