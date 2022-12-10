package Lv2and3;
import java.util.*;
public class 뉴스클러스터링 {
    public int solution(String str1, String str2) {

        str1 = str1.toUpperCase();
        str2 = str2.toUpperCase();
        List<String> list1 = new ArrayList<>();
        List<String> list2 = new ArrayList<>();

        makeList(str1, list1);
        makeList(str2, list2);
        List<String> intersection = new ArrayList<>();
        List<String> union = new ArrayList<>();

        Collections.sort(list1);
        Collections.sort(list2);

        for (String word : list1) {
            if (list2.remove(word)) {
                intersection.add(word);
            }
            union.add(word);
        }
        for (String word : list2) {
            union.add(word);
        }

        if (union.size() == 0) {
            return 65536;
        }
        if (intersection.size() == 0) {
            return 0;
        }
        double cal = intersection.size() / (double)union.size();
        int answer = (int)Math.floor(cal * 65536);
        return answer;
    }
    public void makeList(String str, List<String> list) {
        for (int i=0; i<str.length()-1; i++) {

            if (Character.isAlphabetic(str.charAt(i)) && Character.isAlphabetic(str.charAt(i+1))){

                list.add(String.valueOf(str.charAt(i)).trim()+String.valueOf(str.charAt(i+1)).trim());
            }
        }
    }

    public static void main(String[] args) {

    }

}
