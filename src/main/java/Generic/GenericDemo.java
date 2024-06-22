package Generic;

public class GenericDemo {
    public static void main(String[] args) {
        // Quy ước
        // T - type
        // E - Element
        // N - number
        // K - key
        // V - value




        // generic class / ìnterface
        Dog<Integer> dog1 = new Dog<>(1, "long");
        System.out.println(dog1);
        Dog<Double> dog2 = new Dog<>(2.5, "Hà");
        System.out.println(dog2);
        // generic method

        Printer.printAny(4);
        Printer.printAny(4.5);
        Printer.printAny(dog1);

        // bounded type
        // Dog<String> dog3 = new Dog<String>("ABC", "Long");

        // multiple bounds
        int max = Math.max(1, 99);
        System.out.println("max = " + max);
    }
}
