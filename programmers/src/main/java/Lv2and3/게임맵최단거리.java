package Lv2and3;

import java.util.*;
public class 게임맵최단거리 {
    class Node{
        int x,y,cost;
        public Node(int x, int y ,int cost){
            this.x = x;
            this.y = y;
            this.cost = cost;
        }
    }
    int[] nx = {1,0,-1,0};
    int[] ny = {0,1,0,-1};
    boolean[][] visit;
    public int solution(int[][] maps) {
        int answer = 0;
        int n = maps.length;
        int m = maps[0].length;
        visit = new boolean[n][m];

        return bfs(maps,n,m);
    }
    public int bfs(int[][] maps, int n, int m){
        Queue<Node>q=new LinkedList<>();
        q.offer(new Node(0,0,1));
        visit[0][0] = true;
        while(!q.isEmpty()){
            Node node = q.poll();
            if(node.x == n-1 && node.y == m-1) return node.cost;
            for(int i=0; i<4; i++){
                int dx = node.x + nx[i];
                int dy = node.y + ny[i];
                if(dx<n && dy<m && dx>=0 & dy>=0){
                    if(maps[dx][dy]==1 && visit[dx][dy]==false){
                        visit[dx][dy] = true;
                        q.offer(new Node(dx,dy,node.cost+1));
                    }
                }
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        게임맵최단거리 ps = new 게임맵최단거리();
        System.out.println(ps.solution(new int[][]{{1,0,1,1,1,1},{1,0,1,0,1},{1,0,1,1,1}}));
    }
}
