
package Assignment8;

abstract class Basel {
    abstract class Base2 {
        abstract void display();
    }
}

class Derived1 extends Basel {
    class Derived2 extends Base2 {
        @Override
        void display() {
            System.out.println("In Derived2");
        }
    }
}

public class Que5 {
    public static void main(String[] args) {
        Derived1 d1 = new Derived1();
        Derived1.Derived2 d2 = d1.new Derived2();
        d2.display();
    }
}
