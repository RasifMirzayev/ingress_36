package Task1;

import java.util.UUID;

public class Student {
    private final String name;
    private final int grade;
    private final String id;
    public Student(String name, int grade) {
        this.name = name;
        this.grade = grade;
        id = UUID.randomUUID().toString();
    }

    public static void addStudent(Student student1) {

    }


    public String getName() {
        return name;
    }

    public String getId() {
        return id;
    }

    public int getGrade() {
        return grade;
    }

    @Override
    public String toString() {
        return "Student{id=" + id + ",name='" + name + "',grade=" + grade + '}';
    }




}







