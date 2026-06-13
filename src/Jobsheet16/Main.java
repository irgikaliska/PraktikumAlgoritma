package Jobsheet16;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Scanner;

public class Main {
    static List<Student> students = new ArrayList<>();
    static List<Course> courses = new ArrayList<>();
    static Queue<String> deleteQueue = new LinkedList<>(); // Queue untuk delete
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        courses.add(new Course("IF101", "Algorithms", 3));
        courses.add(new Course("IF102", "Data Structures", 3));
        courses.add(new Course("IF103", "Databases", 2));

        int choice;
        do {
            System.out.println("\n===== STUDENT GRADE SYSTEM =====");
            System.out.println("1. Add Student");
            System.out.println("2. Input Grade");
            System.out.println("3. Search Student");
            System.out.println("4. Sort by GPA");
            System.out.println("5. Queue Delete Student");
            System.out.println("6. Process Delete Queue");
            System.out.println("7. Display All Students");
            System.out.println("0. Exit");
            System.out.print("Choice: ");
            choice = sc.nextInt(); sc.nextLine();

            switch (choice) {
                case 1 -> addStudent();
                case 2 -> inputGrade();
                case 3 -> searchStudent();
                case 4 -> sortByGPA();
                case 5 -> queueDelete();
                case 6 -> processDeleteQueue();
                case 7 -> displayAll();
            }
        } while (choice != 0);
    }

    static void addStudent() {
        System.out.print("NIM: ");
        String nim = sc.nextLine();
        System.out.print("Name: ");
        String name = sc.nextLine();
        students.add(new Student(nim, name));
        System.out.println("Student added!");
    }

    static void inputGrade() {
        System.out.print("NIM: ");
        String nim = sc.nextLine();
        Student student = findStudent(nim);
        if (student == null) { System.out.println("Student not found!"); return; }

        System.out.println("Available courses:");
        for (int i = 0; i < courses.size(); i++)
            System.out.println((i + 1) + ". " + courses.get(i));

        System.out.print("Choose course (number): ");
        int idx = sc.nextInt() - 1; sc.nextLine();
        System.out.print("Score (0-100): ");
        double score = sc.nextDouble(); sc.nextLine();

        student.addGrade(new Grade(courses.get(idx), score));
        System.out.println("Grade added!");
    }

    static void searchStudent() {
        System.out.print("Enter NIM or Name: ");
        String keyword = sc.nextLine().toLowerCase();
        boolean found = false;
        for (Student s : students) {
            if (s.getNim().toLowerCase().contains(keyword) ||
                    s.getName().toLowerCase().contains(keyword)) {
                System.out.println("\n" + s);
                System.out.printf("%-30s | %5s | %s%n", "Course", "Score", "Grade");
                System.out.println("-".repeat(45));
                for (Grade g : s.getGrades()) System.out.println(g);
                found = true;
            }
        }
        if (!found) System.out.println("Student not found!");
    }

    static void sortByGPA() {
        students.sort((a, b) -> Double.compare(b.getGPA(), a.getGPA())); // descending
        System.out.println("\n=== Sorted by GPA (highest first) ===");
        for (Student s : students) System.out.println(s);
    }

    static void queueDelete() {
        System.out.print("Enter NIM to queue for deletion: ");
        String nim = sc.nextLine();
        if (findStudent(nim) == null) { System.out.println("Student not found!"); return; }
        deleteQueue.add(nim);
        System.out.println("Added to delete queue. Queue size: " + deleteQueue.size());
    }

    static void processDeleteQueue() {
        if (deleteQueue.isEmpty()) { System.out.println("Delete queue is empty!"); return; }
        String nim = deleteQueue.poll(); // ambil dari depan queue (FIFO)
        students.removeIf(s -> s.getNim().equals(nim));
        System.out.println("Student " + nim + " deleted!");
        System.out.println("Remaining in queue: " + deleteQueue.size());
    }

    static void displayAll() {
        if (students.isEmpty()) { System.out.println("No students yet!"); return; }
        System.out.println("\n=== ALL STUDENTS ===");
        for (Student s : students) System.out.println(s);
    }

    static Student findStudent(String nim) {
        for (Student s : students) if (s.getNim().equals(nim)) return s;
        return null;
    }
}
