package sort;

import java.util.Arrays;

public class ComparisonSort {
    /**
     * 거품정렬
     * 인접한 두 개의 데이터를 비교하면서 정렬한다.
     * 시간복잡도는 항상 O(N^2)이다.
     */
    public static void BubbleSort(int[] arr) {
        for(int i=0; i<arr.length; i++) {
            for(int j=0; j<arr.length-1; j++) {
                if(arr[j] > arr[j+1]) {
                    swap(arr, j, j+1);
                }
            }
        }
    }

    /**
     * 선택정렬
     * 가장 작은 데이터를 선택해 맨 앞으로 정렬한다.
     * 시간복잡도는 항상 O(N^2)이다.
     */
    public static void SelectionSort(int[] arr) {
        for(int i=0; i<arr.length; i++) {
            int minIndex = i;
            for(int j=i+1; j<arr.length; j++) {
                if(arr[j] < arr[minIndex]) {
                    minIndex = j;
                }
            }
            swap(arr, i, minIndex);
        }
    }

    /**
     * 삽입정렬
     * 모든 요소를 앞에서부터 차례대로 이미 정렬된 배열 부분과 비교하여
     * 자신의 위치를 찾아 삽입한다.
     * 시간복잡도는 O(N^2) , O(N)
     */
    public static void InsertionSort(int[] arr) {
        for(int i=1; i<arr.length; i++) {
            for(int j=i; j>0; j--) {
                if(arr[j] < arr[j-1]) {
                    swap(arr, j, j-1);
                }
                else break;
            }
        }

    }
    public static void swap(int[] arr, int i, int j) {
        int tmp = arr[i];
        arr[i] = arr[j];
        arr[j] = tmp;
    }

    public static void main(String[] args) {
        int[] arr = {3,2,4,1};
        ComparisonSort cs = new ComparisonSort();
        cs.InsertionSort(arr);
        System.out.println(Arrays.toString(arr));
    }
}
