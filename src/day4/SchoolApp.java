package day4;

public class SchoolApp {
    public static void main(String[] args) {
        Student student1 = new Student();
        student1.setStudentClass("A");
        student1.setAge(12);
        student1.setRollNumber(6);
        student1.setRollNumber(1);
        student1.takeLeave();

        Teacher teacher1 = new Teacher();
        teacher1.setSubject("B");
        teacher1.setAge(30);
        teacher1.setSubject("Computer");
        teacher1.takeLeave();


    }
}
