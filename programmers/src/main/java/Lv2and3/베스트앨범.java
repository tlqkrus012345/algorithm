package Lv2and3;
import java.util.*;
import java.util.Map.*;
public class 베스트앨범 {
    public int[] solution(String[] genres, int[] plays) {
        HashMap<String,HashMap<Integer,Integer>> map = new HashMap<>();
        for (int i=0; i<genres.length; i++) {
            map.put(genres[i], new HashMap<Integer, Integer>());
        }

        for (int i=0; i<genres.length; i++) {
            map.get(genres[i]).put(i,plays[i]);
        }
        HashMap<String, Integer> mostGenres = new HashMap<>();
        int sum = 0;
        for (Entry<String, HashMap<Integer, Integer>> entry1 : map.entrySet()) {
            for (Entry<Integer, Integer> entry2 : entry1.getValue().entrySet()) {
                sum = sum + entry2.getValue();
            }
            mostGenres.put(entry1.getKey(), sum);
            sum = 0;
        }
        List<Map.Entry<String, Integer>> list = new LinkedList<Map.Entry<String, Integer>>(mostGenres.entrySet());
        Collections.sort(list, (o1,o2) -> o2.getValue().compareTo(o1.getValue()));
        List<Integer> answer = new ArrayList<>();
        for (int i=0; i<map.size(); i++) {
            List<Map.Entry<Integer, Integer>> list2 = new LinkedList<Map.Entry<Integer,Integer>>(map.get(list.get(i).getKey()).entrySet());
            Collections.sort(list2, (o1,o2) -> o2.getValue().compareTo(o1.getValue()));

            if (list2.size() == 0) {
                continue;
            }
            if (list.size() >= 2) {
                for (int j=0; j<2; j++) {
                    answer.add(list2.get(j).getKey());
                }
            }
            if (list.size() == 1) {
                answer.add(list2.get(0).getKey());
            }

        }
        return answer.stream().mapToInt(i ->i).toArray();
    }

    public static void main(String[] args) {

    }
}


