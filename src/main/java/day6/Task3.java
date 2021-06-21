package day6;

public class Task3 {
    public static void main(String[] args) {
        Teacher teacher = new Teacher("Игорь Анатольевич", "Физика");
        Student student = new Student("Петр");

        teacher.evaluate(student);
    }
}
