package Jobsheet16;
import java.util.ArrayList;
import java.util.List;

public class Student {
    private String nim;
    private String name;
    private List<Grade> grades;

    public Student(String nim, String name) {
        this.nim = nim;
        this.name = name;
        this.grades = new ArrayList<>();
    }

    public void addGrade(Grade grade) {
        grades.add(grade);
    }

    public double getGPA() {
        if (grades.isEmpty()) return 0;
        double total = 0;
        for (Grade g : grades) total += g.getScore();
        return total / grades.size();
    }

    public String getNim() { return nim; }
    public String getName() { return name; }
    public List<Grade> getGrades() { return grades; }

    @Override
    public String toString() {
        return nim + " - " + name + " | GPA: " + String.format("%.2f", getGPA());
    }
}

