import java.util.Scanner;

public class Excercise04 {
    void question01() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập vào xâu kí tự:");
        String s = scanner.nextLine();
        String[] words = s.split(" ");
        int count = 0;
        for (String word : words) {
            if (!word.isEmpty()) {
                count++;
            }
        }
        System.out.println("số từ là:" + count);
    }

    void question02() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập vào kí tự s1");
        String s1 = scanner.nextLine();
        System.out.println("Nhập vào kí tự s2");
        String s2 = scanner.nextLine();
        System.out.println(s1.concat(s2));
    }

    void question03() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập tên");
        String name = scanner.nextLine();
        String capitalized = name.substring(0,1).toUpperCase() + name.substring(1);
        System.out.println(capitalized);
    }

    void question04() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập tên");
        String name = scanner.nextLine();
        for (int i = 0; i < name.length(); i++) {
            System.out.println("Kí tự thứ " + (i+1) + " là: " + name.charAt(i));
        }
    }

    void question05() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập họ:");
        String last = scanner.nextLine();
        System.out.println("Nhập tên:");
        String first = scanner.nextLine();
        System.out.println(last.concat(" " + first));
    }

    void question06() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập tên:");
        String name = scanner.nextLine();

    }
}
