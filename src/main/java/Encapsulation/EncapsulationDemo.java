package Encapsulation;

public class EncapsulationDemo {
    public static void main(String[] args) {
        // tính đóng gói
        //1. các thuộc tính private
        //2. cung cấp getter / setter
        Cat cat = new Cat("long", 2);
        System.out.println("cat.getName() = " + cat.getName());
    }
}
