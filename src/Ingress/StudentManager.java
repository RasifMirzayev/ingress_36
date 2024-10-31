package Ingress;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

class StudentManager {
      private List<Student> students;

      public StudentManager() {
          this.students = new ArrayList<>();
      }

      public void addStudent(Student student) {
          students.add(student);
      }

      public void removeStudent(Integer id) {
          students.removeIf(student -> student.getId().equals(id));
      }

      public void updateStudent(Student updatedStudent) {
          for (int i = 0; i < students.size(); i++) {
              if (students.get(i).getId().equals(updatedStudent.getId())) {
                  students.set(i, updatedStudent);
                  break;
              }
          }
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