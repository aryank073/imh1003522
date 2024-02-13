
package lab3.Assignment6;

 import java.util.*;
public class Que5 {
   
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        PrintNumber printer = new PrintNumber();

        System.out.print("Enter an integer number: ");
        int intNum = scanner.nextInt();
        printer.print(intNum); 

        System.out.print("Enter a double number: ");
        double doubleNum = scanner.nextDouble();
        printer.print(doubleNum); 

        System.out.print("Enter a character: ");
        char ch = scanner.next().charAt(0);
        printer.print(ch); 

        scanner.close();
    }
}

class PrintNumber {
    public void print(Integer num) {
        System.out.println("Integer number: " + num);
    }

    public void print(Double num) {
        System.out.println("Double number: " + num);
    }

    public void print(Character ch) {
        System.out.println("Character: " + ch);
    }
}
