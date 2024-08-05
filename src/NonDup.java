public class NonDup {
    public static void main(String[] args) {
    String s="aabbccd";
    char[] ch=s.toCharArray();
    int[] ar=new int[ch.length];
    for(int i=0;i< ar.length;i++){
        ar[i]=-1;
    }
    for(int i=0;i< ch.length;i++){
        for(int j=i+1;j<ch.length;j++){
            if(ch[i]==ch[j]){
                ar[i]=1;
                ar[j]=1;
            }
        }
    }
    for(int i=0;i< ar.length;i++){
        if(ar[i]!=1){
            System.out.println(ch[i]);
        }
    }




    }
    }
