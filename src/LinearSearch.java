public class LinearSearch {
    public static void main(String[] args) {
        int[] ar={2,5,3,8,6,0};
        int target=8;
        for(int i=0;i<ar.length;i++){
            if(ar[i]==target){
                System.out.println(ar[i]);
                break;
            }
        }

    }
}