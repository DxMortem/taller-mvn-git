package co.edu.escuelaing.arem.LinkedList;

public class Node {

    private int data;
    private Node next;

    public Node(int data) {
        next = null;
        this.data = data;
    }

    public int getData() {
        return data;
    }

    public Node getNext() {
        return next;
    }

    public void setData(int data) {
        this.data = data;
    }

    public void setNext(Node next) {
        this.next = next;
    }
}
