package OOP;

public class Schlitschuh extends Schuh {
    private int kufengroesse;

    public Schlitschuh(int groesse, String marke, String farbe, String material, double preis, int kufengroesse) {
        super(groesse, marke, farbe, material, preis);
        this.kufengroesse = kufengroesse;
    }

    public int getKufengroesse() {
        return kufengroesse;
    }
}