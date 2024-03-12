
package Assignment8;

interface Helper {
    void help();
}

interface ClassHelper extends Helper {
    void classHelp();
}

class MyClasss implements ClassHelper {
    @Override
    public void help() {
        System.out.println("Helping...");
    }

    @Override
    public void classHelp() {
        System.out.println("Class helping...");
    }
}

public class Que9{
    public static void main(String[] args) {
        MyClasss obj = new MyClasss();

        
        obj.help();
        obj.classHelp();
    }
}
