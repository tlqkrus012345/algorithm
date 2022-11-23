public class 땅따먹기 {
    int solution(int[][] land) {
        for(int i=1; i<land.length; i++) {
            land[i][0] += maxNum(land[i-1][1],land[i-1][2],land[i-1][3]);
            land[i][1] += maxNum(land[i-1][0],land[i-1][2],land[i-1][3]);
            land[i][2] += maxNum(land[i-1][0],land[i-1][1],land[i-1][3]);
            land[i][3] += maxNum(land[i-1][0],land[i-1][1],land[i-1][2]);
        }
        int len = land.length-1;
        return Math.max(land[len][0],maxNum(land[len][1],land[len][2],land[len][3]));
    }
    public int maxNum(int a, int b, int c) {
        return Math.max(a,Math.max(b,c));
    }

    public static void main(String[] args) {
        땅따먹기 ps = new 땅따먹기();
        System.out.println(ps.solution(new int[][]{{1,2,3,5},{5,6,7,8},{4,3,2,1}}));
    }
}
