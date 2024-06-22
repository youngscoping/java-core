package Comparing;

import java.time.LocalDate;
import java.util.Date;
import java.util.Random;

public class Program {
    public static void main(String[] args) {
        Random random = new Random();
        for (int i = 0; i < 5; i++) {
            Student student = new Student((i + 1), "student", LocalDate.now(), random.nextInt(10) +1 );
            System.out.println(student);
        }
    }
}
