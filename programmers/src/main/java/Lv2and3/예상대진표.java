package Lv2and3;

public class 예상대진표 {
    public int solution(int n, int a, int b)
    {
        int answer = 0;
        while(a != b){
            a = (int)match(a);
            b = (int)match(b);
            answer++;
        }


        return answer;
    }
    public long match (int x){
        return Math.round(x/2.0);
    }

    public static void main(String[] args) {

    }
}
