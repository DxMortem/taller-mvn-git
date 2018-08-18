package co.edu.escuelaing.arem.LinkedList;

/*
* Class that will be used as a node of a SimpleLinkedList
* This node only accepts int numbers.
* @author Diego Borrero
* @version 1.0
* */
public class SimpleLinkedList {

    private Node head;
    private int size;

    /*
    *Constructor for SimpleLinkedList
    */
    public SimpleLinkedList() {
        head = null;
        size = 0;
    }
    /*add a number at the end of a LinkedList
    * @param number to add at the end of List
    */
    public void append(int data){
        if (head == null){
            head = new Node(data);
        }else{
            Node temp = head;
            while(temp.getNext() != null){
                temp = temp.getNext();
            }
            temp.setNext(new Node(data));
        }
        size++;
    }

    public int getSize() {
        return size;
    }

    /*Do a summatory of a LinkedList
    * @return integer with the summatory of the list
    */
    public int sum(){
        Node temp = head;

        int sum = temp.getData();
        while (temp.getNext() != null){
            temp = temp.getNext();
            sum += temp.getData();
        }
        return sum;
    }
    /*Return a value that is in a certain position
    *@return return the value of a given position
    */
    public int positionValue(int position){
        Node temp = head;
        while (position != 0){
            temp = temp.getNext();
            position--;
        }
        return temp.getData();

    }
}
