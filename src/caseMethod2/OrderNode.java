package caseMethod2;

public class OrderNode {
    Order data;
    OrderNode next;
    OrderNode prev;

    public OrderNode(){

    }

    public OrderNode(Order data){
        this.data = data;
        this.next = null;
        this.prev = null;
    }

    public OrderNode(Order data, OrderNode next, OrderNode prev){
        this.data = data;
        this.next = next;
        this.prev = prev;
    }
}

