
package lab3.Assignment7;
import java.util.*;

    class shape{
    public double getArea(){
    return 0;
    }
        }

class rectangle extends shape{
   double length;
   double width;

    rectangle(double length,double width){
        this.length=length;
        this.width=width;
    
    }
   public double getArea(){
    return length*width;
    }
}
    
class box extends rectangle{
    double height;
    
    box(double length,double width,double height){
        super(length,width);
        this.height=height;
    
    }
       public double getArea(){
            return 2*(length*width + length*height + width*height);
        }
        }
    
public class Que1 {
    public static void main(String[] args){
     Scanner sc= new Scanner(System.in);   
        System.out.println("Enter length and width of the rectangle");
            double lr = sc.nextDouble();
            double br = sc.nextDouble();
            
            rectangle rect= new rectangle(lr,br);
          System.out.println("Area of the rectangle is: " + rect.getArea()); 
          
          
           System.out.println("Enter length,width and height of the rectangle");
            double lbox = sc.nextDouble();
            double bbox = sc.nextDouble();
            double hbox = sc.nextDouble();
            box bo= new box(lbox,bbox,hbox);
          System.out.println("Surface Area of the box is: " + bo.getArea());   
    }
}
