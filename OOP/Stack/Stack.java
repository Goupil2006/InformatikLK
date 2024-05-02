package OOP.Stack;

public class Stack {
    Element head = null;
    Element pointer = null;

    public Stack() {

    }

    public void push(Element element) {
        element.setNext(head);
        head = element;
        pointer = head;
    }

    public Element pop() {
        Element element = head;
        head = head.getNext();
        return element;
    }

    public Element top() {
        return head;
    }

    public boolean isEmpty() {
        return head == null;
    }

    public Element getPointer() {
        return pointer;
    }

    public Element pointertop() {
        pointer = head;
        return pointer;
    }

    public Element pointermovedown() {
        pointer = pointer.getNext();
        return pointer;
    }

    public void addAfterPointer(Element element) {
        Element temp = pointer.getNext();
        pointer.setNext(element);
        pointer.getNext().setNext(temp);
    }

    public Element deletePointerElement() {
        Element temp = pointer;
        Element foo = head;
        if (foo == pointer) {
            head = pointer.getNext();
            pointer = head;
            return temp;
        }
        while (foo.getNext() != pointer) {
            foo = foo.getNext();
        }
        foo.setNext(temp.getNext());
        pointer = temp.getNext();
        return temp;
    }
}
