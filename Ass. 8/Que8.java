
package Assignment8;


interface MyInterface {
    int num = 10;

    void display();

    default void defaultMethod() {
        System.out.println("Default method implementation");
    }

    static void staticMethod() {
        System.out.println("Static method implementation");
    }
}

class MyClass implements MyInterface {
    @Override
    public void display() {
        System.out.println("Displaying...");
    }
}

public class Que8 {
    public static void main(String[] args) {
        MyClass obj = new MyClass();

        obj.display();
        obj.defaultMethod();
        System.out.println("Value of num: " + MyInterface.num);

        MyInterface.staticMethod();
    }
}
