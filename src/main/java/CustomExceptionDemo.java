public class CustomExceptionDemo {
    public static void main(String[] args) {
        int age = 16;
        try {
            if (age < 18) {
                throw new InvalidAgeException("Bạn chưa đủ tuổi");
            } else {
                System.out.println("chào mừng bạn");

            }
        } catch (InvalidAgeException exception) {
            System.out.println(exception.getMessage());
        }
    }
}
