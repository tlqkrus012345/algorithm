import java.util.*;
public class 이중우선순위큐 {
    public int[] solution(String[] operations) {

        List<Integer> list = new ArrayList<>();
        for(String a : operations){
            String operation = a.substring(0,1);
            String number = a.substring(2);
            System.out.println(operation+" "+number);
            if(operation.equals("I")){
                list.add(Integer.parseInt(number));
            }
            if(operation.equals("D")){
                if(!list.isEmpty() && number.startsWith("-")){
                    Collections.sort(list);
                    list.remove(0);
                }
                if(!list.isEmpty() && !number.startsWith("-")){
                    Collections.sort(list);
                    list.remove(list.size()-1);
                }
            }
            System.out.println(list.toString());
        }
        if(list.size() == 0){
            return new int[]{0,0};
        }
        Collections.sort(list);
        int[] answer = new int[2];
        answer[1] = (list.get(0));
        answer[0] = (list.get(list.size()-1));

        return answer;
    }

    public static void main(String[] args) {
        이중우선순위큐 ps = new 이중우선순위큐();
    }
}
