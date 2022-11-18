package sort;

import java.util.Arrays;

/**
 * 퀵정렬
 * 분할 정복 방법을 통해 비교 정렬을 한다.
 * 시간복잡도는 O(nlogn) , O(n^2)(피벗 값이 최소나 최대값으로 지정되면)
 */
public class QuickSort {
    public static void main(String[] args) {
        int[] arr = {2,3,1,4,5,2};
        quickSort(arr);
        System.out.println(Arrays.toString(arr));
    }
    public static void quickSort(int[] arr){
        quickSort(arr, 0, arr.length-1);
    }
    public static void quickSort(int[] arr, int start, int end) {
        if(start >= end) {
            return;
        }
        int pivot = partition(arr, start, end);
        quickSort(arr, start, pivot-1);
        quickSort(arr, pivot+1, end);
    }
    public static int partition(int[] arr, int left, int right) {
        int start = left;
        int end = right;
        int pivot = arr[left];
        while(start < end) {
            while(arr[end] > pivot && start < end) {
                end--;
            }
            while(arr[start] <= pivot && start < end) {
                start++;
            }
            swap(arr, start, end);
        }
        swap(arr, left, end);
        return end;
    }

    public static void swap(int[] arr, int i, int j) {
        int tmp = arr[i];
        arr[i] = arr[j];
        arr[j] = tmp;
    }
}
