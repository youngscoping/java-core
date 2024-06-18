package util;

import java.util.Scanner;

public class ScannerUtil {
    private  static Scanner scanner = new Scanner(System.in);

    public static int inputInt() {
        while (true) {
            try {
                String input = scanner.nextLine();
                return Integer.parseInt(input);
            } catch (NumberFormatException exception) {
                System.out.println("Yêu cầu nhập vào số nguyên:");
                System.out.println("Nhập lại:");
            }
        }
    }

    public static int inputPositive () {
        while (true) {
            try {
                String input = scanner.nextLine();

                if (Integer.parseInt(input) > 0) {
                    return Integer.parseInt(input);
                } else {
                    System.out.println("Yêu cầu nhập lại số nguyên dương");
                }
            } catch (NumberFormatException exception) {
                System.out.println("Yêu cầu nhập lại số nguyên dương");
            }
        }
    }

    public static float inputFloat() {
        while (true) {
            try {
                String input = scanner.nextLine();
                return Float.parseFloat(input);
            } catch (NumberFormatException exception) {
                System.out.println("Yêu cầu nhập vào số thực:");
                System.out.println("Nhập lại:");
            }
        }
    }

    public static String inputString() {
        return scanner.nextLine();
    }

    public static String inputEmail() {
        // yêu cầu chứa @
        while (true) {
            try {
                String input = scanner.nextLine();
                if (input.contains("@")) {
                    return input;
                } else {
                    System.out.println("email phải chứa @");
                }
            } catch (Exception exception) {
                System.out.println("email phải chứa @");
            }
        }
    }

    public  static String intputPassword() {
        // yêu cầu 6-12 kí tự, ít nhất 1 kí tự viết hoa
        while (true) {

                String input = scanner.nextLine();
                int length = input.length();
                if (length < 6 && length > 12 ) {
                    System.err.println("Yêu cầu từ 6 đến 12 kí tự");
                    System.err.println("Nhập lại");
                } else {
                    for (int i = 0; i < length; i++ ) {
                        char c = input.charAt(i);
                        if (Character.isUpperCase(c))
                            return input;
                    }
                }
            System.out.println("Sai pw, yêu cầu 1 kí  tự viết hoa");
            System.out.println("Nhập lại");
        }
    }

//    public static String inputFullName() {
//
//    }

}
