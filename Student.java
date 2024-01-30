package Lab3;
import java.util.*;
public class Student {
    private int roll;
    private String name;
    private int[] marks = new int[5];

    
    public Student(int roll, String name, int[] marks) {
        this.roll = roll;
        this.name = name;
        this.marks = marks;
    }

   
    public Student() {
        this.roll = 0;
        this.name = "Unknown";
        for (int i = 0; i < marks.length; i++) {
            this.marks[i] = 0;
        }
    }

    
    public void printDetails() {
        System.out.println("Name: " + name);
        System.out.println("Roll: " + roll);
        System.out.println("Marks: ");
        for (int i = 0; i < marks.length; i++) {
            System.out.println("Subject " + (i + 1) + ": " + marks[i]);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int ro = sc.nextInt();
        
        int[] mar = new int[5];

        for (int i = 0; i < mar.length; i++)
    {
        System.out.println("Please enter marks");
        mar[i] = sc.nextInt();
    }
        int ro1 = sc.nextInt();
        
        int[] mar1 = new int[5];

        for (int i = 0; i < mar1.length; i++)
    {
        System.out.println("Please enter marks");
        mar1[i] = sc.nextInt();
    }
        Student student1 = new Student(ro,"john",mar);
        Student student2 = new Student(ro1,"jacob",mar1);

       
        System.out.println("Student 1 Details:");
        student1.printDetails();
        System.out.println("\nStudent 2 Details:");
        student2.printDetails();
    }
}
