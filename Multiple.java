
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

class Multiple {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.nextLine();
        Character x = '\0';
        int len = a.length();
        int i, count = 0;
        for (i = 0; i < len - 1; i++) {
            if (a.charAt(i) == a.charAt(i + 1)) {
                count++;
                x = a.charAt(i);
            } else {
                System.out.println(x + "" + count);
                count = 0;
            }
        }
        sc.close();
    }
}