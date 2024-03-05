
package lab3.Assignment7;


public class Ques6 {
    
}
class person {
    String name;
    int age;

    public person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void display() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
}

class student extends person {
    private int roll;
    private int marks;

    public student(String name, int age, int roll, int marks) {
        super(name, age);
        this.roll = roll;
        this.marks = marks;
    }

  
   public static void display() {
        System.out.println("Display method in Student class (Method Hiding)");
    }

   
    public void displayStudentDetails() {
        System.out.println("Student Details:");
        display(); // Dynamic method dispatch
        System.out.println("Roll: " + roll);
        System.out.println("Marks: " + marks);
    }
}

class Employee extends person {
    private double salary;

    public Employee(String name, int age, double salary) {
        super(name,age);
        this.salary = salary;
    }

 
    public void display() {
        System.out.println("Display method in Employee class (Shadowing)");
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Salary: " + salary);
    }
}

public class Ques6 {
    public static void main(String[] args) {
        
        student.display();

       
        person person1 = new student("Alice", 20, 101, 85);
        person1.display();

        
        Employee employee = new Employee("Bob", 30, 50000);
        employee.display();
    }
}
