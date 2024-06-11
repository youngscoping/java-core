import entity.Dog;

public class ContructorDemo {
    public static void main(String[] args) {
        // Contructor : Hàm  khởi tạo
        // 1. Tên contructor trùng với tên của class
        // 2. Contructor không có kiểu dữ liệu trả về

        Dog dog = new Dog("Long", 2);
        System.out.println("dog = " + dog);

        Dog dog2 = new Dog("Linh");
        System.out.println("dog2 = " + dog2);

        // mặc định: không tham số
        Dog dog3 = new Dog();
        System.out.println("dog3 = " + dog3);
    }
}
