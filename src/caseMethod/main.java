package caseMethod;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        Student[] students = new Student[3];

        students[0] = new Student("22001", "Abdul", "Informatics Engineering");
        students[1] = new Student("22002", "Bestari", "Informatics Engineering");
        students[2] = new Student("22003", "Gandi", "Business Information System");

        Book[] books = new Book[4];

        books[0] = new Book("B001", "Algorithm", 2020);
        books[1] = new Book("B002", "Database", 2019);
        books[2] = new Book("B003", "Programming", 2021);
        books[3] = new Book("B004", "Physics", 2024);

        Loan[] loans = {
                new Loan(students[0], books[0], 7),
                new Loan(students[1], books[1], 3),
                new Loan(students[2], books[2], 10),
                new Loan(students[2], books[3], 6),
                new Loan(students[0], books[1], 4)
        };

        for (Loan l : loans) {
            l.calculateFine();
        }

        int choice;
        do {
            System.out.println("\n=== MENU ===");
            System.out.println("1. Show Students");
            System.out.println("2. Show Books");
            System.out.println("3. Show Loans");
            System.out.println("4. Sort by Highest Fine");
            System.out.println("5. Search by Student ID");
            System.out.println("0. Exit");
            System.out.print("Choose: ");
            choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {
                case 1:
                    System.out.println("\n--- Students ---");
                    for (Student s : students) {
                        s.showStudent();
                    }
                    break;

                case 2:
                    System.out.println("\n--- Books ---");
                    for (Book b : books) {
                        b.showBook();
                    }
                    break;

                case 3:
                    System.out.println("\n--- Loans ---");
                    for (Loan l : loans) {
                        l.showLoan();
                    }
                    break;

                case 4:
                    sortByHighestFine(loans);
                    System.out.println("\n--- Sorted Loans ---");
                    for (Loan l : loans) {
                        l.showLoan();
                    }
                    break;

                case 5:
                    System.out.print("Enter Student ID: ");
                    String id = sc.nextLine();
                    searchById(loans, id);
                    break;

                case 0:
                    System.out.println("Exit program...");
                    break;

                default:
                    System.out.println("Invalid choice!");
            }
        } while (choice != 0);

        sc.close();
    }
    public static void sortByHighestFine(Loan[] loans){
        for (int i = 1; i < loans.length; i++) {
            Loan temp = loans[i];
            int j = i - 1;

            while (j >= 0 && loans[j].fine < temp.fine) {
                loans[j + 1] = loans[j];
                j--;
            }
            loans[j + 1] = temp;
        }
    }
    public static void searchById(Loan[] loans, String searchId) {
        boolean found = false;

        for (Loan l : loans) {
            if (l.std.id.equals(searchId)) {
                l.showLoan();
                found = true;
            }
        }

        if (!found) {
            System.out.println("Data not found!");
        }
    }
}
