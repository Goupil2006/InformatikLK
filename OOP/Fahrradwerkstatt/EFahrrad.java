package OOP.Fahrradwerkstatt;

public class EFahrrad extends Fahrrad {
    private int akkukapazitaet;
    private int reichweite;
    private int akkustand = 100;
    private boolean motor;
    private boolean akku;
    private boolean display;

    public EFahrrad(int rahmengroesse, String farbe, int gaenge, boolean licht, boolean klingel,
            boolean schutzbleche, boolean gepaecktraeger, int akkukapazitaet, int reichweite, boolean motor,
            boolean akku, boolean display, int preis, String besitzer) {
        super(rahmengroesse, farbe, gaenge, licht, klingel, schutzbleche, gepaecktraeger, preis, besitzer);
        this.akkukapazitaet = akkukapazitaet;
        this.reichweite = reichweite;
        this.motor = motor;
        this.akku = akku;
        this.display = display;
    }

    public void setAkkukapazitaet(int akkukapazitaet) {
        this.akkukapazitaet = akkukapazitaet;
    }

    public void setReichweite(int reichweite) {
        this.reichweite = reichweite;
    }

    public void setAkkustand(int akkustand) {
        this.akkustand = akkustand;
    }

    public void setMotor(boolean motor) {
        this.motor = motor;
    }

    public void setAkku(boolean akku) {
        this.akku = akku;
    }

    public void setDisplay(boolean display) {
        this.display = display;
    }

    public int getAkkukapazitaet() {
        return akkukapazitaet;
    }

    public int getReichweite() {
        return reichweite;
    }

    public int getVerbleibendeReichweite() {
        return reichweite * (akkustand / 100);
    }

    public int getAkkustand() {
        return akkustand;
    }

    public boolean getMotor() {
        return motor;
    }

    public boolean getAkku() {
        return akku;
    }

    public boolean getDisplay() {
        return display;
    }

    public void charge(float x) {
        if (akkustand + x > 100) {
            akkustand = 100;
        } else {
            akkustand += x;
        }
    }

    public void drive(int x) {
        if (akkustand - x < 0) {
            akkustand = 0;
        } else {
            akkustand -= x;
        }
    }

    public String getStatus() {
        return super.getStatus() + "\n13. Akkustand: " + akkustand + "% \n" +
                "14. Reichweite: " + getVerbleibendeReichweite() + "km";
    }
}
