package Week6;

import java.util.Scanner;

public class studentDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter size: ");
        int size = Integer.parseInt(sc.nextLine());
        topStudent topStudents = new topStudent(size);

        for (int i = 0; i < size; i++) {
            System.out.println("Enter data for student " + (i + 1) + ":");
            System.out.print("NIM: ");
            String nim = sc.nextLine();
            System.out.print("Name: ");
            String name = sc.nextLine();
            System.out.print("Class: ");
            String studentClass = sc.nextLine();
            System.out.print("GPA: ");
            double gpa = Double.parseDouble(sc.nextLine());

            topStudents.add(new Student14(nim, name, studentClass, gpa));}

//           topStudents.add(new Student14("2201", "Alice", "A", 3.9));
//           topStudents.add(new Student14("2202", "Bob", "B", 3.7));
//           topStudents.add(new Student14("2203", "Charlie", "C", 3.8));
//           topStudents.add(new Student14("2204", "David", "D", 3.6));
//           topStudents.add(new Student14("2205", "Eve", "E", 4.0));

        System.out.println("Original student list:");
        topStudents.print();

        topStudents.bubbleSort();
        System.out.println("Sorted student list (by GPA, descending):");
        topStudents.print();

        topStudents.selectionSort();
        System.out.println("Sorted student list (by GPA, ascending) using Selection sort: ");
        topStudents.print();

        topStudents.insertionSort();
        System.out.println("Sorted student list (by GPA, ascending) using Insertion sort: ");
        topStudents.print();
        }
    }
