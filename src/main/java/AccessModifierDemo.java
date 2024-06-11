import entity.Dog;

public class AccessModifierDemo {
    public static void main(String[] args) {
        // phạm vi truy cập
        // public: Truy cập dc từ mọi nơi
        Dog dog1 = new Dog("long", 2);
        System.out.println("dog1.name = " + dog1.name);


        // protected: trong cùng package hoặc class con
        Dog dog2 = new Dog("Long", 2);
        // System.out.println(dog2.age);


        // default: cùng package
        Dog dog3 = new Dog("Long", 2);
        // System.out.println("dog3.color = " + dog3.color);

        // private: cùng class:
        Dog dog4 = new Dog("long", 2);
        // System.out.println("dog4.id = " + dog4.id);
    }
}
