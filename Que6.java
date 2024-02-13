
package lab3.Assignment6;
import java.util.*;

public class Que6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter an integer number: ");
        int intValue = sc.nextInt();

        MyIntegerWrapper myInteger = new MyIntegerWrapper(intValue);

        System.out.println("Value stored in custom wrapper class: " + myInteger.getValue());

        sc.close();
    }
}
class MyIntegerWrapper {
    private int value;

    public MyIntegerWrapper(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }
}