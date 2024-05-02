package Containerschiff;

public class Gefahrgutcontainer extends Container {
    public int Gefahrgutklasse;

    public Gefahrgutcontainer(int gewicht, String zielort, int Gefahrgutklasse) {
        super(gewicht, zielort);
        this.Gefahrgutklasse = Gefahrgutklasse;
    }

    public int getGefahrgutklasse() {
        return this.Gefahrgutklasse;
    }
}
