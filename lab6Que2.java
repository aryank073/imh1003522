
package lab3.Assignment6;
import java.util.*;

    public class Que2 {
  
    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

        Student student1 = new Student();
        
        System.out.println("Enter name of second student: ");
        String name2 = scanner.nextLine();
        System.out.println("Enter roll number of second student: ");
        int roll2 = scanner.nextInt();
        System.out.println("Enter fee of second student: ");
        double fee2 = scanner.nextDouble();

        Student student2 = new Student(name2, roll2, fee2);

        System.out.println("Displaying information of first student:");
        student1.Show(student1);

        System.out.println("Displaying information of second student:");
        student2.Show(student2);

        scanner.close();
    }
}
class Student {
    String Student_name;
    int Student_roll;
    double Student_fee;

    
    Student() {
        this("Default Name", 0, 0.0); 
    }

    
    Student(String name, int roll, double fee) {
        this.Student_name = name;
        this.Student_roll = roll;
        this.Student_fee = fee;
    }

   
    public void Display() {
        System.out.println("Name: " + this.Student_name);
        System.out.println("Roll: " + this.Student_roll);
        System.out.println("Fee: " + this.Student_fee);
    }

   
    public void Show(Student student) {
        student.Display();
    }
}
