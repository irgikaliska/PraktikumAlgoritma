package Week8;

import java.util.Scanner;

public class studentDemo {
    public static void main(String[] args) {
        studentAssignmentStack14 stack = new studentAssignmentStack14(5);
        Scanner sc = new Scanner(System.in);
        int choice;

        do {
            System.out.println("\nMenu:");
            System.out.println("1. Submit Assignment");
            System.out.println("2. Grade Assignment");
            System.out.println("3. View Top Assignment");
            System.out.println("4. View All Assignments");
            System.out.print("Choose a menu: ");
            choice = Integer.parseInt(sc.nextLine());

            switch (choice) {
                case 1:
                    System.out.print("Name: ");
                    String name = sc.nextLine();
                    System.out.print("NIM: ");
                    String nim = sc.nextLine();
                    System.out.print("Class Name: ");
                    String className = sc.nextLine();
                    Student14 std = new Student14(nim, name, className);
                    stack.push(std);
                    System.out.println(name + "'s assignment has been successfully submitted!!");
                    break;

                case 2:
                    Student14 graded = stack.pop();
                    if (graded != null) {
                        System.out.println("Grading assignment from " + graded.name);
                        System.out.print("Input grade (0-100): ");
                        int grade = sc.nextInt();
                        graded.grading(grade);
                        System.out.printf("Assignment grade of %s is %d%n", graded.name, grade);
                        String binary = stack.convertToBinary(grade);
                        System.out.printf("Assignment grade in binary is %s\n", binary);
                    }
                    break;

                case 3:
                    Student14 top = stack.peek();
                    if (top != null) {
                        System.out.println("The last assignment comes from " + top.name);
                    }
                    break;

                case 4:
                    System.out.println("Assignment list:");
                    System.out.println("NIM\tName\tClass Name");
                    stack.print();
                    break;

                default:
                    System.out.println("Invalid choice!");
            }
        } while (choice != 0);

        sc.close();
    }
}
