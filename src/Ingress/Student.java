package Ingress;

// sort metodu, find studnet by id, Contains Student by id, Clear All Studnet, Isempty , Update Student, Remove student by id , Add Stident
// Integer id, Student name , double Grade, Integer age
public class Student {
    private String name;
    private Integer id;
    private Double grade;
    private Integer age;

    public Student(Integer id, String name, Integer age, double grade) {
        this.id = id;
        this.name = name;
        this.grade = grade;
        this.age = age;
    }

    public Student() {

    }

    // Getter və Setter metodları
    public Integer getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public double getGrade() {
        return grade;
    }

    public Integer getAge() {
        return age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setGrade(double grade) {
        this.grade = grade;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", grade=" + grade +
                ", age=" + age +
                '}';


    }

    public void addStudent(Student rasif) {
    }

    public void displayStudents() {
    }

    public int findStudentById(int i) {

        return i;
    }

    public void updateStudent(int i, String rasif, int i1, double v) {
    }

    public void isEmpty() {
        return ;
    }
}

