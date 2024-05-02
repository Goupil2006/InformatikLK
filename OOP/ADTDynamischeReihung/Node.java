package OOP.ADTDynamischeReihung;

public class Node {
    private int index;
    private Element element;
    private Node next;

    public Node(int index, Element element, Node next) {
        this.index = index;
        this.element = element;
        this.next = next;
    }

    public int getIndex() {
        return index;
    }

    public Element getElement() {
        return element;
    }

    public Node getNext() {
        return next;
    }

    public void setIndex(int index) {
        this.index = index;
    }

    public void setElement(Element element) {
        this.element = element;
    }

    public void setNext(Node next) {
        this.next = next;
    }
}
