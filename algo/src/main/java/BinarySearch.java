/**
 * 이진탐색
 * 정렬되어 있는 리스트에서 탐색 범위를 절반 씩 줄여가며 데이터를 탐색하는 방법
 * 시간복잡도 O(logN)
 * 순차탐색
 * 리스트 안에 있는 특정한 데이터를 찾기 위해 앞에서 부터 탐색하는 방법
 */
public class BinarySearch {
    public static void main(String[] args) {

    }
    public static int sequentialSearch(int n, String target, String[] arr) {
        for(int i=0; i<n; i++) {
            System.out.println(arr[i]);
            if(arr[i].equals(target)) {
                return i;
            }
        }
        return -1;
    }

    public static int binarySearch(int[] arr, int target, int start, int end) {
        if(start > end) {
            return -1;
        }
        int mid = (start + end) / 2;
        if(arr[mid] == target) {
            return mid;
        }else if(arr[mid] > target) {
            return binarySearch(arr, target, start, mid-1);
        }else {
            return binarySearch(arr, target, mid+1, end);
        }
    }

    public static int binarySearchFor(int[] arr, int target, int start, int end) {
        while(start <= end) {
            int mid = (start + end) / 2;
            if(arr[mid] == target) {
                return mid;
            }else if(arr[mid] > target) {
                end = mid -1;
            }else {
                start = mid +1;
            }
        }
        return -1;
    }
}
