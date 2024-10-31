package Ingress;

public class Main {
    public static void main(String[] args) {
        StudentManager manager = new StudentManager();
        manager.addStudent(new Student(1, "Rasif", 20, 90.5));
        manager.addStudent(new Student(2, "Sənan", 21, 90.2));
        manager.addStudent(new Student(3, "Kənan", 21, 80.2));

        System.out.println("All Students:");
        manager.displayStudents();
        System.out.println("-------------------------------------------");

        System.out.println("Finding Student with ID 2:");
        Student foundStudent = manager.findStudentById(2);
        System.out.println(foundStudent);
        System.out.println("-------------------------------------------");



        System.out.println("Sorting Students by Name:");
        manager.sortStudentsByName();
        manager.displayStudents();
        System.out.println("--------------------------------------------");


        System.out.println("Removing Student with ID 1:");
        manager.removeStudent(1);
        manager.displayStudents();
        System.out.println("--------------------------------------------");


        System.out.println("Clearing All Students:");
        manager.clearAllStudents();
        System.out.println("Is empty? " + manager.isEmpty());


    }
}