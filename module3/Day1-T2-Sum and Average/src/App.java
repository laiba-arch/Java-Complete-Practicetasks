import java.util.Scanner;
public class App {
    public static void main(String[] args)  {
        int number;
        int input=0;
        int sum=0;
        double average=0;
        Scanner s1= new Scanner(System.in);
        System.out.print("How many numbers you want to give input: ");
        number= s1.nextInt();
        for (int i=1; i<=number; i++)
        {
            System.out.print("Enter the number: ");
            input= s1.nextInt();
            sum = sum+ input;
        }
             System.out.println("Your sum is: "+sum);
             average = (double)sum / number;
             System.out.println("Your average is: "+average);
        s1.close();
    }
}
