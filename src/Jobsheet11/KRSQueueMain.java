package Jobsheet11;

import java.util.Scanner;

public class KRSQueueMain {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);


        KRSQueue queue = new KRSQueue(10);

        int choice;

        do {
            System.out.println("\n=== KRS Approval Menu ===");
            System.out.println("1. Add Student");
            System.out.println("2. Process 2 Students");
            System.out.println("3. Show Queue");
            System.out.println("4. Show First 2 Students");
            System.out.println("5. Show Last Student");
            System.out.println("6. Queue Information");
            System.out.println("7. Clear Queue");
            System.out.println("0. Exit");
            System.out.print("Choose: ");

            choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {

                case 1:
                    System.out.print("NIM: ");
                    String nim = sc.nextLine();

                    System.out.print("Name: ");
                    String name = sc.nextLine();

                    System.out.print("Study Program: ");
                    String studyProgram = sc.nextLine();

                    System.out.print("Class: ");
                    String className = sc.nextLine();

                    Student s = new Student(nim, name, studyProgram, className);

                    queue.enqueue(s);
                    break;

                case 2:
                    queue.dequeue2();
                    break;

                case 3:
                    queue.printQueue();
                    break;

                case 4:
                    queue.peekFront2();
                    break;

                case 5:
                    queue.viewRear();
                    break;

                case 6:
                    queue.printInfo();
                    break;

                case 7:
                    queue.clear();
                    break;

                case 0:
                    System.out.println("Program finished");
                    break;

                default:
                    System.out.println("Invalid menu!");
            }

        } while (choice != 0);
    }
}
