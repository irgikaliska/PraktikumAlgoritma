package Week12;

public class SingleLinkedList {
    Node head;
    Node tail;

    boolean isEmpty(){
        return (head == null);
    }
    void print(){
        if(!isEmpty()){
            Node tmp = head;
            System.out.println("LinkedList Data:");
            while(tmp!=null){
                tmp.data.print();
                tmp = tmp.next;
            }
        }else{
            System.out.println("LinkedList is empty!!");
        }
    }
    void addFirst(Student std){
        Node newNode = new Node(std, null);
        if(isEmpty()){
            head = newNode;
            tail = newNode;
        }else{
            newNode.next = head;
            head = newNode;
        }
    }
    void addLast(Student std){
        Node newNode = new Node(std, null);
        if(isEmpty()){
            head = newNode;
            tail = newNode;
        }else{
            tail.next = newNode;
            tail = newNode;
        }
    }
    void insertAfter(Student std, String key){
        Node newNode = new Node(std, null);
        Node temp = head;
        do {
            if (temp.data.name.equalsIgnoreCase(key)) {
                newNode.next = temp.next;
                temp.next = newNode;
                if (newNode.next == null) {
                    tail = newNode;
                }
                break;
            }
            temp = temp.next;
        } while (temp != null);
    }
    public void insertAt(int index, Student std) {
        if (index < 0) {
            System.out.println("Wrong index!!");
        } else if (index == 0) {
            addFirst(std);
        } else {
            Node temp = head;
            for (int i = 0; i < index - 1; i++) {
                temp = temp.next;
            }
            temp.next = new Node(std, temp.next);
            if (temp.next.next == null) {
                tail = temp.next;
            }
        }
    }
}
