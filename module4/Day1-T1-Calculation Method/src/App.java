public class App {
    public static int calculate(int num1, int num2){
        return num1*num2;
    }
    public static void main(String[] args) throws Exception {
        int a=3;
        int b=4;
        int c = calculate(a, b);
        System.out.println("The product is: "+ c);
    }
}
