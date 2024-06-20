package Excercise01;

public class Program {
    public static void main(String[] args) {
        innitStudent();
    }

    // QUESTION 1
    static void innitStudent() {
        for ( int i = 0; i < 3 ; i ++) {
            Student student = new Student((i+1), "Student " + (i+1));
            Student.changeCollege();
            System.out.println(student);
            System.out.println();
        }


    // QUESTION 2
        System.out.println("Student nộp quỹ");
        System.out.println("Tổng quỹ là : " + (Student.moneyGroup += 300));
        System.out.println("Student 1 lấy 50k đi mua bim bim, kẹo về liên hoan, tổng quỹ là:" + (Student.moneyGroup -= 50));
        System.out.println("Student 2 lấy 20k mua bánh mì, tổng quỹ là:" + (Student.moneyGroup -= 20));
        System.out.println("Student 3 lấy 150k mua đồ dùng học tập, còn lại:" + (Student.moneyGroup -= 150));
        System.out.println("Student nộp quỹ 50k:" + (Student.moneyGroup += 150));


     }



}
