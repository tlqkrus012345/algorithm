package sort;

import java.util.Arrays;

/**
 * 병합정렬
 * 분할 정복을 통해 비교 정렬한다.
 * 퀵정렬과의 차이점은 퀵정렬은 각 요소를 피벗과 비교하여 요소를 정렬하는데
 * 병합정렬은 배열을 하나의 요소가 남을 때가지 두 개의 하위 배열로 반복하여 나눈다
 * 퀵은 피벗을 통해 정렬하고 분할 병합은 분할하고 정렬 그리고 병합
 * 시간복잡도는 O(nlogn)
 */
public class MergeSort {
    static int[] tmp;
    public static void main(String[] args) {
        int[] arr = {2,3,4,5,1};
        mergeSort(arr);
        System.out.println(Arrays.toString(arr));
    }
    public static void mergeSort(int[] arr) {
        tmp = new int[arr.length];
        mergeSort(arr, 0, arr.length-1);
    }
    public static void mergeSort(int[] arr, int start, int end) {
        if(start < end) {
            int mid = (start + end) / 2;
            mergeSort(arr, start, mid);
            mergeSort(arr, mid+1, end);
            merge_Sort(arr, start, mid, end);
        }
    }
    public static void merge_Sort(int[] arr, int start, int mid, int end) {
        int i = start;
        int j = mid+1;
        int key = start;

        while(i<=mid && j<=end) {
            if(arr[i] <= arr[j]) {
                tmp[key] = arr[i];
                i++;
            }else {
                tmp[key] = arr[j];
                j++;
            }
            key++;
        }
        if(i > mid) {
            for (int k = j; k <= end; k++) {
                tmp[key] = arr[k];
                k++;
            }
        }else{
            for(int k=i; k<=mid; k++) {
                tmp[key] = arr[k];
                k++;
            }
        }
        for(int k=start; k<=end; k++) {
            arr[k] = tmp[k];
        }
    }
}
