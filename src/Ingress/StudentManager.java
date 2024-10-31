package Ingress;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

class StudentManager {
    private final List<Student> students;

    public StudentManager() {
        this.students = new ArrayList<>();
    }

    public void addStudent(Student student) {
        students.add(student);
    }

    public void removeStudent(Integer id) {
        students.removeIf(student -> student.getId().equals(id));
    }

    public Student findStudentById(Integer id) {
        for (Student student : students) {
            if (student.getId().equals(id)) {
                return student;
            }
        }
        return null;
    }

    public void clearAllStudents() {
        students.clear();
    }

    public boolean isEmpty() {
        return students.isEmpty();
    }

    public void displayStudents() {
        if (isEmpty()) {
            System.out.println("No students to display.");
        } else {
            for (Student student : students) {
                System.out.println(student);
            }
        }
    }

    public void sortStudentsByName() {
        students.sort(Comparator.comparing(Student::getName));
    }
}
