package com.vti.ulti;

import java.util.Scanner;

public class ScannerUlti {
    private static final Scanner SCANNER = new Scanner(System.in);


    public static String inputString() {
        return SCANNER.nextLine()
                .trim()
                .replaceAll("\\s{2,}", " ");
    }

    public static int inputInt() {
        while (true) {
            try {
                String input = inputString();
                return Integer.parseInt(input);
            } catch (NumberFormatException exception) {
                System.err.println("Yêu cầu nhập vào số nguyên.");
                System.err.println("Nhập lại:");
            }
        }
    }

}
