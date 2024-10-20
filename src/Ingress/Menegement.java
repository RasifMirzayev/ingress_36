package Ingress;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Menegement {
    static List<Student> students = new ArrayList<>();


    public static void addStudent(Student student) {
        students.add(student);

    }

    public static void updateStudent(Integer id, String name, Integer age, double grade) {
        for (Student student : students) {
            if (student.getId().equals(id)) {
                student.setName(name);
                student.setGrade(grade);
                student.setAge(age);
                break;
            }
        }
    }

    public static Student findStudentById(Integer id) {
        for (Student student : students) {
            if (student.getId().equals(id)) {
                return student;
            }
        }
        return null;
    }

    public static void clearAllStudents(String bəli) {
        students.clear();
    }

    public static boolean isEmpty() {
        return students.isEmpty();
    }

    public static void displayStudents() {
        for (Student student : students) {
            System.out.println(student);
        }
    }

    public static void clearAllStudents() {
    }


    public void sortStudentsByName() {
        students.sort(Comparator.comparing(Student::getName));
    }

    public static void removeStudent(Student student) {
        students.remove(student);


    }
}

