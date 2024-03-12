
package Assignment8;

import java.util.*;
    abstract class bike{
        abstract void run();
    
    }
class honda extends bike{
void run(){
    System.out.println("In Honda class");
}
}
public class Que2 {
    public static void main(String[] args){
     
        bike b1 = new honda();
        
        b1.run();  
    }
}
