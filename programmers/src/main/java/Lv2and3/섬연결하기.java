package Lv2and3;
import java.util.*;
public class 섬연결하기 {
    int[] parent;
    public int solution(int n, int[][] costs) {
        int answer = 0;
        parent = new int[n];
        for(int i=0; i<n; i++){
            parent[i] = i;
        }
        Arrays.sort(costs, new Comparator<int[]>(){
            public int compare(int[] o1, int[] o2){
                return o1[2]-o2[2];
            }
        });
        for(int i=0; i<costs.length; i++){
            if(find(costs[i][0]) != find(costs[i][1])){
                union(costs[i][0],costs[i][1]);
                answer += costs[i][2];
            }
        }
        return answer;
    }
    public int find(int x){
        if(parent[x]==x){
            return x;
        }
        else{
            return find(parent[x]);
        }
    }
    public void union(int x, int y){
        x = find(x);
        y = find(y);
        if(x>y) parent[x] = y;
        else{
            parent[y] = x;
        }
    }

    public static void main(String[] args) {
        섬연결하기 ps = new 섬연결하기();
        System.out.println(ps.solution(4, new int[][]{{0,1,1},{0,2,2},{1,2,5}}));
    }

}
