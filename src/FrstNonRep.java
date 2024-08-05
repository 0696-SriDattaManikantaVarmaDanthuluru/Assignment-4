import java.util.ArrayList;
import java.util.Arrays;

public class FrstNonRep {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(1, 2, 2, 3, 4, 4, 5, 6, 6));
        System.out.println(firstNonRepeating(list));
    }
    public static int firstNonRepeating(ArrayList<Integer> list) {
        int n = list.size();
        for (int i = 0; i < n; i++) {
            boolean isUnique = true;
            for (int j = 0; j < n; j++) {
                if (i != j && list.get(i).equals(list.get(j))) {
                    isUnique = false;
                    break;
                }
            }
            if (isUnique) {
                return list.get(i);
            }
        }
        return -1;
    }
}
