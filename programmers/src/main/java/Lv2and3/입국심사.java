package Lv2and3;

import java.util.Arrays;

public class 입국심사 {
    public long solution(int n, int[] times) {
        Arrays.sort(times);
        long start = 0;
        long end = (long) n * times[times.length - 1];
        long result = 0;
        while(start<=end){
            long total = 0;
            long mid = (start+end)/2;
            for(int i=0; i<times.length; i++){
                total += mid/times[i] ;
            }

            if(total < n){
                start = mid +1;

            }
            else{
                end = mid-1;
                result = mid;
            }

        }
        return result;

    }

    public static void main(String[] args) {
        입국심사 ps = new 입국심사();
        System.out.println(ps.solution(6, new int[]{7,28}));
    }
}
