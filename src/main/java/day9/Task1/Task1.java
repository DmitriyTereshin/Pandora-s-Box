package day9.Task1;

public class Task1 {
    public static void main(String[] args) {
        Student student = new Student("Peter", "3611");
        Teacher teacher = new Teacher("Igor Anatolievich", "mathematics");

        System.out.println(student.getGroupName());
        System.out.println(teacher.getSubjectName());

        student.printInfo();
        teacher.printInfo();
    }
}
