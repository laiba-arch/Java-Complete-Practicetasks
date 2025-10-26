import java.util.Scanner;
public class App {
    public static void main(String[] args) {
        int attempts =3;
        String input;
        String correctpassword="secret123";
        Scanner s1=new Scanner(System.in);
        System.out.println("You have 3 attempts to enter the correctPassword");
        while(attempts>0)
        {
            System.out.print("Enter Password: ");
            input = s1.nextLine();
            if (input.equals(correctpassword)) {
                System.out.println("Login successful");
                break;
            } else {
                attempts--;
                System.out.println("Incorrect Password "+ attempts+" attempts left");
            }
        }
        System.out.println("system locked");
        s1.close();
    }
}
