package statics;

public class FinalDemo {
    public static void main(String[] args) {
        // final variable
        final double pi = 3.1415;
        // pi = 5; // Lỗi

        // final method
        Dog dog = new Dog();
        dog.run();
        // final class

//        Shiba shiba = new Shiba();
//        shiba.run();

        // constant
        System.out.println("Math.PI = " + Math.PI);
    }
}
