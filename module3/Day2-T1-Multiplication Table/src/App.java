import java.util.Scanner;
public class App {
    public static void main(String[] args) 
     {
        int result;
        int value;
        Scanner s1= new Scanner(System.in);
        System.out.print("Enter any number for table: ");
        value =s1.nextInt();
        s1.close();
        for (int table=1; table<=10; table++){
            result= value*table;
           
            System.out.println(value+ " * "+ table + " = "+ result);

        }
    }
}
