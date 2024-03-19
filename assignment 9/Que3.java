
package Assignment9;
import java.util.*;

public class Que3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayList<Integer> list1 = new ArrayList<>(5);
          for(int i=0;i<5;i++) {
            int num = scanner.nextInt();
            list1.add(num);
        }

        ArrayList<Integer> list2 = new ArrayList<>(5);
         for(int i=0;i<5;i++){
            int num = scanner.nextInt();
            list2.add(num);
        }

        boolean isEqual = list1.equals(list2);
        if (isEqual) {
            System.out.println("ArrayLists are equal.");
        } else {
            System.out.println("ArrayLists are not equal.");
        }

        ArrayList<Integer> combinedList = new ArrayList<>(list1);
        combinedList.addAll(list2);
        System.out.println("Combined ArrayList: " + combinedList);
        
        int maxValue = Collections.max(combinedList);
        int minValue = Collections.min(combinedList);
        System.out.println("Maximum value: " + maxValue);
        System.out.println("Minimum value: " + minValue);

        System.out.println("Enter an element to remove:");
        int removeValue = scanner.nextInt();
        combinedList.removeIf(value -> value == removeValue);
        System.out.println("Remaining list after removing " + removeValue + ": " + combinedList);
        
    }
}