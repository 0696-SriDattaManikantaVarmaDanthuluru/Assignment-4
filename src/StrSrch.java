public class StrSrch {
    public static void main(String[] args) {
        String[] s={"har","sha","chin"};
        String target="har";
        for(String a:s){
            if(a.equals(target)){
                System.out.println(a);
                break;
            }
        }
    }
}