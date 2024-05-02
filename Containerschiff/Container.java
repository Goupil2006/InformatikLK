package Containerschiff;

public class Container {
    public int gewicht;
    public String zielort;
    public Container next = null;

    public Container(int gewicht, String zielort) {
        this.gewicht = gewicht;
        this.zielort = zielort;
    }

    public boolean isZielort(String ziel) {
        return this.zielort == ziel;
    }

    public Container getNext() {
        return this.next;
    }

    public void setNext(Container next) {
        this.next = next;
    }
}
