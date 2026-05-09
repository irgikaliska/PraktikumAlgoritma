package Week12.assignment;

public class StudentQueue {
    Node front, rear;
    int size;
    final int MAX = 5;

    public StudentQueue() {
        front = rear = null;
        size = 0;
    }

    boolean isEmpty() {
        return front == null;
    }

    boolean isFull() {
        return size == MAX;
    }

    void clear() {
        front = rear = null;
        size = 0;
        System.out.println("Queue cleared.");
    }

    void enqueue(Student std) {
        if (isFull()) {
            System.out.println("Queue is full!");
            return;
        }
        Node newNode = new Node(std, null);
        if (isEmpty()) {
            front = rear = newNode;
        } else {
            rear.next = newNode;
            rear = newNode;
        }
        size++;
        System.out.println(std.name + " joined the queue.");
    }

    void dequeue() {
        if (isEmpty()) {
            System.out.println("Queue is empty!");
            return;
        }
        System.out.print("Calling: ");
        front.data.print();
        front = front.next;
        if (front == null) rear = null;
        size--;
    }

    void peekFront() {
        if (isEmpty()) {
            System.out.println("Queue is empty!");
            return;
        }
        System.out.print("Front: ");
        front.data.print();
    }

    void peekRear() {
        if (isEmpty()) {
            System.out.println("Queue is empty!");
            return;
        }
        System.out.print("Rear: ");
        rear.data.print();
    }

    void totalInQueue() {
        System.out.println("Total students in queue: " + size);
    }

    void print() {
        if (isEmpty()) {
            System.out.println("Queue is empty!");
            return;
        }
        System.out.println("Current queue:");
        Node tmp = front;
        int i = 1;
        while (tmp != null) {
            System.out.print(i++ + ". ");
            tmp.data.print();
            tmp = tmp.next;
        }
    }
}