import java.util.Arrays;
import java.util.Scanner;

/**
 * 크루스칼 알고리즘
 * 그리디한 선택을 바탕으로 그래프에서 최소 비용 신장 부분 트리를 찾는 알고리즘
 * 모든 정점를 최소 비용으로 연결, 음의 간선은 적용이 안된다
 */
public class Kruskal {
    public static int V,E;
    public static int[][] graph;
    public static int[] parent;
    public static int final_cost;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        V = sc.nextInt();
        E = sc.nextInt();

        graph = new int[E][3];
        parent = new int[V];
        final_cost = 0;

        for(int i=0; i<E; i++) {
            graph[i][0] = sc.nextInt();
            graph[i][1] = sc.nextInt();
            graph[i][2] = sc.nextInt();
        }

        Arrays.sort(graph, (o1,o2) -> Integer.compare(o1[2],o2[2]));

        for(int i=0; i<V; i++) {
            parent[i] = i;
        }
        for(int i=0; i<E; i++) {
            if(find(graph[i][0]-1)!=find(graph[i][1]-1)) {
                System.out.println("선택된 간선");
                System.out.println(Arrays.toString(graph[i]));
                union(graph[i][0]-1,graph[i][1]-1);
                final_cost += graph[i][2];
                System.out.println("각 노드가 가르키는 부모");
                System.out.println(Arrays.toString(parent));
                continue;
            }
        }
    }
    public static int[] makeSet(int size) {
        int [] arr = new int[size+1];
        for(int i=0; i<size+1; i++) {
            arr[i] = i;
        }
        return arr;
    }
    public static int find(int a) {
        if(parent[a]==a)
            return a;
        else
            return find(parent[a]);
    }
    public static void union( int a ,int b) {
        a = find(a);
        b = find(b);
        if(a>b) {
            parent[a]=b;
        }
        else {
            parent[b]=a;
        }
    }


}
