
package Assignment9;
import java.util.*;

public class Que6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a string with leading zeros: ");
        String input = scanner.nextLine();

        String result = removeLeadingZeros(input);

        System.out.println("String after removing leading zeros: " + result);
    }
    
    public static String removeLeadingZeros(String input) {
        
        int index = 0;
        while (index < input.length() && input.charAt(index) == '0') {
            index++;
        }
        if (index == input.length()) {
            return "0";
        }
        return input.substring(index);
    }
}