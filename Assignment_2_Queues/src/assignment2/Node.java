package assignment2;

public class Node {

    private Employee element;
    private Node next;

    public Node() {

    }

    public String toString() {
        return this.element.toString();
    }

    public Node(Employee element, Node next) {

        this.element = element;
        this.next = next;
    }

    public void setElement(Employee element) {
        this.element = element;
    }

    public void setNext(Node next) {
        this.next = next;
    }

    public Employee getElement() {
        return element;
    }

    public Node getNext() {
        return next;
    }
}