import java.util.Scanner;

public class App {
    public static void main(String[] args)  {
        String name;
        String password;
      Scanner s1 = new Scanner(System.in);
        System.out.print("Enter your name: ");
        name = s1.nextLine().trim();
        System.out.print("Enter your password: ");
        password = s1.nextLine().trim();
        
        if ( "admin".equals(name) &&  "admin123".equals(password)){
            System.out.println("login");
        }
        else { 
            System.out.println("login failed");
        }
      s1.close();
    }
}
