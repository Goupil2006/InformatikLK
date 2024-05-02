package OOP.Arztpraxis;

public class Queue {
    private Patient head;
    private Patient tail;

    public Queue(Patient head, Patient tail) {
        this.head = head;
        this.tail = tail;
    }

    public Patient getHead() {
        return this.head;
    }

    public Patient getTail() {
        return this.tail;
    }

    public void enqueue(Patient patient) {
        if (this.head == null) {
            this.head = patient;
            this.tail = patient;
        } else {
            this.tail.setNext(patient);
            this.tail = patient;
        }
    }

    public Patient dequeue() {
        if (this.head != null) {
            Patient temp = this.head;
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
        Patient current = this.head;
        while (current != null) {
            result += current.toString();
            current = current.getNext();
        }
        result += "Queue Ende\n";
        return result;
    }
}
