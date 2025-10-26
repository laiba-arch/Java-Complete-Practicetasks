import java.util.Scanner;
public class App {
    public static void main(String[] args)  {
        int choice;
        Scanner s1 = new Scanner(System.in);
        System.out.println("1. View Balance ");
        System.out.println("2. Deposit ");
        System.out.println("3. Withdraw ");
        System.out.println("4. Exit");
        System.out.print("Enter Your Choice: ");
        choice = s1.nextInt();
         s1.close();
        switch (choice) {
            case 1:
                 System.out.println("Viewing Balance..");
                break;
            case 2:
                 System.out.println("Proceeding to Deposit...");
                break;
            case 3:
                 System.out.println("Initiating Withdrawal...");
                break;
            case 4:
                 System.out.println("Exiting. Thank you!");
                break;
            default:
                 System.out.println("Invalid choice. Please try again.");
                break;         
        }
    }
}
