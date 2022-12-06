package Lv2and3;

public class 단어변환 {
    int answer = 0;
    boolean[] visit;
    public int solution(String begin, String target, String[] words) {
        visit = new boolean[words.length];
        dfs(begin, target, words, 0);
        return answer;
    }
    public void dfs(String begin, String target, String[] words, int depth) {
        if(begin.equals(target)) {
            answer = depth;
            return;
        }
        for(int i=0; i<words.length; i++) {
            int cnt = 0;
            if(visit[i]) continue;
            for(int j=0; j<words[i].length(); j++) {
                if (begin.charAt(j) == words[i].charAt(j)) {
                    cnt++;
                }
            }
            if(cnt == begin.length()-1) {
                visit[i] = true;
                dfs(words[i], target, words, depth+1);
                visit[i] = false;
            }
        }

    }

    public static void main(String[] args) {
        단어변환 ps = new 단어변환();
        System.out.println(ps.solution("hit","cog",new String[]{"hot","dog","lot","log","cog"}));
    }
}
