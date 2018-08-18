package co.edu.escuelaing.arem.LinkedList;

/*
* Class that will be used as a node of a SimpleLinkedList
* This node only accepts integer numbers.
* @author Diego Borrero
* @version 1.0
* */
public class Node {

    private int data;
    private Node next;

    /*
    *Constructor for Node that only accepts integers
    */
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

    public void setNext(Node next) {
        this.next = next;
    }
}
