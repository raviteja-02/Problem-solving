/*Question 2
Problem Statement –
Capgemini in its online written test have a coding question, wherein the students are given a string with multiple characters that are repeated consecutively. You’re supposed to reduce the size of this string using mathematical logic given as in the example below :
Input :
aabbbbeeeeffggg
Output:
a2b4e4f2g3
Input :
abbccccc
Output:
ab2c5 */
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