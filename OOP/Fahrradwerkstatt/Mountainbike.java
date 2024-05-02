package OOP.Fahrradwerkstatt;

public class Mountainbike extends Fahrrad {
    private int federstärke;

    public Mountainbike(int rahmengroesse, String farbe, int gaenge, boolean licht, boolean klingel,
            boolean schutzbleche, boolean gepaecktraeger, int federstärke, int preis, String besitzer) {
        super(rahmengroesse, farbe, gaenge, licht, klingel, schutzbleche, gepaecktraeger, preis, besitzer);
        this.federstärke = federstärke;
    }

    public int getFederstärke() {
        return federstärke;
    }

    public void setFederstärke(int federstärke) {
        this.federstärke = federstärke;
    }
}
