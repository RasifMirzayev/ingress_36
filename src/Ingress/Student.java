package Ingress;

// sort metodu, find studnet by id, Contains Student by id, Clear All Studnet, Isempty , Update Student, Remove student by id , Add Stident
// Integer id, Student name , double Grade, Integer age
public class Student {
    private Integer id;
    private String name;
    private double grade;
    private Integer age;

    // Constructor
    public Student(Integer id, String name, double grade, Integer age) {
        this.id = id;
        this.name = name;
        this.grade = grade;
        this.age = age;
    }

    public Student() {

    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {

    }

    public double getGrade() {
        return grade;
    }

    public void setGrade(double grade) {
        this.grade = grade;
    }

    // Optionally, override toString for easy display
    @Override
    public String toString() {
        return "ID: " + id + ", Name: " + name + ", Grade: " + grade + ", Age: " + age;

    }

}