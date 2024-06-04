public class Operator {
    public static void main(String[] args) {
        // toán tử số học
        // + - * / %
        System.out.println(99 + 2);
        System.out.println(99 - 2);
        System.out.println(99 * 2);
        System.out.println(99 / 2);
        System.out.println(99 % 2);

        // +=  -= *= /=
        int a = 100;
        a+=10  ;//a = a + 10;
        System.out.println("a = " + a);

        // ++ --
        int b = 1000;
        b++; // b += 1
        System.out.println("b = " + b);

        // Chú Ý;
        int c = ++b;
        // int b = b + 1
        // int c = b
        System.out.println("b = " + b);
        System.out.println("c = " + c);

        int d = b++;
        // int d = b;
        // int b = b + 1

        // Toán tử quan h
        // = > ≥ ≤ < ≠

        // Toán tử Logic
        // AND: &&
        // OR: ||
        // NOT: !
        boolean ok = b > 5 && b < 10;
        boolean notTrue = !true;
        System.out.println("ok = " + ok);
        System.out.println("notTrue = " + notTrue);

    }

}
