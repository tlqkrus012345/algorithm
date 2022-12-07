package Lv2and3;
import java.util.*;
public class 다리를지나는트럭 {
    public int solution(int bridge_length, int weight, int[] truck_weights) {
        int answer = 0;
        int truck_sum = 0;
        Queue<Integer> q = new LinkedList<>();
        for (int a : truck_weights) {
            while (true) {
                if (q.isEmpty()) {
                    q.offer(a);
                    truck_sum += a;
                    answer++;
                    break;
                } else if (q.size() == bridge_length) {
                    truck_sum -= q.poll();
                } else {
                    if (truck_sum + a <= weight) {
                        q.offer(a);
                        truck_sum += a;
                        answer++;
                        break;
                    } else {
                        q.offer(0);
                        answer++;
                    }
                }
            }
        }
        return answer + bridge_length;
    }

    public static void main(String[] args){
    }
}
