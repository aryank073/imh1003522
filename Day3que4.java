
package lab3;
import java.util.*;


public class Day3que4 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of array :");
        int n = sc.nextInt();
        System.out.print("Enter the elements in  array :");
        int array[] = new int[n];
        for(int i=0;i<n;i++){
        array[i]=sc.nextInt();
        }
        int Sum=0;
        for(int j=0;j<n;j++){
        Sum = Sum+array[j];
        }
        System.out.println("Sum of elements in array is : "+Sum);
        System.out.print("Elements in reverse order are :");
        for(int m=n-1;m>=0;m--){
        System.out.print(" "+array[m]);
        }
    }
}
