
package lab3.Assignment7;

import java.util.*;

class Circle{
double radius;
    Circle(double radius){
        this.radius=radius;
    }
    double area(){
    return 2*3.14*radius;
    }
    double perimeter(){
    return 2*3.14*radius;
    }
    double circumference(){
    return perimeter();
    }
}
    
class Cylinder extends Circle{
double height;
    Cylinder(double height,double radius){
        super(radius);
    this.height=height;
    }
    double Volume(){
    return area()*height;
    }
}
public class Que2 {
   public static void main(String[] args){
     Scanner sc= new Scanner(System.in);
     
     System.out.println("enter the radius of the cylinder :");
        double radius = sc.nextDouble();
      System.out.println("enter the height of the cylinder :");
         double height = sc.nextDouble();
     
     Cylinder cylinder = new Cylinder(radius,height);
      
     System.out.println("Base area of the cylinder is :" + cylinder.area());
     System.out.println("volume of the cylinder is :" + cylinder.Volume());
        
}
}
