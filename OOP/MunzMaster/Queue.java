package OOP.MunzMaster;

public class Queue {
    private Coin head;
    private Coin tail;

    public Queue(Coin head, Coin tail) {
        this.head = head;
        this.tail = tail;
    }

    public Coin getHead() {
        return this.head;
    }

    public Coin getTail() {
        return this.tail;
    }

    public void enqueue(Coin coin) {
        if (this.head == null) {
            this.head = coin;
            this.tail = coin;
        } else {
            this.tail.setNext(coin);
            this.tail = coin;
        }
    }

    public Coin dequeue() {
        if (this.head != null) {
            Coin temp = this.head;
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
        Coin current = this.head;
        while (current != null) {
            result += current.toString();
            current = current.getNext();
        }
        result += "Queue Ende\n";
        return result;
    }
}
