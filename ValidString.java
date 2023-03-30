/* 
Problem Statement – Given a string S(input consisting) of ‘*’ and ‘#’. The length of the string is variable. The task is to find the minimum number of ‘*’ or ‘#’ to make it a valid string. The string is considered valid if the number of ‘*’ and ‘#’ are equal. The ‘*’ and ‘#’ can be at any position in the string.
Note : The output will be a positive or negative integer based on number of ‘*’ and ‘#’ in the input string.
•	(*>#): positive integer
•	(#>*): negative integer
•	(#=*): 0
Example 1:
Input 1:
•	###***   -> Value of S
Output :
•	0   → number of * and # are equal
*/
import java.util.Scanner;

public class ValidString {
    public static int makeValidString(String s) {
        int num_of_star = 0, num_of_hash = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '*') {
                num_of_star++;
            } else if (s.charAt(i) == '#') {
                num_of_hash++;
            }
        }

        if (num_of_star == num_of_hash) {
            return 0;
        } else if (num_of_star > num_of_hash) {
            return num_of_hash - num_of_star;
        } else {
            return num_of_hash - num_of_star;
        }
    }

    public static void main(String[] args) {
        String s;
        Scanner sc = new Scanner(System.in);
        s = sc.nextLine();
        int result = makeValidString(s);
        System.out.println(result);
        sc.close();
    }
}