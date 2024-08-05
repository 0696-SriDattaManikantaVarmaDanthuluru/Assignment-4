import java.util.ArrayList;
import java.util.Arrays;

public class RotationArrList {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 6, 7));
        int k = 3;
        rotate(list, k);
        System.out.println(list);
    }

    public static <T> void rotate(ArrayList<T> list, int k) {
        ArrayList<T> temp = new ArrayList<>(list);
        int n = list.size();
        for (int i = 0; i < n; i++) {
            list.set((i + k) % n, temp.get(i));
        }
    }
}
