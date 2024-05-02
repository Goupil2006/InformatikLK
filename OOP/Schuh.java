package OOP;

public class Schuh {
    private int groesse;
    private String marke;
    private String farbe;
    private String material;
    private double preis;
    static private int zustand = 100;

    public Schuh(int groesse, String marke, String farbe, String material, double preis, String[] aussehen,
            int zustand) {
        this.groesse = groesse;
        this.marke = marke;
        this.farbe = farbe;
        this.material = material;
        this.preis = preis;
        this.zustand = zustand;
    }

    public Schuh(int groesse, String marke, String farbe, String material, double preis) {
        this.groesse = groesse;
        this.marke = marke;
        this.farbe = farbe;
        this.material = material;
        this.preis = preis;
    }

    public int getGroesse() {
        return groesse;
    }

    public String getMarke() {
        return marke;
    }

    public String getFarbe() {
        return farbe;
    }

    public String getMaterial() {
        return material;
    }

    public double getPreis() {
        return preis;
    }

    public void setPreis(double preis) {
        this.preis = preis;
    }

    public String getZustand() {
        if (zustand > 50) {
            return "Gut";
        } else if (zustand > 25) {
            return "Okay";
        } else {
            return "Schlecht";
        }
    }
}
