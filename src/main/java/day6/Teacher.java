package day6;

import java.util.Random;

public class Teacher {
    private String name;
    private String subject;

    public Teacher(String name, String subject) {
        this.name = name;
        this.subject = subject;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public void evaluate(Student student) {
        int grade;
        String gradeLine = "";
        Random random = new Random();

        grade = random.nextInt(4) + 2;

        switch (grade) {
            case 2:
                gradeLine = "Неудовлитворительно";
                break;
            case 3:
                gradeLine = "Удовлетворительно";
                break;
            case 4:
                gradeLine = "Хорошо";
                break;
            case 5:
                gradeLine = "Отлично";
                break;
        }

        System.out.println("Преподаватель " + this.getName() + " оценил студента с именем " + student.getName() + " по предмету " + this.subject + " на оценку " + gradeLine);
    }
}
