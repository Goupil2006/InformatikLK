package OOP.MunzMaster;

public class Coin {
    public Coin next;
    private int value;

    public Coin(int value) {
        this.value = value;
        next = null;
    }

    public int getValue() {
        return value;
    }

    public Coin getNext() {
        return next;
    }

    public void setNext(Coin next) {
        this.next = next;
    }
}
