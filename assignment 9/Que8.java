
package Assignment9;
import java.util.*;

public class Que8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter the first string: ");
        String str1 = scanner.nextLine();

        System.out.print("Enter the second string: ");
        String str2 = scanner.nextLine();

        performStringComparisons(str1, str2);
    }
    public static void performStringComparisons(String str1, String str2) {
      
        System.out.println("Using equals():");
        System.out.println("str1.equals(str2): " + str1.equals(str2));

        System.out.println("\nUsing equalsIgnoreCase():");
        System.out.println("str1.equalsIgnoreCase(str2): " + str1.equalsIgnoreCase(str2));

        System.out.println("\nUsing compareTo():");
        int compareToResult = str1.compareTo(str2);
        if (compareToResult == 0) {
            System.out.println("str1 is equal to str2");
        } else if (compareToResult < 0) {
            System.out.println("str1 comes before str2");
        } else {
            System.out.println("str1 comes after str2");
        }
    }
}