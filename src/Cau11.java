import java.util.*;

public class Cau1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();

        int[] cnt = new int[256];
        for (int i = 0; i < s.length(); i++) {
            int c = (int) s.charAt(i);
            if (c >= 0 && c < 256) cnt[c]++;
        }
        char ans = '_';
        for (int i = 0; i < s.length(); i++) {
            int c = (int) s.charAt(i);
            if (c >= 0 && c < 256 && cnt[c] == 1) {
                ans = s.charAt(i);
                break;
            }
        }

        System.out.print(ans);
    }
}
