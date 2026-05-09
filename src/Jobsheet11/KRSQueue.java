package Jobsheet11;

public class KRSQueue {
    Student[] data;
    int front, rear, size, max;
    int approvedCount = 0;

    public KRSQueue(int max) {
        this.max = max;
        data = new Student[max];
        front = 0;
        rear = -1;
        size = 0;
    }

    boolean isEmpty() {
        return size == 0;
    }

    boolean isFull() {
        return size == max;
    }

    void clear() {
        front = 0;
        rear = -1;
        size = 0;
        approvedCount = 0;
        System.out.println("Queue cleared!");
    }

    void enqueue(Student s) {
        if (isFull()) {
            System.out.println("Queue is full!");
            return;
        }

        rear = (rear + 1) % max;
        data[rear] = s;
        size++;

        System.out.println(s.name + " added to queue");
    }

    Student dequeue() {
        if (isEmpty()) {
            System.out.println("Queue is empty!");
            return null;
        }

        Student s = data[front];
        front = (front + 1) % max;
        size--;
        approvedCount++;

        return s;
    }

    void dequeue2() {
        System.out.println("Processing 2 students...");

        for (int i = 1; i <= 2; i++) {
            Student s = dequeue();

            if (s != null) {
                s.print();
            }
        }
    }

    void printQueue() {
        if (isEmpty()) {
            System.out.println("Queue is empty!");
            return;
        }

        int i = front;

        while (i != rear) {
            data[i].print();
            i = (i + 1) % max;
        }

        data[i].print();
    }

    void peekFront2() {
        if (size >= 1) {
            System.out.println("First student:");
            data[front].print();
        }

        if (size >= 2) {
            System.out.println("Second student:");
            data[(front + 1) % max].print();
        }
    }

    void viewRear() {
        if (!isEmpty()) {
            System.out.println("Last student:");
            data[rear].print();
        }
    }

    void printInfo() {
        System.out.println("Students in queue: " + size);
        System.out.println("Students approved: " + approvedCount);
        System.out.println("Students not approved yet: " + (30 - approvedCount));
    }
}

