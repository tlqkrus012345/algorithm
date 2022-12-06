package Lv2and3;

import java.util.*;
public class 귤고르기 {
    public int solution(int k, int[] tangerine) {
        int answer = 0;
        HashMap<Integer, Integer> map = new HashMap<>();
        List<Integer> list = new ArrayList<>();
        for (int i=0; i<tangerine.length; i++) {
            map.put(tangerine[i], map.getOrDefault(tangerine[i],0)+1);
        }
        List<Map.Entry<Integer,Integer>> entryList = new LinkedList<>(map.entrySet());
        entryList.sort( (o1,o2) -> (map.get(o2.getKey()))-map.get(o1.getKey()));
        for (Map.Entry<Integer, Integer> entry : entryList) {
            if (entry.getValue() >= k) {
                list.add(entry.getKey());
                break;
            }
            if (entry.getValue() < k) {
                list.add(entry.getKey());
                k = k - entry.getValue();
            }
        }
        return list.size();
    }
    public static void main(String[] args) {
        귤고르기 ps = new 귤고르기();
        System.out.println(ps.solution(6,new int[]{1,3,2,4,5,2,3}));
    }

}
