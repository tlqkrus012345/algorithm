import java.util.*;
public class 더맵게 {
    public int solution(int[] scoville, int K) {
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        for (int a : scoville) {
            pq.offer(a);
        }
        int answer = 0;

        while (pq.peek() < K) {
            if(pq.size() < 2) {
                return -1;
            }
            int f = pq.poll();
            int s = pq.poll();
            int sum = f + s*2;
            pq.offer(sum);
            answer++;
        }

        return answer;
    }

    public static void main(String[] args) {
        더맵게 ps = new 더맵게();
        System.out.println(ps.solution(new int[]{1,2,3,4,9}, 7));
    }
}
