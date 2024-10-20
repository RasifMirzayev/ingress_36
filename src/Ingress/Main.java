package Ingress;

public class Main {
    public static void main(String[] args) {
        Student Menegement = new Student();

        Ingress.Menegement.addStudent(new Student(1, "Rasif",20 ,73.0));
        Ingress.Menegement.addStudent(new Student(2, "Sənan", 20, 55));
        Ingress.Menegement.addStudent(new Student(3, "Kənan", 21, 60));

        System.out.println("Bütün Tələbələr");
        Ingress.Menegement.displayStudents();
        System.out.println("-----------------------------------------------");

        System.out.println("İd-i 1 olan tələbə");
        System.out.println(Ingress.Menegement.findStudentById(1));
        System.out.println("-----------------------------------------------");

        Ingress.Menegement.updateStudent(1,"Rasif",20, 73.0);
        System.out.println("Yenilənmiş Tələbə");
        Ingress.Menegement.displayStudents();
        System.out.println("---------------------------------------------------");



        System.out.println("Siyahı boşdur? : " + Ingress.Menegement.isEmpty());

        Ingress.Menegement.clearAllStudents();
        System.out.println("Təmizləndi");
        System.out.println("Siyahı boşdur? : " + Ingress.Menegement.isEmpty());








    }
}
