package Containerschiff;

public class Stack {
    Container head = null;
    Container pointer = null;

    public Stack() {

    }

    public void push(Container element) {
        element.setNext(head);
        head = element;
        pointer = head;
    }

    public Container pop() {
        Container element = head;
        if (head == null) {
            return null;
        }
        head = head.getNext();
        return element;
    }

    public Container top() {
        return head;
    }

    public boolean isEmpty() {
        return head == null;
    }

    public Container getPointer() {
        return pointer;
    }

    public Container pointertop() {
        pointer = head;
        return pointer;
    }

    public Container pointermovedown() {
        pointer = pointer.getNext();
        return pointer;
    }

    public void addAfterPointer(Container element) {
        Container temp = pointer.getNext();
        pointer.setNext(element);
        pointer.getNext().setNext(temp);
    }

    public Container deletePointerElement() {
        Container temp = pointer;
        Container foo = head;
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
