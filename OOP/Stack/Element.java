package OOP.Stack;

public class Element {
    String value;
    Element next = null;

    public Element(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }

    public Element getNext() {
        return next;
    }

    public void setNext(Element next) {
        this.next = next;
    }
}
