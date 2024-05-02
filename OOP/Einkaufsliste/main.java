package OOP.Einkaufsliste;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        // scanner für Eingabe
        Scanner scanner = new Scanner(System.in);
        // Einkaufsliste erstellen
        DynArray Einkaufsliste = new DynArray();

        boolean running = true;
        // Aktionen auswählen
        while (running) {
            System.out.println("1. Einkaufsliste anzeigen");
            System.out.println("2. Artikel hinzufügen");
            System.out.println("3. Artikel entfernen");
            System.out.println("4. Programm beenden");
            int input = scanner.nextInt();
            scanner.nextLine();
            System.out.println("\n");
            switch (input) {
                case 1:
                    // Einkaufsliste auf vorhandenen Inhalt überprüffen(leer oder nicht)
                    if (Einkaufsliste.isEmpty()) {
                        System.out.println("Einkaufsliste ist leer.");
                        break;
                    }
                    // Einkaufsliste anzeigen
                    for (int i = 1; i <= Einkaufsliste.getLength(); i++) {
                        Element temp = Einkaufsliste.getItem(i);
                        System.out.println(i + ". " + temp.gibInhalt() + " " + temp.anzahl);
                    }
                    break;
                case 2:
                    // Artikel hinzufügen
                    System.out.println("Name des Artikels: ");
                    String artikel = scanner.nextLine();
                    System.out.println("Anzahl: ");
                    int anzahl = scanner.nextInt();
                    scanner.nextLine();
                    boolean found = false;
                    if (!Einkaufsliste.isEmpty()) { // leer?
                        for (int i = 1; i <= Einkaufsliste.getLength(); i++) { // liste überprüfen
                            if (Einkaufsliste.getItem(i).inhalt.equals(artikel)) {
                                Einkaufsliste.getItem(i).anzahl += anzahl;
                                found = true;
                                break;
                            }
                        }
                    }
                    if (found) { // damit element nicht doppelt hinzugefügt wird
                        break;
                    }
                    Einkaufsliste.append(artikel, anzahl);
                    break;
                case 3:
                    // Artikel entfernen
                    System.out.println("Name des zu löschenden Artikels: ");
                    String artikel2 = scanner.nextLine(); // Name?
                    for (int i = 1; i <= Einkaufsliste.getLength(); i++) { // suche nach Artikel
                        if (Einkaufsliste.getItem(i).inhalt.equals(artikel2)) {
                            Einkaufsliste.delete(i); // löschen
                            break;
                        }
                    }
                    break;
                default:
                    running = false;
                    break;
            }
        }

    }
}
