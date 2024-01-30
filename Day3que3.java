
package lab3;
import java.util.*;


public class Day3que3 {
     public static void main(String args[]){
         Scanner sc = new Scanner(System.in);
         System.out.println("Enter a string:");
          String x =sc.nextLine();
          String lowerx = convertToLowerCase(x);
          System.out.println("String in lowercase form is: " +lowerx);
           
          int totalLength = calculateTotalLength(x);
          System.out.println("Total length of the string is :" +totalLength);
     }
   
          
      private static String convertToLowerCase(String input){
          return input.toLowerCase();
      }    
     
     private static int calculateTotalLength(String input){
         return input.length();
     }
     
    
     }
    

