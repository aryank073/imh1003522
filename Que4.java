
package lab3.Assignment6;

import java.util.*;
public class Que4 {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Studentsa student1 = new Studentsa();

        System.out.print("Enter name of second student: ");
        String name2 = scanner.nextLine();
        System.out.print("Enter roll number of second student: ");
        int roll2 = scanner.nextInt();
        System.out.print("Enter fee of second student: ");
        double fee2 = scanner.nextDouble();

        
        Studentsa student2 = new Studentsa(name2, roll2, fee2);

        System.out.println("\nDisplaying information of first student:");
        student1.show();

        System.out.println("\nDisplaying information of second student:");
        student2.show();

        scanner.close();
    }
}
    
class Studentsa {
    String studentName;
    int studentRoll;
    double studentFee;

   
    public Studentsa() {
        this("Default Name", 0, 0.0);
    }

    
    public Studentsa(String name, int roll, double fee) {
        this.studentName = name;
        this.studentRoll = roll;
        this.studentFee = fee;
    }

    public void display() {
        System.out.println("Name: " + this.studentName);
        System.out.println("Roll: " + this.studentRoll);
        System.out.println("Fee: " + this.studentFee);
    }
    
    public Studentsa show() {
        this.display();
        return this;
    }

}