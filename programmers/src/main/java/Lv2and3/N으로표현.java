package Lv2and3;

public class N으로표현 {

    int answer = 9;

    public int solution(int N, int number) {
        dfs(N, number, N, 0);
        return answer;
    }

    public void dfs(int N, int number, int sum, int depth) {
        if (sum == number) {
            answer = Math.min(answer, depth);
            return;
        }
        if (depth > 8) {
            answer = -1;
            return;
        }
        dfs(N, number, sum + N, depth + 1);
        dfs(N, number, sum - N, depth + 1);
        dfs(N, number, sum * N, depth + 1);
        dfs(N, number, sum / N, depth + 1);
        dfs(N, number, sum * 10 + N, depth + 1);
    }
}


