package Excericise01;

import java.util.ArrayList;
import java.util.List;

public class StudentMethod {
    List<Student>studentList = new ArrayList<>();

     void themStudent() {
        for (int i = 0; i < 3; i++) {
            Student student = new Student(i+1, "student");
            studentList.add(student);
        }
         System.out.println("Tổng số phần tử là: " +studentList.size());
    }

    void layPhanTuStudent() {
        try {
        for (int i = 0; i < 3; i++) {
            Student student = new Student(i+1, "student");
            studentList.add(student);

        } System.out.println("Phần tử thứ tư của student là:" + studentList.get(4));
           }  catch (IndexOutOfBoundsException exception) {
            exception.getMessage();
        }
        finally {
            System.out.println("Chỉ có " + studentList.size() + " phần tử");
        }
    }

    void firstAndLastElement() {
        for (int i = 0; i < 3; i++) {
            Student student = new Student(i+1, "student");
            studentList.add(student);
        }
        System.out.println("Phần tử đầu và cuối là");
        System.out.println(studentList.get(0));
        System.out.println(studentList.get( studentList.size()- 1 ));
    }

    void addToFirstElement() {
        for (int i = 0; i < 3; i++) {
            Student student = new Student(i+1, "student");
            studentList.add(student);
        }

        studentList.add(0 , new Student( (studentList.size() +1 ) , "new student"));
        System.out.println(studentList.get(0));
     }

    void addToLastElement() {
        for (int i = 0; i < 3; i++) {
            Student student = new Student(i+1, "student");
            studentList.add(student);
        }

        studentList.add( new Student( (studentList.size() +1 ) , "last student"));
        System.out.println(studentList.get(studentList.size() - 1));
    }

    void deleteStudentById() {
         try {
             for (int i = 0; i < 3; i++) {
                 Student student = new Student(i+1, "student");
                 studentList.add(student);
             }
             for (Student student : studentList) {
                 if (student.getId() == 1) {
                     studentList.remove(1);
                     System.out.println("Đã xoá!");
                 }
             }
         } catch (Exception exception) {
             exception.getMessage();
         } finally {
             System.out.println("Chỉ có " + studentList.size() + " học sinh, không thể xoá");
         }
    }



}
