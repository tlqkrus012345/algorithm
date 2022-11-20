import java.util.*;

public class 캐시 {
    public int solution(int cacheSize, String[] cities) {
        int answer = 0;
        ArrayList<String> cache = new ArrayList<>();
        if (cacheSize == 0) {
            answer = cities.length * 5;
        } else {
            for (int i = 0; i < cities.length; i++) {
                String s = cities[i].toUpperCase();
                if (cache.remove(s)) {
                    answer += 1;
                    cache.add(s);
                } else {
                    answer += 5;
                    if (cache.size() >= cacheSize) {
                        cache.remove(0);
                    }
                    cache.add(s);
                }
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        캐시 ps = new 캐시();
        System.out.println(ps.solution(3, new String[]{"Jeju","Pangyo","Seoul","NewYork","LA","Jeju","Seoul"}));
    }
}
