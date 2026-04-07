package Week6;

import java.util.Scanner;

public class lecturerDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter max size: ");
        int size = Integer.parseInt(sc.nextLine());
        lecturerData data = new lecturerData(size);

        int choice;
        do {
            System.out.println("\n1. Add Data");
            System.out.println("2. Display Data");
            System.out.println("3. Sort ASC");
            System.out.println("4. Sort DSC");
            System.out.println("5. Exit");
            System.out.print("Choice: ");
            choice = Integer.parseInt(sc.nextLine());

            switch (choice) {
                case 1:
                    System.out.println("Add student data: ");
                    System.out.print("ID: ");
                    String id = sc.nextLine();
                    System.out.print("Name: ");
                    String name = sc.nextLine();
                    System.out.print("Gender (true=Male, false=Female): ");
                    boolean gender = Boolean.parseBoolean(sc.nextLine());
                    System.out.print("Age: ");
                    int age = Integer.parseInt(sc.nextLine());
                    data.add(new Lecturer(id, name, gender, age));
                    break;
                case 2:
                    data.print();
                    break;
                case 3:
                    data.sortingASC();
                    System.out.println("Sorted ASC by age:");
                    data.print();
                    break;
                case 4:
                    data.sortingDSC();
                    System.out.println("Sorted DSC by age:");
                    data.print();
                    break;
                case 5:
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Invalid choice!");
            }
        } while (choice != 5);
    }
}

