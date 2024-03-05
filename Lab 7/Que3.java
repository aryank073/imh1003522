
package lab3.Assignment7;
import java.util.*;

class Rectangle{
    double length;
    double width;
    
    Rectangle(){
    this.length=1;
    this.width=1;
    }
     
    Rectangle(double length,double width){
    this.length=length;
    this.width=width;
}
}

  class Cuboid extends Rectangle{
  double height;
  
  Cuboid(){
  super();
  this.height=1;
  }
   
  Cuboid(double length,double width,double height){
  super(length,width);
  this.height=height;
  }
    double volume(){
        return length*width*height;
    }
  }

public class Que3 {
  public static void main(String[] args){
     Scanner sc= new Scanner(System.in); 
     
     Cuboid c1=new Cuboid();
     double volume1=c1.volume();
      System.out.println("volume of the cuboid is :" + volume1);
     
      System.out.println("Enter length,width and height of the cuboid :");
      double length=sc.nextDouble();
      double width=sc.nextDouble();
      double height=sc.nextDouble();
     
     Cuboid c2=new Cuboid(length,width,height);
     double volume2=c2.volume();
      System.out.println("volume of the cuboid is :" + volume2);
     
   }
 }