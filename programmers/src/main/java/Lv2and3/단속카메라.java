package Lv2and3;

import java.util.Arrays;

public class 단속카메라 {
    public int solution(int[][] routes) {
        int answer = 0;
        int prev = Integer.MIN_VALUE;
        Arrays.sort(routes, (a,b) -> Integer.compare(a[1],b[1]));
        System.out.println(Arrays.deepToString(routes));
        for(int[] r : routes) {
            if(prev < r[0]) {
                prev = r[1];
                answer++;
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        단속카메라 ps = new 단속카메라();
        System.out.println(ps.solution(new int[][]{{-20,-15},{-14,-5},{-18,-13},{-5,-3}}));
    }
}
