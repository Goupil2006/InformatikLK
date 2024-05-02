package Containerschiff;

public class Schiff {
    public Stack[] stapelreihe;
    public int[] stapelgewichte;

    public Schiff(int anzahl) {
        this.stapelreihe = new Stack[anzahl];
        this.stapelgewichte = new int[anzahl];
        for (int i = 0; i < anzahl; i++) {
            this.stapelreihe[i] = new Stack();
        }
    }

    // Aufgabe b (Struktogramm aber effizienter)
    public void berechneStapelgewichte() {
        for (int i = 0; i < this.stapelreihe.length; i++) {
            Container current = this.stapelreihe[i].top();
            while (current != null) {
                this.stapelgewichte[i] += current.gewicht;
                current = current.getNext();
            }
        }
    }

    public boolean stapelgewichtePruefen() {
        int lowest = 0;
        int highest = 0;
        for (int i = 0; i < this.stapelgewichte.length; i++) {
            if (this.stapelgewichte[i] < lowest) {
                lowest = this.stapelgewichte[i];
            }
            if (this.stapelgewichte[i] > highest) {
                highest = this.stapelgewichte[i];
            }
        }
        return highest - lowest <= 15;
    }

    // Aufgabe c
    public void containerVerteilen(Queue s) {
        while (!s.isEmpty()) {
            Container current = s.dequeue();
            int lowest = 0;
            for (int i = 0; i < this.stapelgewichte.length; i++) {
                if (this.stapelgewichte[i] < this.stapelgewichte[lowest]) {
                    lowest = i;
                }
            }
            this.stapelreihe[lowest].push(current);
            this.stapelgewichte[lowest] += current.gewicht;
        }
    }
}
