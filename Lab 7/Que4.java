
package lab3.Assignment7;

class Person { 
    void message() 
    { 
        System.out.println("This is person class\n"); 
    } 
}
class Student extends Person { 

    void message() 
    { 
        System.out.println("This is student class"); 
    }
    void display() 
    {  
        message();
        super.message(); 
    } 
}
class Que4 { 
    public static void main(String args[]) 
    { 
        Student s = new Student();      
        s.display(); 
    } 
}
