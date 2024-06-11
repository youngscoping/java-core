package Inheritance;

public class InheritanceDemo {
    public static void main(String[] args) {
        // tính kế thừa
        // mục dich tái sử dụng code
        //  từ khoá: extends
        Duck duck = new Duck("Long",2);
        duck.eat();

        // @Override
        duck.eat();

        // tham chiếu: super
        duck.eat();
        System.out.println("duck = " + duck);

        // đơn kế thừa
    }
}
