package OOP.Einkaufsliste;

public class Element {

  public String inhalt;
  public int anzahl;
  private int index;
  private Element next;

  // Konstruktor, legt Element mit Inhalt und Index an und legt Verweis zu
  // naechstem Element fest
  public Element(String s, int i, Element n, int anzahl) {
    inhalt = s;
    index = i;
    next = n;
    this.anzahl = anzahl;
  }

  // Gibt inhalt zurück
  public String gibInhalt() {
    return inhalt;
  }

  // setzt Namen
  public void setInhalt(String s) {
    inhalt = s;
  }

  // gibt Index
  public int gibIndex() {
    return index;
  }

  // setzt index
  public void setIndex(int i) {
    index = i;
  }

  // Gibt Verweis zum nächsten Element zurück
  public Element gibNaechstes() {
    return next;
  }

  // Setzt Verweis zu nächsten Element
  public void setzeNaechstes(Element n) {
    next = n;
  }

}
