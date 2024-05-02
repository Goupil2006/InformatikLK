package OOP.ADTDynamischeReihung;

public class DynamischeReihung {
    private Node head;
    private Node tail;

    public DynamischeReihung() {
        this.head = null;
        this.tail = null;
    }

    public boolean isEmpty() {
        return this.head == null;
    }

    public int getLength() {
        if (isEmpty()) {
            return 0;
        }
        Node temp = this.tail;
        return temp.getIndex();
    }

    public void append(Element temp) {
        if (isEmpty()) {
            this.head = new Node(1, temp, null);
            this.tail = this.head;
        } else {
            Node newNode = new Node(this.tail.getIndex() + 1, temp, null);
            this.tail.setNext(newNode);
            this.tail = newNode;
        }
    }

    public Element getItem(int index) {
        Node temp = this.head;
        while (temp != null) {
            if (temp.getIndex() == index) {
                return temp.getElement();
            }
            temp = temp.getNext();
        }
        return null;
    }

    public void setItem(int index, Element temp) {
        Node tempNode = this.head;
        while (tempNode != null) {
            if (tempNode.getIndex() == index) {
                tempNode.setElement(temp);
                break;
            }
            tempNode = tempNode.getNext();
        }
    }

    public void delete(int index) {
        if (!isEmpty()) {
            Node temp = this.head;
            while (temp.getIndex() < index) {
                temp = temp.getNext();
            }
            while (temp.getIndex() < this.tail.getIndex() - 1) {
                temp.setElement(temp.getNext().getElement());
                temp = temp.getNext();
            }
            temp.setElement(this.tail.getElement());
            temp.setNext(null);
            this.tail = temp;
        }
    }

    public void insertAt(int index, Element element) {
        if (isEmpty()) {
            this.head = new Node(1, element, null);
            this.tail = this.head;
        } else if (index == 1) {
            Node newNode = new Node(1, element, this.head);
            this.head = newNode;
            newNode = newNode.getNext();
            while (newNode != null) {
                newNode.setIndex(newNode.getIndex() + 1);
                newNode = newNode.getNext();
            }
        } else {
            Node temp = this.head;
            while (temp.getIndex() < index) {
                if (temp.getNext() == null) {
                    break;
                }
                temp = temp.getNext();
            }
            Node newNode = new Node(index, element, temp.getNext());
            temp.setNext(newNode);
            temp = temp.getNext();
            while (temp != null) {
                temp.setIndex(temp.getIndex() + 1);
                temp = temp.getNext();
            }
        }
    }
}
