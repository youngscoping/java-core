package com.vti.util;

import java.util.Scanner;

public class ScannerUtil {
    private static final Scanner SCANNER = new Scanner(System.in);

    private static String inputString() {
        return SCANNER.nextLine()
                .trim()
                .replaceAll("\\s{2,}", "");
    }

    public static int intputInt() {
        while (true) {
            try {
                String input = inputString();
                return  Integer.parseInt(input);
            } catch (NumberFormatException exception) {
                System.err.println("Yêu cầu nhập lại số nguyên");
                System.err.println("Nhập lại:");
            }
        }
    }



    public static String inputEmail() {
        while (true) {
            String input = inputString();
            if (input.contains("@")) {
                return input;
            }
            else {
                System.err.println("Yêu cầu chứa ký tự @");
                System.err.println("Nhập lại:");
            }
        }
    }

    public static String inputPassword() {
        while (true) {
            String input = inputString();
            int length = input.length();
            if (length < 6 || length > 12) {
                System.err.println("Yêu cầu nhập từ 6 đến 12 ký tự");
                System.err.println("Nhập lại");
            } else {
                return input;
            }
        }
    }




}
