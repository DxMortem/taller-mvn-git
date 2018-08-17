package co.edu.escuelaing.arem.LinkedList;

public class SimpleLinkedList {

    private Node head;
    private int size;

    public SimpleLinkedList() {
        head = null;
        size = 0;
    }

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

    public int sum(){
        Node temp = head;

        int sum = temp.getData();
        while (temp.getNext() != null){
            temp = temp.getNext();
            sum += temp.getData();
        }
        return sum;
    }

    public int positionValue(int position){
        Node temp = head;
        while (position != 0){
            temp = temp.getNext();
            position--;
        }
        return temp.getData();

    }
}
