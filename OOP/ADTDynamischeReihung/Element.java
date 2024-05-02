package OOP.ADTDynamischeReihung;

public class Element {
    private int value;

    public Element() {
        this.value = 0;
    }

    public Element(int value) {
        this.value = value;
    }

    public int getValue() {
        return this.value;
    }

    public void setValue(int value) {
        this.value = value;
    }
}
