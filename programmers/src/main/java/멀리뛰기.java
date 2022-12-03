public class 멀리뛰기 {
    long[] d;
    public long solution(int n) {
        long answer = 0;
        d = new long[n+1];
        d[0]=1;
        d[1]=1;
        return rec(n);
    }
    public long rec(int n){
        if(d[n] != 0) return d[n];


        else{
            d[n] = rec(n-1) + rec(n-2);
            return d[n]%1234567;
        }

    }

    public static void main(String[] args) {

    }
}
