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
//        int no = 1;
        while (current != null) {
            System.out.println("No. " + current.data.queueNumber + " | Name: " + current.data.name + " | Phone: " + current.data.phoneNumber);
            current = current.next;
//            no++;
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

    Buyer cancelQueue(int queueNumber) {
        if (head == null) {
            System.out.println("Queue is empty. No buyer to cancel.");
            return null;
        }

        Node current = head;
        while (current != null) {
            if (current.data.queueNumber == queueNumber) {
                Buyer canceled = current.data;

                if (current == head) {
                    head = current.next;
                    if (head != null) {
                        head.prev = null;
                    }
                } else if (current == tail) {
                    tail = current.prev;
                    if (tail != null) {
                        tail.next = null;
                    }
                } else {
                    current.prev.next = current.next;
                    current.next.prev = current.prev;
                }
                size--;
                System.out.println("Queue number " + queueNumber + " has been canceled.");
                return canceled;
            }
            current = current.next;
        }
        System.out.println("Queue number " + queueNumber + " not found.");
        return null;
    }
}
