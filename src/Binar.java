import java.util.Arrays;

public class Binar {
    public static int binarySearch(int[] arr,int t){
        int start = 0;
        int mid;
        int end = arr.length - 1;
        while (start <= end) {
            mid = (start + end) / 2;
            if (arr[mid] == t) {
                return mid;
            } else if (t< arr[mid]) {
                end=mid-1;
            } else {
                start = mid +1;
            }
        }

        return -1;
    }
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7};
        int t = 6;
        int b=binarySearch(arr,t);
        System.out.println(b);
    }
}