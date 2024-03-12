
package Assignment8;

interface Person{
    static double a = 12.6;
    abstract void method();
}

class Employee implements Person{
    @Override
    public void method(){
        System.out.println("In employee class : "+a);
    }
}
        
public class QUe4 {
    public static void main(String[] args){
        Employee p1 = new Employee();
        p1.method();
    }
}
