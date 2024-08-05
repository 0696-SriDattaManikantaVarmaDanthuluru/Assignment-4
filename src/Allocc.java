public class Allocc {
    public static void main(String[] args) {
       int[] arr={2,4,5,6,4,7,4,6};
       int target=4;
       for(int i=0;i< arr.length;i++){
           if(arr[i]==target){
               System.out.println(i);
           }
       }

    }
}