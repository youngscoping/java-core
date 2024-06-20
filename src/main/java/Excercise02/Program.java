package Excercise02;

import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Nhập vào số a:");
        double a = Double.parseDouble(scanner.nextLine());
        System.out.println("Tổng của a và pi là:" + MyMath.sumQuestion1((int) a));
    }
}
