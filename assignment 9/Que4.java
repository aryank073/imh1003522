
package Assignment9;
import java.util.*;
public class Que4 {
    public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    
    System.out.println("enter 1st String: ");
    String s1 = sc.nextLine();
    s1=s1.toLowerCase();
    System.out.println("enter 2nd String: ");
    String s2 = sc.nextLine();
    s2=s2.toLowerCase();
    if(s1.length()==s2.length()){
        
        char[] c1 = s1.toCharArray();
        char[] c2 = s2.toCharArray();
        
        Arrays.sort(c1);
        Arrays.sort(c2);
        
        boolean result = Arrays.equals(c1,c2);
    if(result){
        System.out.println("String "+s1+" and String "+s2+" are anagrams.");
    }else{
        System.out.println("String "+s1+" and String "+s2+" are not anagrams.");
        }
    }
    else{
            System.out.println("String "+s1+" and String "+s2+" are not anagrams.");
            } 
        
    }
}