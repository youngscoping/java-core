import java.util.Scanner;

public class ScannerDemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Mời bạn nhập vào tên");
        String fullName = scanner.nextLine();
        System.out.println("Họ tên:" + fullName);

        System.out.println("Mời bạn nhập vào tuổi");
        int age = scanner.nextInt();
        System.out.println("Tuỏi của bạn là:" + age);
    }




}
