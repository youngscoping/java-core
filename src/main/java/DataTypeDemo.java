import java.time.LocalDate;

public class DataTypeDemo {
    public static void main(String[] args) {
        // kiểu số nguyên
        // byte (1), short(2), int(4), long(8)
        int age = 18;
        System.out.println("age = " + age);

        // kiểu số thực
        // float (4), double(8)
        float pi = 3.14159F;
        System.out.println("pi = " + pi);

        // kiểu logic
        // boolean (1)
        boolean isLoading = true;
        System.out.println("isLoading = " + isLoading);

        // kiểu ký tự
        // char (2)
        char c = 'C';
        System.out.println("c = " + c);

        // Kiểu  xâu kí tự
        // String
        String s = "Java core";
        System.out.println("s = " + s);

        // kiểu thời gian
        // LocalDate, LocalTime, LocalDateTime
        LocalDate today = LocalDate.now();
        System.out.println("today = " + today);
        LocalDate date = LocalDate.of(2019, 3 , 19);
        System.out.println("date = " + date);

        // kiểu enum
        UiState state = UiState.LOADING;
        System.out.println("state = " + state);

        // kiểu mảng
        // array
        int[] numbers = {2,5,9,4,1};
        System.out.println("numbers.length = " + numbers.length);
        // chỉ số: bằt đầu từ 0
        System.out.println("numbers[0] = " + numbers[0]);
        // cách 2
        String[] fruits = new String[]{"cam", "mận", "táo"};
        // cách khác
        char[] characters = new char[10];
        System.out.println("characters.length = " + characters.length);
        // cập nhật bản giá trị theo chỉ số
        System.out.println("characters = " + characters[0]);
        characters[0] = 'K';
        System.out.println("characters[0] = " + characters[0]);
    }
}
