package Lv2and3;

public class 등굣길 {
    public int solution(int m, int n, int[][] puddles) {
        int[][] map = new int[n+1][m+1];
        for(int[] p : puddles) {
            map[p[1]][p[0]] = -1;
        }
        map[1][1] = 1;
        for(int i=1; i<n+1; i++) {
            for(int j=1; j<m+1; j++) {
                if(map[i][j] == -1) continue;
                if(map[i-1][j] > 0) map[i][j] += map[i-1][j] % 1000000007;
                if(map[i][j-1] > 0) map[i][j] += map[i][j-1] % 1000000007;
            }
        }
        return map[n][m] % 1000000007;
    }

    public static void main(String[] args) {
        등굣길 ps = new 등굣길();
        System.out.println(ps.solution(4,3,new int[][]{{2,2}}));
    }
}
