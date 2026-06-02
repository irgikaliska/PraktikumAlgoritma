package caseMethod2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        BuyerQueue queue = new BuyerQueue();
        OrderList orderList = new OrderList();

        queue.addQueue(new Buyer("Irgi", "081234567890"));
        queue.addQueue(new Buyer("Sebian", "081234567890"));
        queue.addQueue(new Buyer("Gesang", "081234567890"));
        queue.addQueue(new Buyer("Surya", "081234567890"));

        int choice;
        do {
            System.out.println("\n====== ROYAL DELISH QUEUE SYSTEM ======");
            System.out.println("1. Add Queue");
            System.out.println("2. Print Queue");
            System.out.println("3. Delete Queue (Serve Buyer)");
            System.out.println("4. Order Report");
            System.out.println("5. Exit");
            System.out.print("Choose menu: ");
            choice = Integer.parseInt(sc.nextLine());

            switch (choice) {
                case 1:
                    System.out.print("Enter buyer name: ");
                    String name = sc.nextLine();
                    System.out.print("Enter phone number: ");
                    String phone = sc.nextLine();
                    queue.addQueue(new Buyer(name, phone));
                    break;

                case 2:
                    queue.printQueue();
                    break;

                case 3:
                    Buyer served = queue.deleteQueue();
                    if (served != null) {
                        System.out.println("Now serving: " + served.name);
                        System.out.print("How many items ordered? ");
                        int itemCount = Integer.parseInt(sc.nextLine());
                        for (int i = 0; i < itemCount; i++) {
                            System.out.print("Order name: ");
                            String orderName = sc.nextLine();
                            System.out.print("Price: ");
                            int price = Integer.parseInt(sc.nextLine());
                            orderList.addOrder(orderName, price);
                        }
                        System.out.println("Buyer " + served.name + " has been served and removed from queue.");
                        queue.printQueue();
                    }
                    break;

                case 4:
                    orderList.printOrderReport();
                    break;

                case 5:
                    System.out.println("Exiting system...");
                    break;

                default:
                    System.out.println("Invalid choice. Try again.");
            }
        } while (choice != 5);

        sc.close();
    }
}