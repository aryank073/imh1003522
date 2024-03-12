
package Assignment8;
import java.util.*;

abstract class shape{
 abstract double perimeter();
 abstract double area();
}

class circle extends shape{
    double radius;
    circle(double radius){
    this.radius=radius;
}
double perimeter(){
    return 2*3.14*radius;
}
double area(){
    return 3.14*radius*radius;
}
}

class rectangle extends shape{
double l;
double b;

rectangle(double l,double b){
this.l=l;
this.b=b;
}
double perimeter(){
return 2*(l+b);
}
double area(){
return l*b;
}
}
public class Que3 {
     public static void main(String[] args){
     Scanner sc = new Scanner(System.in);
             
     double radius=sc.nextDouble();
     circle c1=new circle(radius);
     System.out.println("perimeter of the circle is : "+c1.perimeter());
     System.out.println("area of the circle is : "+c1.area());
     
     double l=sc.nextDouble();
     double b=sc.nextDouble();
     rectangle r1=new rectangle(l,b);
     System.out.println("perimeter of the rectangle is : "+r1.perimeter());
     System.out.println("area of the rectangle is : "+r1.area());
     }
}
