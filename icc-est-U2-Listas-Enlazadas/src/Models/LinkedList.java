package Models;

public class LinkedList<T> {
    private Node<T> head;
    private int size;

    public void appendToTail(Node<T> newNode) {
        if (head == null) {
            head = newNode;
        } else {
            Node<T> current = head;
            while (current.getNext() != null) {
                current = current.getNext();
            }
            current.setNext(newNode);
        }
        size++;
    }
    public T findByValue(T value) {
        Node<T> current = head;
        while (current != null) {
            if (current.getValue().equals(value)) {
                return current.getValue();
            }
            current = current.getNext();
        }
        return null; 
    }   
    public T deleteByValue(T value) {
        if (head == null) {
            return null; 
        }
        if (head.getValue().equals(value)) {
            T deletedValue = head.getValue();
            head = head.getNext();
            size--;
            return deletedValue;
        }
        Node<T> current = head;
        while (current.getNext() != null) {
            if (current.getNext().getValue().equals(value)) {
                T deletedValue = current.getNext().getValue();
                current.setNext(current.getNext().getNext());
                size--;
                return deletedValue;
            }
            current = current.getNext();
        }
        return null; 
        
    }
    public void println() {
        Node<T> current = head;
        while (current != null) {
            System.out.print(current.getValue() + " ");
            current = current.getNext();
        }
        System.out.println();
    }
    public Node<T> getHead() {
        return head;
    }
    public void setHead(Node<T> head) {
        this.head = head;
    }
    public int getSize() {
        return size;
    }
    public void setSize(int size) {
        this.size = size;
    }
    


}
