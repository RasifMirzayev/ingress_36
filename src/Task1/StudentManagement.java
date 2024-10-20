package Task1;

import java.util.Objects;


public final class StudentManagement {
    private static final Student[] STUDENTS = new Student[10];
    private static Student student;


    public static void main(String[] args) {
        Student student1= new Student("Rovsan",95);
        Student student2= new Student("Kənan",65);
        Student student3=new Student("Lamiyə",55);

        Student.addStudent(student1);
        Student.addStudent(student2);
        Student.addStudent(student3);


        System.out.println(student1);
        System.out.println(student2);
        System.out.println(student3);


    }

    public static void printAllstudents() {
        for (Student student : STUDENTS)
            System.out.println(student);


    }

    public static void printAllstudentThanGreaterThen(int grade) {
        for (Student student1 : STUDENTS)
            if (student.getGrade() > grade) {
                System.out.println(grade);
            }
    }

    public static void addStudent(Student student) {
        if (Objects.nonNull(student)) {
            for (int i = 0; i < STUDENTS.length; i++) {
                if (Objects.isNull(STUDENTS[i])) {
                    STUDENTS[i] = student;
                    break;
                }
            }
        }
    }
}


