package Lv2and3;
import java.util.*;
public class 튜플 {
    public int[] solution(String s) {
        s = s.replace("{","");
        String[] arr  = s.split("}");
        Arrays.sort(arr, new Comparator<String>(){
            public int compare(String o1, String o2){
                return o1.length() - o2.length();
            }
        });
        for (int i=0; i<arr.length; i++){
            String tmp = arr[i];
            if (tmp.charAt(0)==','){
                tmp = tmp.substring(1);
                arr[i] = tmp;
            }
        }
        ArrayList<String> list = new ArrayList<>();

        for (int i=0; i<arr.length; i++){
            String[] tmp = arr[i].split(",");
            for (String a : tmp){
                if (!list.contains(a)){
                    list.add(a);
                }
            }
        }

        int[] answer = new int[list.size()];
        for (int i=0; i<list.size(); i++){
            answer[i] = Integer.parseInt(list.get(i));
        }
        return answer;
    }

    public static void main(String[] args) {
        튜플 ps = new 튜플();
        System.out.println(ps.solution("{{2},{2,1},{2,1,3},{2,1,3,4}}"	));
    }
}
