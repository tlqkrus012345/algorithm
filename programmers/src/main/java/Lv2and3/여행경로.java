package Lv2and3;
import java.util.*;
public class 여행경로 {
    boolean[] visit;
    ArrayList<String>list = new ArrayList<>();
    public String[] solution(String[][] tickets) {
        visit = new boolean[tickets.length];
        Arrays.sort(tickets, new Comparator<String[]>(){
            public int compare(String[] o1, String[] o2){
                return o1[1].compareTo(o2[1]);
            }
        });
        dfs(tickets,"ICN","ICN",0);
        String[] answer = list.get(0).split(" ");
        return answer;
    }
    public void dfs(String[][] tickets, String start, String path ,int depth){

        if (depth == tickets.length){
            list.add(path);
            return;
        }

        for (int i=0; i<tickets.length; i++){
            if (start.equals(tickets[i][0]) && visit[i]==false){
                visit[i] = true;
                dfs(tickets, tickets[i][1] ,path+" "+tickets[i][1] ,depth+1);
                visit[i] = false;
            }
        }
    }

}
