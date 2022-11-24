public class 이진변환반복하기 {
    public int[] solution(String s) {
    int[] answer = new int[2];

        while(!s.equals("1")){
        for(char a : s.toCharArray()){
            if(a == '0') answer[1]++;
        }
        s = s.replace("0","");
        int len = s.length();
        s = Integer.toBinaryString(len);
        answer[0]++;
        }
        return answer;
    }
}
