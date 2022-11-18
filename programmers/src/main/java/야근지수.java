import java.util.Collections;
import java.util.PriorityQueue;

public class 야근지수 {
    public long solution(int n, int[] works) {
        PriorityQueue<Integer> overtime = new PriorityQueue<>(Collections.reverseOrder());

        for (int i : works) {
            overtime.offer(i);
        }

        for (int i = 0; i < n; i++) {
            int max = (int)overtime.poll();
            if (max <= 0) break;
            overtime.offer(max - 1);
        }

        long sum = 0;

        for(int i : overtime) {
            sum += Math.pow(i,2);
        }
        return sum;
    }

    public static void main(String[] args) {
        야근지수 ps = new 야근지수();
        System.out.println(ps.solution(2, new int[]{3,2,3}));
    }
}
