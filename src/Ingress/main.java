package Ingress;

public class main {
    public static void main(String[] args) {
        StudentManager manager = new StudentManager();

        manager.addStudent(new Student(1, "Alice", 90.0, 20));
        manager.addStudent(new Student(2, "Bob", 85.5, 22));
        manager.addStudent(new Student(3, "Charlie", 92.0, 21));

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