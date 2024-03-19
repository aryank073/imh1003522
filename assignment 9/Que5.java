
package Assignment9;
import java.util.*;

public class Que5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String input = sc.nextLine();

        String reversed = reverseString(input);

        System.out.println("Reversed string: " + reversed);
    }

    public static String reverseString(String input) {
        char[] c = input.toCharArray();

        int start = 0;
        int end = c.length - 1;
        while (start < end) {
            char temp = c[start];
            c[start] = c[end];
            c[end] = temp;

            start++;
            end--;
        }

        return new String(c);
    }
}