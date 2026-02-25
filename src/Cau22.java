import java.util.*;

public class Cau2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();

        s = s.trim();
        if (s.length() == 0) {
            System.out.print("");
            return;
        }

        String[] parts = s.split("\\s+");
        String result = "";
        for (int i = 0; i < parts.length; i++) {
            String w = parts[i].toLowerCase();
            if (w.length() > 0) {
                w = Character.toUpperCase(w.charAt(0)) + w.substring(1);
            }
            if (i > 0) result += " ";
            result += w;
        }
        System.out.print(result);
    }
}
