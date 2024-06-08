import java.util.Scanner;

public class Program2 {
    public static void main(String[] args) {
    Program2.question7();

    }
    public static void question7() {
        Scanner scanner = new  Scanner(System.in);
        int soChan = scanner.nextInt();
        if (soChan %2 == 0) {
            System.out.println("đây là số chẵn");
        }
        else {
            System.out.println("đây là số lẻ");
        }
    }
}

