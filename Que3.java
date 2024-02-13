
package lab3.Assignment6;

import java.util.*;
public class Que3 {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Students student1 = new Students();

        System.out.print("Enter name of second student: ");
        String name2 = scanner.nextLine();
        System.out.print("Enter roll number of second student: ");
        int roll2 = scanner.nextInt();
        System.out.print("Enter fee of second student: ");
        double fee2 = scanner.nextDouble();

        
        Students student2 = new Students(name2, roll2, fee2);

        System.out.println("\nDisplaying information of first student:");
        student1.show();

        System.out.println("\nDisplaying information of second student:");
        student2.show();

        scanner.close();
    }
}
    


class Students {
    String studentName;
    int studentRoll;
    double studentFee;

   
    public Students() {
        this("Default Name", 0, 0.0);
    }

    
    public Students(String name, int roll, double fee) {
        this.studentName = name;
        this.studentRoll = roll;
        this.studentFee = fee;
    }

    public void display() {
        System.out.println("Name: " + this.studentName);
        System.out.println("Roll: " + this.studentRoll);
        System.out.println("Fee: " + this.studentFee);
    }
    
    public void show() {
        this.display();
    }

}