public class App {
    public static void main(String[] args) {
        book book1 = new book();
        book1.title= "48 laws of power";
        book1.author = "Robert Greene";
        book1.publicationyear= 1998;
        book1.displayBookInfo();
    }
}
class book{
    String title;
    String author;
    int publicationyear;
    public void displayBookInfo(){
        System.out.println("---------------------");
        System.out.println("");
        System.out.println("Title: "+ title );
        System.out.println("");
        System.out.println("Author "+ author );
        System.out.println("");
        System.out.println("Publivationyear "+ publicationyear);
        System.out.println("");
        System.out.println("---------------------");
    }

}
