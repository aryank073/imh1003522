
package lab3;
import java.util.*;

public class Day3que2 {
    
    public static boolean validate(String name){
        return name.matches("[a-zA-Z, ]+");
    }
    
    public static boolean validate(int age){
        return age >3 && age<15;
    }
    
    public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the name of user:");
    String x =sc.nextLine();
    System.out.println("Enter the age of the user:");
    int y=sc.nextInt();
    
    if(validate (x)){
         System.out.println("Name is valid.");
    }else{
         System.out.println("invalid name.");
    }
    
    if(validate (y)){
         System.out.println("Age is valid.");
    }else{
     System.out.println("age is invalid.");
    }
   
    }   
}
