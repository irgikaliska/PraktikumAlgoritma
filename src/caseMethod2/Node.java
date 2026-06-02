package caseMethod2;

public class Node {
    Buyer data;
    Node next;
    Node prev;

    public Node(){

    }

    public Node(Buyer data){
        this.data = data;
        this.next = null;
        this.prev = null;
    }

    public Node(Buyer data, Node next, Node prev){
        this.data = data;
        this.next = next;
        this.prev = prev;
    }
}
