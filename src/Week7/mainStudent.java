package Week7;

import java.util.Scanner;

public class mainStudent {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        SearchStudent data = new SearchStudent();
        System.out.println("Input amount of student");
        int amountStudent = Integer.parseInt(sc.nextLine());


        System.out.println("--------------------------------");
        System.out.println("Input student data accordingly from smallest NIM");
        for (int i = 0; i < amountStudent; i++) {
            System.out.println("-----------");
            System.out.print("NIM\t:");
            int nim = Integer.parseInt(sc.nextLine());

            System.out.print("Name\t:");
            String name = sc.nextLine();

            System.out.print("Age\t:");
            int age = Integer.parseInt(sc.nextLine());

            System.out.print("GPA\t:");
            double gpa = Integer.parseInt(sc.nextLine());

            Students std = new Students(nim, age, name, gpa);
            data.add(std);
        }

        System.out.println("------------------------");
        System.out.println("Entire Student data");
        data.display();

        System.out.println("________________________");
        System.out.println("________________________");
        System.out.println("Search student by NIM: ");
        int search = sc.nextInt();
        System.out.println("Using sequential search");
        int position = data.findSeqSearch(search);

        data.showPosition(search, position);
        data.showData(search,position);

        System.out.println("=========================");
        System.out.print("Search student by NIM:");
        System.out.println("Using binary Search");
        int position1 = data.findBinarySearch(search, 0, amountStudent -1);

        data.showPosition(search, position1);
        data.showData(search, position1);
    }
}
