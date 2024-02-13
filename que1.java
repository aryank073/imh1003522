
package lab3.Assignment6;
import java.util.*;

public class que1 {
    public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    
    System.out.println("Enter name of first student ");
    String name1=sc.nextLine();
    System.out.println("Enter Roll no. of first student ");
    int rno1=sc.nextInt();
    System.out.println("Enter Fee of first student ");
    double fee1=sc.nextDouble();
    System.out.println("Enter name of second student ");
    String name2=sc.nextLine();
    System.out.println("Enter Roll no. of second student ");
    int rno2=sc.nextInt();
    System.out.println("Enter Fee of second student ");
    double fee2=sc.nextDouble();
    
        student student1 = new student(name1,rno1,fee1);
         student student2 = new student(name2,rno2,fee2);
         
         System.out.println("Printing details of student 1");
         student1.display();
         
         
         System.out.println("Printing details of student 2");
         student2.display();
         
      
    }
    
}
class student{
    
    String s_name;
    int s_rno;
    double s_fee;
    
    student(String name,int rno,double fee){
        this.s_name=name;
        this.s_rno=rno;
        this.s_fee=fee;
    
    }
    public void display(){
    System.out.println("Name: "+this.s_name);
    System.out.println("Rno: "+this.s_rno);
    System.out.println("Fee: "+this.s_fee);
    }

}