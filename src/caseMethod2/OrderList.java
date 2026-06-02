package caseMethod2;

public class OrderList {
    OrderNode head;
    OrderNode tail;
    int size, orderCounter, totalRevenue;

    OrderList(){

    }

    void addOrder(String orderName, int price) {
        orderCounter++;
        Order newOrder = new Order(orderCounter, orderName, price);

        OrderNode newNode = new OrderNode(newOrder);

        if (head == null) {
            head = newNode;
            tail = newNode;
        } else {
            newNode.prev = tail;
            tail.next = newNode;
            tail = newNode;
        }
        size++;
        totalRevenue += price;
        System.out.println("Order added: " + orderName + " | Rp" + price);
    }

    void sortByName() {
        if (head == null || head == tail){
            return;
        }

        boolean swapped;
        do {
            swapped = false;
            OrderNode current = head;
            while (current.next != null) {
                if (current.data.orderName.compareToIgnoreCase(current.next.data.orderName) > 0) {
                    Order temp = current.data;
                    current.data = current.next.data;
                    current.next.data = temp;
                    swapped = true;
                }
                current = current.next;
            }
        } while (swapped);
    }

    void printOrderReport() {
        if (head == null) {
            System.out.println("No orders yet.");
            return;
        }
        sortByName();
        System.out.println("========== ORDER REPORT ==========");
        System.out.printf("%-5s %-20s %s%n", "Code", "Order Name", "Price");
        System.out.println("----------------------------------");
        OrderNode current = head;
        while (current != null) {
            System.out.printf("%-5d %-20s Rp%d%n", current.data.orderCode, current.data.orderName, current.data.price);
            current = current.next;
        }
        System.out.println("==================================");
        System.out.println("TOTAL REVENUE: Rp" + totalRevenue);
        System.out.println("==================================");
    }
}

