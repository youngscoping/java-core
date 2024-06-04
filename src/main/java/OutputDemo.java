public class OutputDemo {
    public static void main(String[] args) {
        // Escape character
        // \ " -> "
        // \ ' -> '
        // \\ -> \
        // \n xuống dòng
        // /t -> tab



        //printLn
        System.out.println("Java");
        System.out.println("Java");
        System.out.println("Java");


        // print
        System.out.print("JavaCore\n");
        System.out.print("JavaCore");
        System.out.print("JavaCore");

        // printf
        // %S: đại diện cho String
        // %d: đại điện cho  số nguyên
        // %f: đai diện cho số  thực
        // %c: đại diện cho kí tự
        // %n : xuống dòng
        System.out.printf("Họ tên: %s, tuổi: %d.%n", "Khoa", 20);

        // căn lề

        // gom nhóm làm tròn
        double money = 12345643442.789;
        System.out.printf("money = %,.2f", money);
        System.out.printf("money = %,f%n", money);
        System.out.printf("money = %,.2f%n", money);



    }
}
