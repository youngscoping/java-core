public class Demo {
    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.name = "shiba";
        dog.age = 3;

        System.out.println("dog.name = " + dog.name);
        System.out.println("dog.age = " + dog.age);
        dog.bark();
        int sum = dog.sum(7, 28);
        System.out.println("sum = " + sum);
    }
}
