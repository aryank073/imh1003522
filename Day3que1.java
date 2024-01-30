
package lab3;
import java.util.*;

public class Day3que1 
{
   
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the side of square :");
        float s = sc.nextFloat() ;
        System.out.println("Enter the length of rectangle :");
        float l = sc.nextFloat();
        System.out.println("Enter the breadth of rectangle :");
        float b = sc.nextFloat();
        System.out.println("Enter the radius of circle :");
        double r = sc.nextDouble();
        
        
        CalculateArea ob = new CalculateArea();
        ob.area(s);
        ob.area(l,b);
        ob.area(r);
    }
    
}
class CalculateArea{
    void area(float x){
    System.out.println("the area of the square is "+Math.pow(x,2)+"sq units");
    
    }
    void area(float x ,float y){
    System.out.println("the area of the rectangle is "+x*y+"sq units");
    }
    
    void area  (double x){
        double z = 3.14*x*x;
        System.out.println("th area of the circle is "+z+"sq units");
    }

}
