public class App {
    public static void main(String[] args) {
        String name1 = "Romeo";
        String name2 = "Chintu";

        Dog dog1 = new Dog();
        dog1.name = name1;
   
        dog1.bark();

        Dog dog2 = new Dog();
        dog2.name = name2;
    
        dog2.bark();
    }
}

class Dog {
    String name;
    String breed;
    int age;

    public void bark() {
        System.out.println(name + " barks loudly! Woof!");
    }
}
