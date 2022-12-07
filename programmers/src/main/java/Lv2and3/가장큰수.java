package Lv2and3;
import java.util.*;
public class 가장큰수 {
    public String solution(int[] numbers) {
        String answer = "";
        String[] num = new String[numbers.length];
        for (int i=0; i<numbers.length; i++) {
            num[i] = String.valueOf(numbers[i]);
        }/**
         List<Integer> list = new ArrayList<>();
         Collections.sort(list, (a,b) -> {
            String as = String.valueOf(a), bs = String.valueOf(b);
            return -Integer.compare(Integer.parseInt(as+bs),Integer.parseInt(bs+as));
         list 순서대로 2개의 요소를 추출하고
         String as,bs로 a,b를 만들어준다
         Integer.compare()는 x==y 0 반환, x<y -, x>y +를 반환
         Integer.compare()로부터 나온 연산 결과를 Collections.sort() 내부의 comparator에서 사용한다
         comparator는 음수는 오름차순, 양수는 내림차순
         */
        Arrays.sort(num, new Comparator<String>(){
            public int compare(String a, String b) {
                return (b+a).compareTo(a+b);
            }
        });
        if (num[0].equals("0")) return "0";
        for (String a : num) {
            answer += a;
        }
        return answer;
    }
}

