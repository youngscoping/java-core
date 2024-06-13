package Abstraction;

public class AbstractionDemoMain {
    public static void main(String[] args) {
        // tính trừu tượng


        // Abstract class: trừu tượng ko hoàn toàn (<100%)
        Circle circle = new Circle(1.0);
        System.out.println("circle.area() = " + circle.area());

        // KO thể khởi tạo đói tượng
        // Shape shape = new Shape();

        // Interface
        // Trừu tượng hoàn toàn 100&
        // Mặc định: public abstract
        // Đa kế thừa
        circle.draw();
        circle.extend();
    }
}
