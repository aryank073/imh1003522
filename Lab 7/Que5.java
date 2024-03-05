
package lab3.Assignment7;

class base {
    public void display() {
        System.out.println("Display method in Base class");
    }
}

class derived extends base {
    public void display(){
     System.out.println("Display of derived");
    
   }
    
 
    public void show() {
        System.out.println("Show method in Derived class");
    }
}

public class Que5 {
    public static void main(String[] args) {
        
        base base1 = new base();
        base1.display();

        base base2 = new derived();
        base2.display(); 
    }
}
