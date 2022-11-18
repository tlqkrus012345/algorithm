import java.util.ArrayList;
import java.util.Scanner;

public class DFS {
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

        dfs(1);
    }
    public static void dfs(int start) {
        visit[start] = true;
        System.out.print(start+ " ");
        for(int i=0; i<graph.get(start).size(); i++) {
            int end = graph.get(start).get(i);
            if(!visit[end]) {
                dfs(end);
            }
        }
    }

}
/**
 * 루트 노드 혹은 임의 노드에서 다음 브랜치로 넘어가기 전에 해당 브랜치를 모두 탐색하는 방법
 * 스택 or 재귀함수를 통해 구현되며 모든 경로를 방문해야 할 경우에 적합하다.
 * 시간 복잡도는 행렬 O(V^2) 리스트 O(V+E)
 */