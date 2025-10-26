import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Double x;                         
        Scanner s1 = new Scanner(System.in);  
        System.out.print("Enter any number: ");
        x = s1.nextDouble();              
        if (x%2==0) {
            System.out.println(x +" is even");
        } 
        else {
            System.out.println(x+" is odd");
        }
        s1.close();                        
    }
}
