import java.util.*;
public class 신고결과받기 {
    public int[] solution(String[] id_list, String[] report, int k) {
        int[] answer = new int[id_list.length];
        HashSet<String>reportlist = new HashSet<>();
        for(String a : report){
            reportlist.add(a);
        }
        HashMap<String, ArrayList<String>> whoreport = new HashMap<>();
        for(String a : reportlist){
            int blank = a.indexOf(" ");
            String reporter = a.substring(0,blank);
            String reported = a.substring(blank+1);
            ArrayList<String>reporterlist = whoreport.getOrDefault(reported,null);
            if(reporterlist == null) reporterlist = new ArrayList<>();
            reporterlist.add(reporter);
            whoreport.put(reported,reporterlist);
        }
        HashMap<String,Integer> map = new HashMap<>();
        for(ArrayList<String> a : whoreport.values()){
            if(a.size()>=k){
                for(String b : a){
                    map.put(b, map.getOrDefault(b,0)+1);
                }
            }
        }
        for(int i=0; i<id_list.length; i++){
            answer[i] = map.getOrDefault(id_list[i],0);
        }
        return answer;
    }

    public static void main(String[] args) {
        신고결과받기 ps = new 신고결과받기();
        System.out.println(ps.solution(new String[]{"muzi","frodo"},new String[]{"muzi frodo", "apeach frode"},2));
    }
}
