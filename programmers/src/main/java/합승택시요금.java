import java.util.ArrayList;
import java.util.Arrays;
import java.util.PriorityQueue;


public class 합승택시요금 {
    class Node implements Comparable<Node>{
        int index;
        int cost;
        Node(int index, int cost){
            this.index = index;
            this.cost = cost;
        }
        @Override
        public int compareTo(Node e){
            return this.cost - e.cost;
        }
    }

    static final int MAX = 20000001; // 200 * 100000 + 1
    static ArrayList<ArrayList<Node>> graph;

    public int solution(int n, int s, int a, int b, int[][] fares) {
        int answer = Integer.MAX_VALUE;

        graph = new ArrayList<>();
        for(int i = 0 ; i <= n ; i ++){
            graph.add(new ArrayList<>());
        }

        for(int[] i : fares){
            graph.get(i[0]).add(new Node(i[1], i[2]));
            graph.get(i[1]).add(new Node(i[0], i[2]));
        }

        int[] startA = new int[n + 1];
        int[] startB = new int[n + 1];
        int[] start = new int[n + 1];

        Arrays.fill(startA, MAX);
        Arrays.fill(startB, MAX);
        Arrays.fill(start, MAX);

        startA = dijkstra(a, startA);
        startB = dijkstra(b, startB);
        start = dijkstra(s, start);

        for(int i = 1; i <= n ; i ++) answer = Math.min(answer, startA[i] + startB[i] + start[i]);
        return answer;
    }

    int[] dijkstra (int start, int[] costs) {
        PriorityQueue<Node> pq = new PriorityQueue<>();
        pq.offer(new Node(start, 0));
        costs[start] = 0;

        while (!pq.isEmpty()) {
            Node now = pq.poll();
            int nIndex = now.index;
            int nCost = now.cost;

            if(nCost > costs[nIndex]) continue;

            ArrayList<Node> nodes = graph.get(nIndex);
            for (Node edge : nodes) {
                int cost = costs[nIndex] + edge.cost;

                if (cost < costs[edge.index]) {
                    costs[edge.index] = cost;
                    pq.offer(new Node(edge.index, cost));
                }
            }
        }
        return costs;
    }

    public static void main(String[] args) {
        합승택시요금 ps = new 합승택시요금();
        System.out.println();
    }
}