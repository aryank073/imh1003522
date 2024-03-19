
package Assignment9;
import java.util.*;

public class Que2 {
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

        System.out.println("Enter a value to search:");
        int searchValue = scanner.nextInt();
        if (combinedList.contains(searchValue)) {
            System.out.println(searchValue + " is present.");
        } else {
            System.out.println(searchValue + " is not present.");
        }

    }
}