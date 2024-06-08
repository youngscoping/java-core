import java.time.LocalDate;
import java.util.Random;
import java.util.Scanner;
import java.util.stream.DoubleStream;

public class Program1 {
    public static void main(String[] args) {

        Department department1 = new Department();
        department1.id = 1;
        department1.name = "Sale";

        Department department2 = new Department();
        department2.id = 2;
        department2.name = "Bảo vệ";

        Department department3 = new Department();
        department3.id = 3;
        department3.name = "Giám đốc";
        // Tạo Position
        Position position1  = new Position();
        position1.id = 1;
        position1.name = PositionName.DEV;

        Position position2 = new Position();
        position2.id = 2;
        position2.name = PositionName.TEST;

        Position position3 = new Position();
        position3.id = 3;
        position3.name = PositionName.SCRUM_MASTER;

        Position position4 = new Position();
        position4.id = 4;
        position4.name =  PositionName.PM;

        // Tạo account
        Account account1 = new Account();
        account1.id = 1;
        account1.email = "duongtrungkien@gmail.com";
        account1.userName = "kien322";
        account1.fullName = "Dương Trung Kiên";
        account1.department = department3;
        account1.position = position1;
        account1.createdDate = LocalDate.of(2020,05,02);



        Account account2 = new Account();
        account2.id = 2;
        account2.email = "tranducbo@gmail.com";
        account2.userName = "ducbo113";
        account2.fullName = "Trần Đức Bo";
        account2.department = department1;
        account2.position = position4;
        account2.createdDate = LocalDate.of(2021,11,19);

        Account account3 = new Account();
        account3.id = 3;
        account3.email = "nguyenvietanh@gmail.com";
        account3.userName = "vietanh99";
        account3.fullName = "Nguyễn Việt Anh";
        account3.department = department1;
        account3.position = position3;
        account3.createdDate = LocalDate.of(2020,9,2);

        Account account4 = new Account();
        account3.id = 19;
        account3.email = "nguyentienanh@gmail.com";
        account3.userName = "tienanh99";
        account3.fullName = "Nguyễn Tiến Anh";
        account3.department = department1;
        account3.position = position3;
        account3.createdDate = LocalDate.of(2020,9,2);

        // Group
        Group group1 = new Group();
        group1.id = 1;
        group1.name = "Developer";
        group1.creatorId = account2;
        group1.createdDate = LocalDate.now();




        Group group2 = new Group();
        group1.id = 2;
        group1.name = "Chatting";
        group1.creatorId = account3;
        group1.createdDate = LocalDate.now();


        Group group3 = new Group();
        group1.id = 3;
        group1.name = "Vi ti ai";
        group1.creatorId = account1;
        group1.createdDate = LocalDate.now();

        group1.accounts = new Account[] {account1, account2, account3};
        group2.accounts = new Account[] {account1, account3};
        group3.accounts = new Account[] { account3};
        // Group Account


        // Type Question
        TypeQuestion typeQuestion1 = new TypeQuestion();
        typeQuestion1.id  = 1;
        typeQuestion1.name = TypeName.ESSAY;

        TypeQuestion typeQuestion2 = new TypeQuestion();
        typeQuestion1.id  = 2;
        typeQuestion1.name = TypeName.MULTIPLE_CHOICE;

        // Cateagory Question
        CategoryQuestion categoryQuestion1 = new CategoryQuestion();
        categoryQuestion1.id = 1;
        categoryQuestion1.name = "Java";

        CategoryQuestion categoryQuestion2 = new CategoryQuestion();
        categoryQuestion1.id = 2;
        categoryQuestion1.name = "SQL";

        CategoryQuestion categoryQuestion3 = new CategoryQuestion();
        categoryQuestion1.id = 3;
        categoryQuestion1.name = "C++";

        CategoryQuestion categoryQuestion4 = new CategoryQuestion();
        categoryQuestion1.id = 4;
        categoryQuestion1.name = "Python";

        // Question
        Question question1 = new Question();
        question1.id = 1;
        question1.content = "Java là gì?";
        question1.categoryQuestion = categoryQuestion2;
        question1.typeQuestion = typeQuestion2;
        question1.account = account2;
        question1.createdDate = LocalDate.now();

        Question question2 = new Question();
        question1.id = 2;
        question1.content = "SQL là gì?";
        question1.categoryQuestion = categoryQuestion2;
        question1.typeQuestion = typeQuestion1;
        question1.account = account3;
        question1.createdDate = LocalDate.now();

        Question question3 = new Question();
        question1.id = 15;
        question1.content = "C++ là gì?";
        question1.categoryQuestion = categoryQuestion3;
        question1.typeQuestion = typeQuestion2;
        question1.account = account1;
        question1.createdDate = LocalDate.now();

        // Answer
        Answer answer1= new Answer();
        answer1.id =  1;
        answer1.content = "Java là 1 ngôn ngữ";
        answer1.question = question1;
        answer1.isCorrect = true;

        Answer answer2= new Answer();
        answer1.id =  2;
        answer1.content = "SQL là 1 ngôn ngữ";
        answer1.question = question2;
        answer1.isCorrect = true;

        Answer answer3= new Answer();
        answer1.id =  3;
        answer1.content = "C++ là 1 ngôn ngữ";
        answer1.question = question3;
        answer1.isCorrect = true;

        // Exam
        Exam exam1 = new Exam();
        exam1.id =1;
        exam1.code = "A123";
        exam1.title = "Bài thi Java";
        exam1.categoryQuestion = categoryQuestion1;
        exam1.duration = 60;
        exam1.creatorId = account2;
        exam1.createdDate = LocalDate.now();

        Exam exam2 = new Exam();
        exam1.id =1;
        exam1.code = "A345";
        exam1.title = "Bài thi SQL";
        exam1.categoryQuestion = categoryQuestion2;
        exam1.duration = 60;
        exam1.creatorId = account3;
        exam1.createdDate = LocalDate.now();

        Exam exam3 = new Exam();
        exam1.id =3;
        exam1.code = "A123";
        exam1.title = "Bài thi C++";
        exam1.categoryQuestion = categoryQuestion3;
        exam1.duration = 60;
        exam1.creatorId = account1;
        exam1.createdDate = LocalDate.now();

        // Exam Question
        ExamQuestion examQuestion1 = new ExamQuestion();
        examQuestion1.exam = exam1;
        examQuestion1.question = question2;

        ExamQuestion examQuestion2 = new ExamQuestion();
        examQuestion1.exam = exam2;
        examQuestion1.question = question3;

        ExamQuestion examQuestion3 = new ExamQuestion();
        examQuestion1.exam = exam3;
        examQuestion1.question = question1;

        ExamQuestion examQuestion4 = new ExamQuestion();
        examQuestion1.exam = exam1;
        examQuestion1.question = question3;


        // Exercise 1: Flow Control - Tiếp tục bài tập Day 01
//        Question 1:
//        Kiểm tra account thứ 2
//        Nếu không có phòng ban (tức là department == null) thì sẽ in ra text "Nhân viên này chưa có phòng ban"
//        Nếu không thì sẽ in ra text "Phòng ban của nhân viên này là …
        if (account2.department == null) {
            System.out.println("Nhân viên chưa có phòng ban");
        } else {
            System.out.println("Phòng ban của nhân viên này là:" + account2.department.name);
        }


//        Question 2:
//        Kiểm tra account thứ 2
//        Nếu không có group thì sẽ in ra text "Nhân viên này chưa có group"
//        Nếu có mặt trong 1 hoặc 2 group thì sẽ in ra text "Group của nhân viên này là Java Fresher, C# Fresher"
//        Nếu có mặt trong 3 Group thì sẽ in ra text "Nhân viên này là người quan trọng, tham gia nhiều group"
//        Nếu có mặt trong 4 group trở lên thì sẽ in ra text "Nhân viên này là người hóng chuyện, tham gia tất cả các group"



//        Question 3:
//        Sử dụng toán tử ternary để làm Question 1
         System.out.println(account2.department == null ? "Nhân viên này chưa có phòng ban" : "Phòng ban của nhân viên này là" + account2.department.name)  ;

//        Question 4:
//        Sử dụng toán tử ternary để làm yêu cầu sau:
//        Kiểm tra Position của account thứ 1
//        Nếu Position = Dev thì in ra text "Đây là Developer"
//        Nếu không phải thì in ra text "Người này không phải là Developer"

         System.out.println(account1.position.name == PositionName.DEV ? "Đây là developer" : "Người này không phải Developer");

        // SWITCH CASE
        // Question 5:
//        Lấy ra số lượng account trong nhóm thứ 1 và in ra theo format sau:
//        Nếu số lượng account = 1 thì in ra "Nhóm có một thành viên"
//        Nếu số lượng account = 2 thì in ra "Nhóm có hai thành viên"
//        Nếu số lượng account = 3 thì in ra "Nhóm có ba thành viên"
//        Còn lại in ra "Nhóm có nhiều thành viên"
        int soLuongAccount = group1.accounts.length ;
        switch (soLuongAccount) {
            case 1:
                System.out.println("Nhóm có 1 thành viên");
                break;
            case 2:
                System.out.println("Nhóm có 2 thành viên");
                break;
            case 3:
                System.out.println("Nhóm có 3 thành viên");
                break;
            default:
                System.out.println("Nhóm có nhiều thành viên");
                break;
        }

//        FOREACH
//        Question 8:
//        In ra thông tin các account bao gồm: Email, FullName và tên phòng ban của họ

            Account[] accRay = {account1, account2, account3};
            for (Account account : accRay) {
                System.out.println("Thông tin của account thứ: "  + account.id);

                System.out.println("Email:" + account.email);
                System.out.println("Full Name:" + account.fullName);
                System.out.println();
            }

//        Question 9:
//        In ra thông tin các phòng ban bao gồm: id và name
         Department[] depRay = {department1, department2, department3};
         for (Department moiPhanTuDepartment :  depRay) {
             System.out.println("Thông tin phòng ban thứ: " + moiPhanTuDepartment.id);
             System.out.println("Tên phòng ban:" + moiPhanTuDepartment.name);
             System.out.println();
         }

//        FOR
//        Question 10:
//        In ra thông tin các account bao gồm: Email, FullName và tên phòng ban của
//        họ theo định dạng như sau:

        Account[] accRay10 = {account1, account2, account3};

         for (int z = 1; z <= accRay10.length; z++) {
            System.out.println("Thông tin account thứ " + z + " là:");
            System.out.println("Email: " + accRay10[z-1].email);
            System.out.println("Full Name: " + accRay10[z-1].fullName);
            System.out.println("Tên phòng ban: " + accRay10[z-1].department.name);
            System.out.println();

        }

       // Question 11:
        //In ra thông tin các phòng ban bao gồm: id và name theo định dạng sau:
        Department[] depRay11 = {department1, department2, department3};
         for (int e = 1; e <= depRay11.length; e++) {
             System.out.println("Thông tin phòng ban thứ " + e + " là:");
             System.out.println("Tên phòng ban:" + depRay11[e-1].name );
             System.out.println();
         }

//        Question 13:
//        In ra thông tin tất cả các account ngoại trừ account thứ 2
        Account[] accRay13 = {account1, account2, account3};
        for (int r = 1; r <= accRay13.length; r++) {
            if (r != 2) {
                System.out.println("id: " + accRay13[r-1].id);
                System.out.println("tên:" + accRay13[r-1].fullName);
                System.out.println("email:" + accRay13[r-1].email);
                System.out.println();
            }
        }

//        Question 14:
//        In ra thông tin tất cả các account có id < 4

  /*      Account[] accRay14 = {account1, account2, account3,account4};
        for (int o = 1; o <= accRay14.length; o++) {
            if (accRay14[o].id < 10) {
                System.out.println("id: " + accRay14[o-1].id);
                System.out.println("tên:" + accRay14[o-1].fullName);
                System.out.println("email:" + accRay14[o-1].email);
                System.out.println();
            }
        }
 */

//        Question 15:
//        In ra các số chẵn nhỏ hơn hoặc bằng 20
        int soChan;
        for (soChan = 0; soChan <= 20; soChan++) {
            if(soChan%2 == 0) {
                System.out.println(soChan);
            }
        }

//        Exercise 2: System out printf
//        Question 1:
//        Khai báo 1 số nguyên = 5 và sử dụng lệnh System out printf để in ra số
//        nguyên đó
        int cau1 = 5;
        System.out.println(cau1);

//
//        Question 2:
//        Khai báo 1 số nguyên = 100 000 000 và sử dụng lệnh System out printf để in
//        ra số nguyên đó thành định dạng như sau: 100,000,000
        int cau2 = 100000000;
        System.out.printf("%,d %n", cau2);
        System.out.println();


//        Question 3:
//        Khai báo 1 số thực = 5,567098 và sử dụng lệnh System out printf để in ra số
//        thực đó chỉ bao gồm 4 số đằng sau
        double cau3 = 5.567098;
        System.out.printf("5.4%n",cau3);


//        Exercise 4: Random Number
//        Question 1:
//        In ngẫu nhiên ra 1 số nguyên
        Random random = new Random();
        int soNguyen = random.nextInt();
        System.out.println(soNguyen);

//        Question 2:
//        In ngẫu nhiên ra 1 số thực


       // Exercise 5: Input from console
//        Question 1:
//        Viết lệnh cho phép người dùng nhập 3 số nguyên vào chương trình.


        Scanner scanner = new Scanner(System.in);
        /*
        System.out.println("Nhập số thứ nhất");
        int soThuNhat = scanner.nextInt();
        System.out.println("Số thứ nhất là " + soThuNhat);
        System.out.println("Nhập số thứ nhất");
        int soThuHai = scanner.nextInt();
        System.out.println("Số thứ hai là " + soThuHai);
        System.out.println("Nhập số thứ nhất");
        int soThuBa = scanner.nextInt();
        System.out.println("Số thứ ba là " + soThuBa);


   */


//        Question 5:
//        Viết lệnh cho phép người dùng tạo account (viết thành method)
//        Đối với property Position, Người dùng nhập vào 1 2 3 4 5 và vào
//        chương trình sẽ chuyển thành Position.Dev, Position.Test, Position.ScrumMaster, Position.PM.

            /*
            Account account00 = new Account();

            System.out.println("Nhập vào id :");
            int accId = scanner.nextInt() ;
            account00.id = accId;

            System.out.println("Nhập vào Email:");
            String emailId = scanner.nextLine();
            account00.email = emailId;


            System.out.println("Nhập vào Full Name:");
            String fullNameId = scanner.nextLine();
            account00.fullName = fullNameId;


            System.out.println("Nhập vào Department");
            String departmentName = scanner.nextLine();
            account00.department.name = departmentName;

            int positionId = scanner.nextInt();
            switch (positionId) {
                case 1:
                    Position pos1 = new Position();

                    pos1.name = PositionName.DEV;
                    account00.position = pos1;
                break;

                case 2:
                    Position pos2 = new Position();

                    pos2.name = PositionName.TEST;
                    account00.position = pos2;
                    break;
                case 3:
                    Position pos3 = new Position();

                    pos3.name = PositionName.SCRUM_MASTER;
                    account00.position = pos3;
                    break;
                case 4:
                    Position pos4 = new Position();

                    pos4.name = PositionName.PM;
                    account00.position = pos4;
            }

            System.out.println("thông tin account");
            System.out.println("tên:" +account00.fullName);
            System.out.println("email: " + account00.email);
            System.out.println("chức vụ:" + account00.position.name);

            */

//        Question 7:
//        Nhập số chẵn từ console






    }


}
