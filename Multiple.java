import java.util.*;

public class Multiple {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.nextLine();
        int i, j, count = 0;
        int len = a.length();
        String b = new String("");
        for (i = 0; i < len; i++) {
            count = 0;
            for (j = 0; j <= i; j++) {
                if (a.charAt(i) == a.charAt(j)) {
                    count++;
                }
            }
            if (count == 1) {
                b = b + a.charAt(i);
            }
        }
        for (i = 0; i < b.length(); i++) {
            count = 0;
            for (j = 0; j < len; j++) {
                if (b.charAt(i) == a.charAt(j)) {
                    count++;
                }
            }
            if (count == 1) {
                System.out.printf("%c", b.charAt(i));
            } else {
                System.out.printf("%c%d", b.charAt(i), count);
            }
        }
    }
}