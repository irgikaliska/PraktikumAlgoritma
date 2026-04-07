package Week6;

public class Student14 {
    String nim;
    String name;
    String studentClass;
    double gpa;

    public Student14(){

    }
    public Student14(String nim, String nm, String studentClass, double gpa) {
        this.nim = nim;
        name = nm;
        this.studentClass = studentClass;
        this.gpa = gpa;
    }

    public void print() {
        System.out.println("NIM: " + nim + ", Name: " + name + ", Class: " + studentClass + ", GPA: " + gpa);
    }
}
