import java.util.Random;

public class RandomDemo {
    public static void main(String[] args) {
        Random random = new Random();

        // Tạo số nguyên ngẫu nhiên
        int n = random.nextInt();
        System.out.println(n);

        // 0 ≤ m < max
        int m = random.nextInt(100);
        System.out.println("m = " + m);

        // min ≤ k ≤ max
        // min + random.nextInt(max - min +1)
        int min = 100;
        int max = 999;
        int k = min + random.nextInt(max -min +1);
        System.out.println("k = " + k);

        // Lấy ngẫu nhiên phần tử trong mảng
        String[] fruits = {"Cam", "Quýt", "táo", "Dứa"};
        int q = random.nextInt(fruits.length);
        String randomFruits = fruits[q];
        System.out.println("randomFruits = " + randomFruits);


        System.out.println(fruits[2]);
    }
}
