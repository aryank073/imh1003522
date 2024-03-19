
package Assignment9;
import java.util.*;


public class Que1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        ArrayList<Integer> A1 = new ArrayList<>();
        System.out.println("Enter integers : ");
        for(int i=0;i<5;i++){
            int num = sc.nextInt();
            A1.add(num);
        }  
        A1.add(10);
        A1.add(20);

        System.out.println("Integer ArrayList: " + A1);

        A1.add(0, 5);
        A1.remove(Integer.valueOf(10)); 
        Collections.sort(A1);
        System.out.println("Modified Integer ArrayList: " + A1);

        ArrayList<String> s1 = new ArrayList<>();
        System.out.println("Enter strings (type 'done' when finished):");
           while (sc.hasNext()){
            String str = sc.next();
            if (str.equals("done")) {
                break;
            }
            s1.add(str);
        }

        s1.add("Hello");
        s1.add("World");

        System.out.println("String ArrayList: " + s1);

        s1.add(0, "Java");
        s1.remove("World");

  
        Collections.sort(s1);
        System.out.println("Modified String ArrayList: " + s1);
    }
}
    
    
    
    
    
    
    
   
