import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        String color;
        Scanner s1 = new Scanner(System.in);
        System.out.print("Enter the traffic light color: ");
        color = s1.nextLine().trim();
        if ("red".equals(color)) {
             System.out.println("Traffic light color is "+ color + " it means stop");
        } 
        else if("yellow".equals(color)) {
            System.out.println("Traffic light color is "+ color + " it means slow down");
        }
        else if("green".equals(color)){
            System.out.println("Traffic light color is "+ color + " it means go");
        }
        else {
            System.out.println("Invalid color. Please enter red, yellow, or green. ");
        }
        s1.close();
    }
}
