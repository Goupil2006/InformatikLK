package OOP.Arztpraxis;

public class Patient {
    private String name;
    private String vorname;
    private String geburtsdatum;
    private String krankenkasse;
    private String versicherungsnummer;
    private Patient next;

    public Patient(String name, String vorname, String geburtsdatum, String krankenkasse, String versicherungsnummer) {
        this.name = name;
        this.vorname = vorname;
        this.geburtsdatum = geburtsdatum;
        this.krankenkasse = krankenkasse;
        this.versicherungsnummer = versicherungsnummer;
        next = null;
    }

    public String getName() {
        return name;
    }

    public String getVorname() {
        return vorname;
    }

    public String getGeburtsdatum() {
        return geburtsdatum;
    }

    public String getKrankenkasse() {
        return krankenkasse;
    }

    public String getVersicherungsnummer() {
        return versicherungsnummer;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setVorname(String vorname) {
        this.vorname = vorname;
    }

    public void setGeburtsdatum(String geburtsdatum) {
        this.geburtsdatum = geburtsdatum;
    }

    public void setKrankenkasse(String krankenkasse) {
        this.krankenkasse = krankenkasse;
    }

    public void setVersicherungsnummer(String versicherungsnummer) {
        this.versicherungsnummer = versicherungsnummer;
    }

    public String toString() {
        return "\nPatient: \n" +
                "Name: " + name + "\n" +
                "Vorname: " + vorname + "\n" +
                "Geburtsdatum: " + geburtsdatum + "\n" +
                "Krankenkasse: " + krankenkasse + "\n" +
                "Versicherungsnummer: " + versicherungsnummer + "\n" +
                "\n";
    }

    public void setNext(Patient next) {
        this.next = next;
    }

    public Patient getNext() {
        return this.next;
    }
}
