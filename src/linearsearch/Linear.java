package linearsearch;
import java.util.Scanner;
public class Linear {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the size of the array: ");
        int size = sc.nextInt();
        int[] arr;
        arr = new int[size];
        for (int i = 0;i<size;i++){
            System.out.println("enter the value for the array index: " + i);
            arr[i] = sc.nextInt();
        }
        System.out.println("enter the target value");
        int tar = sc.nextInt();
        int result = Linear.searchh(arr,size,tar);
        if (result == -1){
            System.out.println("the target value is not existing in the array");

        }
        else {
            System.out.println("the target value is at : " + result);
        }




    }

    public static int searchh(int[] arr, int n, int x){
        for (int i =0;i<n;i++){
            if (x == arr[i]){
                return i;
            }
        }
        return -1;
    }

}
