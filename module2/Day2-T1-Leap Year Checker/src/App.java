import java.util.Scanner;

public class App {
    public static void main(String[] args) {

        int year;
        Scanner s1 = new Scanner(System.in);
        System.out.print("Enter Year: ");
        year = s1.nextInt();

      if ((year%100 != 0 && year%4 == 0) || (year%400==0)){
            System.out.println(year + " is leap year");
        } else {
            System.out.println(year + " is not leap year");
        }
        s1.close();
    }
}
