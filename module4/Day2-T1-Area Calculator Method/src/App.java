public class App {
   public int calculateArea(int side) {
        return side * side;
    }
    public int calculateArea(int length, int width) {
        return length * width;
    }
    public static void main(String[] args) {
        App calculator = new App();
        
        int squareArea = calculator.calculateArea(5);  
        int rectangleArea = calculator.calculateArea(4, 6); 

        System.out.println("Area of square: " + squareArea);
        System.out.println("Area of rectangle: " + rectangleArea);
    }
}