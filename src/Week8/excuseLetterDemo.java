package Week8;

import java.util.Scanner;

public class excuseLetterDemo {
    public static void main(String[] args) {
        excuseLetterStack stack = new excuseLetterStack(5);
        Scanner sc = new Scanner(System.in);
        int choice;

        do {
            System.out.println("\nMenu:");
            System.out.println("1. Submit Excuse Letter");
            System.out.println("2. Process Excuse Letter");
            System.out.println("3. View Latest Letter");
            System.out.println("4. View All Letters");
            System.out.println("5. Search by Name");
            System.out.println("0. Exit");
            System.out.print("Choose a menu: ");
            choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {
                case 1:
                    System.out.print("NIM: ");
                    String nim = sc.nextLine();
                    System.out.print("Name: ");
                    String name = sc.nextLine();
                    System.out.print("Reason: ");
                    String reason = sc.nextLine();
                    System.out.print("Date (dd/mm/yyyy): ");
                    String date = sc.nextLine();
                    excuseLetter letter = new excuseLetter(nim, name, reason, date);
                    stack.push(letter);
                    System.out.println(name + "'s excuse letter has been submitted!!");
                    break;

                case 2:
                    excuseLetter processed = stack.pop();
                    if (processed != null) {
                        System.out.println("Processing letter from: " + processed.name);
                        System.out.println("Reason: " + processed.reason);
                        System.out.println("Letter has been processed!!");
                    }
                    break;

                case 3:
                    excuseLetter latest = stack.peek();
                    if (latest != null) {
                        System.out.println("Latest letter from: " + latest.name);
                        System.out.println("Reason: " + latest.reason);
                        System.out.println("Date: " + latest.date);
                    }
                    break;

                case 4:
                    stack.print();
                    break;

                case 5:
                    System.out.print("Enter name to search: ");
                    String search = sc.nextLine();
                    stack.searchByName(search);
                    break;

                case 0:
                    System.out.println("Exiting...");
                    break;

                default:
                    System.out.println("Invalid choice!");
            }
        } while (choice != 0);

        sc.close();
    }
}