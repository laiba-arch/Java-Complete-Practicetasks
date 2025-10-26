import java.util.Scanner;
public class App {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int birthYear;
        int currentYear;
        int age;
        System.out.print("Enter your birth year: ");
        birthYear = sc.nextInt();
        System.out.print("Enter the current year: ");
        currentYear = sc.nextInt();
        age = currentYear - birthYear;
        if (age < 0) {
            System.out.println("Invalid input! Birth year cannot be greater than current year.");
        } else {
            System.out.println("Your age is: " + age + " years.");
        }
        sc.close();
    }
}
