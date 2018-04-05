package assignment1;

public class Node {

    private Student element;
    private Node next;

    public Node() {

    }

    public String toString() {
        return this.element.toString();
    }

    public Node(Student element, Node next) {

        this.element = element;
        this.next = next;
    }

    public void setElement(Student element) {
        this.element = element;
    }

    public void setNext(Node next) {
        this.next = next;
    }

    public Student getElement() {
        return element;
    }

    public Node getNext() {
        return next;
    }
}