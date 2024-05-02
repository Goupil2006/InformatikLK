package OOP.Fahrradwerkstatt;

public class Fahrrad {
    private int rahmengroesse;
    private String farbe;
    private String marke;
    private int gaenge;
    private boolean licht;
    private boolean klingel;
    private boolean schutzbleche;
    private boolean gepaecktraeger;
    private int preis;
    private int zustand = 100;
    private int geschwindigkeit = 0;
    private String besitzer;

    public Fahrrad(int rahmengroesse, String farbe, int gaenge, boolean licht, boolean klingel,
            boolean schutzbleche, boolean gepaecktraeger, int preis, String besitzer) {
        this.rahmengroesse = rahmengroesse;
        this.farbe = farbe;
        this.marke = "Rise";
        this.gaenge = gaenge;
        this.licht = licht;
        this.klingel = klingel;
        this.schutzbleche = schutzbleche;
        this.gepaecktraeger = gepaecktraeger;
        this.besitzer = besitzer;
    }

    public void setKlingel(String klingel) {
        if (klingel.equals("Ja")) {
            this.klingel = true;
        } else {
            this.klingel = false;
        }
    }

    public void setBesitzer(String besitzer) {
        this.besitzer = besitzer;
    }

    public int getRahmengroesse() {
        return rahmengroesse;
    }

    public String getFarbe() {
        return farbe;
    }

    public String getMarke() {
        return marke;
    }

    public int getGaenge() {
        return gaenge;
    }

    public boolean getLicht() {
        return licht;
    }

    public boolean getKlingel() {
        return klingel;
    }

    public boolean getSchutzbleche() {
        return schutzbleche;
    }

    public boolean getGepaecktraeger() {
        return gepaecktraeger;
    }

    public void setLicht(boolean value) {
        this.licht = value;
    }

    public void setSchutzbleche(boolean value) {
        this.schutzbleche = value;
    }

    public void setGepaecktraeger(boolean value) {
        this.gepaecktraeger = value;
    }

    public void setKlingel(boolean klingel) {
        this.klingel = klingel;
    }

    public void setRahmengroesse(int rahmengroesse) {
        this.rahmengroesse = rahmengroesse;
    }

    public void setFarbe(String farbe) {
        this.farbe = farbe;
    }

    public void setMarke(String marke) {
        this.marke = marke;
    }

    public void setGaenge(int gaenge) {
        this.gaenge = gaenge;
    }

    public void setPreis(int preis) {
        this.preis = preis;
    }

    public void setZustand(int zustand) {
        this.zustand = zustand;
    }

    public String getZustand() {
        if (this.zustand > 50) {
            return "Gut";
        } else if (this.zustand > 25) {
            return "Okay";
        } else {
            return "Schlecht";
        }
    }

    public int getGeschwindigkeit() {
        return geschwindigkeit;
    }

    public int Beschleunigen(int x) {
        if (geschwindigkeit + x > 25) {
            geschwindigkeit = 25;
        } else {
            geschwindigkeit += x;
        }
        return geschwindigkeit;
    }

    public int Bremsen(int x) {
        if (geschwindigkeit - x < 0) {
            geschwindigkeit = 0;
        } else {
            geschwindigkeit -= x;
        }
        return geschwindigkeit;
    }

    public String getBesitzer() {
        return besitzer;
    }

    public String getStatus() {
        return "\n1. Rahmengröße: " + rahmengroesse + "\n" +
                "2. Farbe: " + farbe + "\n" +
                "3. Marke: " + marke + "\n" +
                "4. Gänge: " + gaenge + "\n" +
                "5. Licht: " + licht + "\n" +
                "6. Klingel: " + klingel + "\n" +
                "7. Schutzbleche: " + schutzbleche + "\n" +
                "8. Gepäckträger: " + gepaecktraeger + "\n" +
                "9. Preis: " + preis + "\n" +
                "10. Zustand: " + zustand + "\n" +
                "11. Geschwindigkeit: " + geschwindigkeit + "\n" +
                "12. Besitzer: " + besitzer;
    }
}
