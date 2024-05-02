package OOP.Einkaufsliste;

public class DynArray {

  // Referenzen auf die Enden
  private Element vorne;
  private Element hinten;

  // Konstruktor
  public DynArray() {
    vorne = null;
    hinten = null;
  }

  // Pruefen, ob die Reihung leer ist
  public boolean isEmpty() {
    if ((vorne == null) && (hinten == null)) {
      return true;
    } else {
      return false;
    }
  }

  // Länge vom Array zurueckgeben
  public int getLength() {
    return hinten.gibIndex();
  }

  // Neues Element hinten an die Reihung anhaengen
  public void append(String s, int anzahl) {
    if (isEmpty()) {
      Element temp = new Element(s, 1, null, anzahl);
      vorne = temp;
      hinten = temp;
    } else {
      Element temp = new Element(s, hinten.gibIndex() + 1, null, anzahl);
      hinten.setzeNaechstes(temp);
      hinten = temp;
    }
  }

  // Inhalt an der Stelle i lesen und zurueckgeben
  public Element getItem(int i) {
    if (isEmpty()) {
      return null;
    } else {
      if (i <= hinten.gibIndex()) {
        // prueft ob index i im dynarray existiert
        Element temp = vorne;
        while ((temp.gibIndex() < i)) {
          temp = temp.gibNaechstes();
        }
        return temp;
      } else {
        return null;
      }
    }
  }

  // Inhalt an der Stelle i ueberschreiben
  public void setItem(int i, String s) {
    if (isEmpty()) {
      // tue nichts
    } else {
      if (i <= hinten.gibIndex()) {
        // Kommentar ergaenzen
        Element temp = vorne;
        while ((temp.gibIndex() < i)) {
          temp = temp.gibNaechstes();
        }
        temp.setInhalt(s);
      }
    }
  }

  // Element an der Stelle i loeschen
  public void delete(int i) {
    if (isEmpty()) {
      // tue nichts
    } else {
      // Kommentar ergaenzen
      if (getLength() == 1) {
        vorne = null;
        hinten = null;
      }
      // Kommentar ergaenzen
      else if (i == hinten.gibIndex()) {
        Element temp = vorne;
        // Kommentar ergaenzen
        while (temp.gibIndex() < hinten.gibIndex() - 1) {
          temp = temp.gibNaechstes();
        }
        temp.setzeNaechstes(null);
        hinten = temp;
      }
      // Kommentar ergaenzen
      else if (i < hinten.gibIndex()) {
        Element temp = vorne;
        // Kommentar ergaenzen
        while ((temp.gibIndex() < i)) {
          temp = temp.gibNaechstes();
        }
        // Kommentar ergaenzen
        while ((temp.gibIndex() < hinten.gibIndex() - 1)) {
          temp.setInhalt(temp.gibNaechstes().gibInhalt());
          temp = temp.gibNaechstes();
        }
        // Kommentar ergaenzen
        temp.setInhalt(hinten.gibInhalt());
        temp.setzeNaechstes(null);
        hinten = temp;
      }
    }
  }

  // Element an der Stelle i einfuegen, das alte Element an der Stelle i und alles
  // weitere nach rechts schieben
  public void insertAt(int i, String s, int anzahl) {
    if ((i < 1) || (i > getLength() + 1)) {
      // tue nichts
    }
    // prueft ob i reinpasst
    else if (isEmpty() || (i == getLength() + 1)) {
      append(s, anzahl);
    }
    // append methode benutzen, wenn es hinten angehängt werden kann oder wenn leer
    else if ((i >= 1) && (i <= getLength())) {
      if (i == 1) {
        Element neu = new Element(s, 1, vorne, anzahl);
        Element temp = vorne;
        int k = 1;
        // neues head setzen, wenn an erster Stelle
        while (temp.gibIndex() < getLength()) {
          temp.setIndex(k + 1);
          k++;
          temp = temp.gibNaechstes();
        }
        hinten.setIndex(k + 1);
        vorne = neu;
      }
      // Indezes aller anderen Element um eins erhöhen
      else {
        Element temp = vorne;
        while (temp.gibIndex() < i - 1) {
          temp = temp.gibNaechstes();
        }
        Element neu = new Element(s, i, temp.gibNaechstes(), anzahl);
        temp.setzeNaechstes(neu);
        int k = 1;
        while (temp.gibIndex() < getLength()) {
          temp.setIndex(k + 1);
          k++;
          temp = temp.gibNaechstes();
        }
        hinten.setIndex(k + 1);
      }
    }
  }
}
