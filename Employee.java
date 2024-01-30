package Lab3;
import java.util.*;
class NewClass {
    public static void main(String[] args){
        Employee obj = new Employee();
        obj.set();
        obj.get();
    }
}
class Employee{
    private int Employee_id;
    protected String Employee_name;
    String Employee_department;
    Scanner sc = new Scanner(System.in);
    
    public void set(){
        System.out.println("Enter Employee ID");
        int n = sc.nextInt();
        System.out.println("Enter Employee name");
        String s1 = sc.next();
        System.out.println("Enter Employee Department");
        String s2 = sc.next();
        Employee_id = n;
        Employee_name = s1;
        Employee_department = s2;
    }
    public void get(){
        System.out.println("Employee id : " + Employee_id);
        System.out.println("Employee Name : " + Employee_name);
        System.out.println("Employee Department : " + Employee_department);
    }
    
}

        
        
        
        
        
        
        
        
        
    
    

