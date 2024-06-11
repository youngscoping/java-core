import java.util.Scanner;

public class Excercise04 {
    void question01() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập vào xâu kí tự:");
        String s = scanner.nextLine();
        String[] words = s.split(" ");
        int count = 0;
        for (String word : words) {
            if (!word.isEmpty()) {
                count++;
            }
        }
        System.out.println("số từ là:" + count);
    }

    void question02() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập vào kí tự s1");
        String s1 = scanner.nextLine();
        System.out.println("Nhập vào kí tự s2");
        String s2 = scanner.nextLine();
        System.out.println(s1.concat(s2));
    }

    void question03() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập tên");
        String name = scanner.nextLine();
        String capitalized = name.substring(0,1).toUpperCase() + name.substring(1);
        System.out.println(capitalized);
    }

    void question04() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập tên");
        String name = scanner.nextLine();
        for (int i = 0; i < name.length(); i++) {
            System.out.println("Kí tự thứ " + (i+1) + " là: " + name.charAt(i));
        }
    }



    void question05() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập họ:");
        String last = scanner.nextLine();
        System.out.println("Nhập tên:");
        String first = scanner.nextLine();
        System.out.println(last.concat(" " + first));
    }

    void question06() {
        Scanner scanner = new Scanner(System.in);
        String firstName = "";
        String middleName = "";
        String lastName = "";
        System.out.println("Nhập tên:");
        String fullName = scanner.nextLine();
        fullName = fullName.trim();
        String words[] = fullName.split(" ");
        lastName = words[0];
        firstName = words[words.length - 1];
         for (int i = 1; i < words.length -2 ; i++) {
             middleName += words[i] + " ";

         }
        System.out.println("Họ là:" + firstName);
        System.out.println("Tên đệm là:" + middleName);
        System.out.println("Tên là:" + lastName);
        scanner.close();

    }

    void question08() {
        String groups[] = {"lớp học Java", "lớp học SQL", "lớp Java nâng cao", "phòng ôn thi Java"};
        for (String group : groups) {  // vòng for đếm các phần tử group nằm trong mảng groups
                if (group.contains("Java")) { // chèn câu điều kiện nếu phần tử group chứa từ Java
                    System.out.println("Tên các nhóm chứa tên Java là: " + group); // nếu có thì in ra group đó
            }
        }
     }

     void question10 () {
        Scanner scanner = new Scanner(System.in);

        System.out.println("mời nhập chuỗi đầu tiên");
        String s1 = scanner.nextLine();
        System.out.println("mời nhập chuỗi thứ hai");
        String s2 = scanner.nextLine();

        for (int i = 0; i < s1.length(); i++) {
            char c1 = s1.charAt(i);
            char c2 = s2.charAt(s1.length() - 1 - i);
            if (c1 != c2) {
                System.out.println("KO");

            }    else {
                System.out.println("Ok");
            }
        }
    }

    String question15(String s){
        String[] words = s.split(" "); // duong trung kien -> {duong, trung, kien}
        String result = ""; // result trả về chuỗi ngược
        for (int i = words.length- 1; i >= 0; i--) { // i = 3-1; i giảm dần
            result += words[i] + " "; //
        }
        return result.trim();
    }
}
