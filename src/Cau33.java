import java.util.*;

public class Cau3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) a[i] = sc.nextInt();
        int bestVal = a[0];
        int bestCount = 0;
        for (int i = 0; i < n; i++) {
            int count = 0;
            for (int j = 0; j < n; j++) {
                if (a[j] == a[i]) count++;
            }
            if (count > bestCount) {
                bestCount = count;
                bestVal = a[i];
            }
        }

        System.out.print(bestVal);
    }
}