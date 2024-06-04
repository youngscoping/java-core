import java.time.LocalDate;

public class Program1 {
    public static void main(String[] args) {
        // Câu 2: Tạo file Program.java có chứa main() method và khởi tạo ít nhất 3 đối tượng đối với mỗi table trong java
        //
        // Tạo Department
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
        account2.department = department2;
        account2.position = position4;
        account2.createdDate = LocalDate.of(2021,11,19);

        Account account3 = new Account();
        account2.id = 3;
        account2.email = "nguyenvietanh@gmail.com";
        account2.userName = "vietanh99";
        account2.fullName = "Nguyễn Việt Anh";
        account2.department = department1;
        account2.position = position3;
        account2.createdDate = LocalDate.of(2020,9,2);

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

        // Group Account
        GroupAccount groupAccount1 = new GroupAccount();
        groupAccount1.groupId = group3;
        groupAccount1.accountId = account1;

        GroupAccount groupAccount2 = new GroupAccount();
        groupAccount1.groupId = group1;
        groupAccount1.accountId = account2;

        GroupAccount groupAccount3= new GroupAccount();
        groupAccount1.groupId = group2;
        groupAccount1.accountId = account3;

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
        question1.id = 3;
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

        // Câu 3   Trong file Program.java, hãy in ít nhất 1 giá trị của mỗi đối tượng ra.
        System.out.println("Thông tin của Account 1 là:");
        System.out.println("Account ID: " + account1.id);
        System.out.println("Email: " + account1.email);
        System.out.println("User name: " + account1.userName);
        System.out.println("Full Name: " + account1.fullName);
        System.out.println("Department ID:" + account1.department.id);
        System.out.println("Position ID: " + account1.position.id);
        System.out.println("Ngày tạo:" + account1.createdDate);

    }
}
