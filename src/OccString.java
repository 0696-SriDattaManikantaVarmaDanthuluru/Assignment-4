public class OccString {
    public static void main(String[] args) {
        int count=0;
        String[] s={"sun","moon","earth","stars","sun"};
        String target="sun";
        for(String a:s){
            if(a.equals(target)){
                count++;
            }
        }
        System.out.println(count);

    }
}