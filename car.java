

package lab3;

 class sample{
    private String brand;
    
    public sample(){
    this.brand = "Ford";
    }
    
    public String getBrand(){
    return this.brand;
    }
}
public class car{
    public static void main(String args[]){
        sample car = new sample ();
        String brand = car.getBrand();
        System.out.println("Brand:"+brand);
    
    }   
}


