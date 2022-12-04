public class FloydWarshall {
    /**
     * 음수 사이클이 없는 그래프에서 모든 정점에서 모든 정점으로의 최단 거리를 구하는 알고리즘
     * 시간복잡도는 O(n^3)
     */
    public static void main(String[] args) {
        int N = 4; // 정점의 수
        int[][] D = {{0, 2, 0, 15}, // 인접 행렬
                     {0, 0, 10, 4},
                     {3, 0, 0, 0},
                     {0, 0, 7, 0}};
        for (int i=0; i<N; i++) {
            for (int j=0; j<N; j++) {
                if(i==j) continue;
                if(D[i][j] == 0) D[i][j] = 1000000;
            }
        }
        // 플로이드 와샬
        for (int k = 0; k < N; k++) {  // 경유 노드 확인
            for (int i = 0; i < N; i++) {  // 출발지
                if (i == k) continue;  // 출발지와 경유지가 같으면 다음 탐색
                for (int j = 0; j < N; j++) {  // 도착지
                    if (j == i || j == k) continue;  // 출발지와 도착지가 같거나 도착지가 경유지이면 다음 탐색
                    D[i][j] = Math.min(D[i][k] + D[k][j], D[i][j]);  // 경유하거나 직접가거나 더 짧은 경로로 대체
                }
            }
        }
    }
}
