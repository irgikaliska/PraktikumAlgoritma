package caseMethod2;

public class BuyerQueue {
    Node head;
    Node tail;
    int size, queueCounter;

    BuyerQueue() {

    }

    void addQueue(Buyer buyer) {
        queueCounter++;

        Node newNode = new Node(buyer);

        if (head == null) {
            head = newNode;
            tail = newNode;
        } else {
            newNode.prev = tail;
            tail.next = newNode;
            tail = newNode;
        }
        size++;
        System.out.println("Queue added! Queue number: " + queueCounter + " | Name: " + buyer.name);
    }

    void printQueue() {
        if (head == null) {
            System.out.println("Queue is empty.");
            return;
        }
        System.out.println("===== CURRENT QUEUE =====");
        Node current = head;
        int no = 1;
        while (current != null) {
            System.out.println("No. " + no + " | Name: " + current.data.name + " | Phone: " + current.data.phoneNumber);
            current = current.next;
            no++;
        }
        System.out.println("Total in queue: " + size);
        System.out.println("=========================");
    }

    Buyer deleteQueue() {
        if (head == null) {
            System.out.println("Queue is empty. No buyer to serve.");
            return null;
        }

        Buyer served = head.data;

        if (head == tail) {
            head = null;
            tail = null;
        } else {
            head = head.next;
            head.prev = null;
        }
        size--;
        return served;
    }

    boolean isEmpty() {
        return head == null;
    }
}
