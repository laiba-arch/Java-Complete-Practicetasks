
public class App {
    public int findMax(int a, int b) {
        return (a > b) ? a : b;
    }
    public double findMax(double a, double b) {
        return (a > b) ? a : b;
    }
    public static void main(String[] args) {
        App finder = new App();

        int maxInt = finder.findMax(10, 25);
        double maxDouble = finder.findMax(12.5, 8.9);

        System.out.println("Max of two integers: " + maxInt);
        System.out.println("Max of two doubles: " + maxDouble);
    }
}
