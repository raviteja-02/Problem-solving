/*Question 1
Problem Statement –
You have write a function that accepts, a string which length is “len”, the string has some “#”, in it you have to move all the hashes to the front of the string and return the whole string back and print it.
 
char* moveHash(char str[],int n);
 
example :-
Sample Test Case
Input:
Move#Hash#to#Front
Output:
###MoveHashtoFront */
import java.util.Scanner;

public class Hash {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String d = sc.nextLine();
        int len = d.length();
        char[] a = new char[len];
        char[] b = new char[len];
        char[] c = new char[len];

        // Store the input string as an array of characters
        for (int i = 0; i < len; i++) {
            a[i] = d.charAt(i);
        }

        int j = 0, k = 0;
        // Separate the characters into two arrays: hashes and non-hashes
        for (int i = 0; i < len; i++) {
            if (a[i] == '#') {
                c[j++] = '#';
            } else {
                b[k++] = a[i];
            }
        }

        // Combine the two arrays into a single string with hashes at the beginning
        String result = new String(c) + new String(b);
        System.out.println(result);
        sc.close();
    }
}