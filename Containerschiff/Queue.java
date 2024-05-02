package Containerschiff;

public class Queue {
    private Container head;
    private Container tail;

    public Queue(Container head, Container tail) {
        this.head = head;
        this.tail = tail;
    }

    public Container getHead() {
        return this.head;
    }

    public Container getTail() {
        return this.tail;
    }

    public void enqueue(Container patient) {
        if (this.head == null) {
            this.head = patient;
            this.tail = patient;
        } else {
            if (this.tail != null) {
                this.tail.setNext(patient);
            }
            this.tail = patient;
        }
    }

    public Container dequeue() {
        if (this.head != null) {
            Container temp = this.head;
            this.head = head.getNext();
            return temp;
        } else {
            return null;
        }
    }

    public Boolean isEmpty() {
        if (this.head == null) {
            return true;
        } else {
            return false;
        }
    }

    public String toString() {
        String result = "Queue: \n";
        Container current = this.head;
        while (current != null) {
            result += current.toString();
            current = current.getNext();
        }
        result += "Queue Ende\n";
        return result;
    }
}
