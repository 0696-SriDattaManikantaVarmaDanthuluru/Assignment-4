package linearsearch;

import java.util.ArrayList;
import java.util.Scanner;


public class Countocc {
    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);
        System.out.println("enter the size of the arraylist ");
        int size = sc.nextInt();


        ArrayList<Integer> arra = new ArrayList<>();

        for (int i = 0; i < size; i++) {
            System.out.println("enter the num for the index " + i);
            arra.add(sc.nextInt());
        }

        System.out.println("enter the target string ");

        int tar = sc.nextInt();

        int result = search(arra, size, tar);

        System.out.println("the index for the target string is: " + result);
    }
    public static int search(ArrayList<Integer> array, int len, int target){
        int count = 0;
        for (int i = 0;i<len;i++){
            if (array.get(i)== target){
                count++;

            }
        }
        return count;

    }


}
