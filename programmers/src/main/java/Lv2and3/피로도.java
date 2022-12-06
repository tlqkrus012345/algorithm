package Lv2and3;

public class 피로도 {
    boolean[] visit;
    int answer = 0;
    public int solution(int k, int[][] dungeons) {
        visit = new boolean[dungeons.length];
        dfs(dungeons, k, 0);
        return answer;
    }
    public void dfs(int[][] dungeons, int k, int depth) {
        for(int i=0; i< dungeons.length; i++) {
            if(!visit[i] && k >= dungeons[i][0]) {
                visit[i] =true;
                dfs(dungeons, k - dungeons[i][1], depth+1);
                visit[i] = false;
            }
        }
        answer = Math.max(answer, depth);
    }
    public static void main(String[] args) {
        피로도 ps = new 피로도();
        System.out.println(ps.solution(80,new int[][]{{80,30},{40,30},{20,10}}));
    }
}
