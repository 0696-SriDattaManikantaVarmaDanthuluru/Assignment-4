package bi;

import java.util.ArrayList;
import java.util.Scanner;

public class Firstocc {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("enter the size of the arraylist ");
        int size = sc.nextInt();
        
        ArrayList<Integer> arra = new ArrayList<>();

        for (int i = 0; i <size ; i++) {

            System.out.println("enter the num for the index " + i);

            arra.add(sc.nextInt());
        }

        System.out.println("enter the target string ");

        int tar = sc.nextInt();

        int result = search(arra,size,tar);

        if (result == -1) {
            System.out.println("the required string is not there in the array");
        }

        else {
                System.out.println("the index for the target string is: " + result);
        }



    }
    public static int search(ArrayList<Integer> arra, int n, int r){
        for (int i = 0; i < n; i++) {
            if (arra.get(i).equals(r)) {
                return i;
            }
        }

        return -1;
    }

}
