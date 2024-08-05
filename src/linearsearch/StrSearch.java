package bi;

import java.util.Scanner;


class StrSearch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the size of the array ");
        int size = sc.nextInt();
        String[] arr = new String[size];
        for (int i = 0; i <size ; i++) {
            System.out.println("enter the string for the index " + i);
            arr[i]= sc.next();
        }
        sc.nextLine();

        System.out.println("enter the target string ");
        String tar = sc.nextLine();
        int result = search(arr,size,tar);
        if (result == -1) {
            System.out.println("the required string is not there in the array");

        }
        else {
            System.out.println("the index for the target string is: " + result);
        }


    }
    public static int search(String[] arr, int n, String r){
        for (int i = 0; i < n; i++) {
            if (arr[i].equals(r)) {
                return i;
            }
        }

        return -1;
    }
}
