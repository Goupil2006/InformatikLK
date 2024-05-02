package OOP.Fahrradwerkstatt;

import java.util.Scanner;
import java.util.ArrayList;

public class main {
    public static void main(String[] args) {
        ArrayList<Fahrrad> fahrradListe = new ArrayList<>();

        ArrayList<Fahrrad> verkaufsliste = new ArrayList<>();

        verkaufsliste.add(new Fahrrad(26, "rot", 6, true, true, true, false, 300, "Anna"));
        verkaufsliste
                .add(new EFahrrad(28, "blau", 7, true, true, true, true, 500, 100, false, true, true, 1000, "John"));

        fahrradListe
                .add(new EFahrrad(28, "schwarz", 7, true, true, true, true, 500, 100, false, true, true, 1000, "Marc"));
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < 100; i++) {

            System.out.println("\n \nWas willst du tun?");
            System.out.println("1: Fahrrad erstellen");
            System.out.println("2: Fahrrad in die Werkstatt bringen");
            System.out.println("3: Fahrrad Kaufen");
            System.out.println("4: Fahrrad Verkaufen");
            System.out.println("5: Fahrräder anzeigen");

            String antwort = scanner.nextLine();
            if (antwort.toLowerCase().startsWith("1")) {
                fahrradListe.add(createFahrrad());
            } else if (antwort.toLowerCase().startsWith("2")) {
                System.out.println("Wie Heißt du?");
                String name = scanner.nextLine();
                Fahrrad tempFahrrad = null;
                for (int j = 0; j < fahrradListe.size(); j++) {
                    if (fahrradListe.get(j).getBesitzer().equals(name)) {
                        System.out.println("Das ist dein Fahrrad" + fahrradListe.get(j).getStatus());
                        tempFahrrad = fahrradListe.get(j);
                        fahrradListe.remove(j);
                        Fahrrad foo = fahrradVerändern(tempFahrrad);
                        if (foo != null) {
                            fahrradListe.add(foo);
                        }
                    }
                }

            } else if (antwort.toLowerCase().startsWith("3")) {
                System.out.println("Wie heißt du?");
                String name = scanner.nextLine();
                for (int j = 0; j < verkaufsliste.size(); j++) {
                    System.out.println(j + ": " + verkaufsliste.get(j).getStatus() + "\n \n");
                }
                System.out.println("Welches Fahrrad willst du kaufen?");
                int index = scanner.nextInt();
                fahrradListe.add(verkaufsliste.get(index));
                verkaufsliste.remove(index);
                fahrradListe.get(fahrradListe.size() - 1).setBesitzer(name);
                System.out.println(
                        "Du hast das Fahrrad gekauft:" + fahrradListe.get(fahrradListe.size() - 1).getStatus());

            } else if (antwort.toLowerCase().startsWith("4")) {
                System.out.println("Wie heißt du?");
                String name = scanner.nextLine();
                for (int j = 0; j < fahrradListe.size(); j++) {
                    if (fahrradListe.get(j).getBesitzer().equals(name)) {
                        verkaufsliste.add(fahrradListe.get(j));
                        fahrradListe.remove(j);
                    }
                }
            } else if (antwort.toLowerCase().startsWith("5")) {
                System.out.println("Fahrradliste:");
                for (Fahrrad fahrrad : fahrradListe) {
                    System.out.println(fahrrad.getStatus());
                }
            }

            System.out.println("Fertig!!! ");

        }

        // System.out.println("Fahrradliste:");
        // for (Fahrrad fahrrad : fahrradListe) {
        // System.out.println(fahrrad.getStatus());
        // }
        scanner.close();
    }

    public static Fahrrad createFahrrad() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Willst du ein Fahrrad oder ein E-Bike erstellen?");
        String fahrradTyp = scanner.nextLine();

        System.out.println("Gib die Rahmengröße ein:");
        int rahmengroesse = scanner.nextInt();
        scanner.nextLine();

        System.out.println("Gib die Farbe ein:");
        String farbe = scanner.nextLine();

        System.out.println("Gib die Anzahl der Gänge ein:");
        int gaenge = scanner.nextInt();
        scanner.nextLine();

        System.out.println("Hat das Fahrrad Licht? (true/false)");
        boolean licht = scanner.nextBoolean();
        scanner.nextLine();

        System.out.println("Hat das Fahrrad eine Klingel? (true/false)");
        boolean klingel = scanner.nextBoolean();
        scanner.nextLine();

        System.out.println("Hat das Fahrrad Schutzbleche? (true/false)");
        boolean schutzbleche = scanner.nextBoolean();
        scanner.nextLine();

        System.out.println("Hat das Fahrrad einen Gepäckträger? (true/false)");
        boolean gepaecktraeger = scanner.nextBoolean();
        scanner.nextLine();

        System.out.println("Gib den Preis ein:");
        int preis = scanner.nextInt();
        scanner.nextLine();

        System.out.println("Gib den Besitzer ein:");
        String besitzer = scanner.nextLine();

        if (fahrradTyp.equalsIgnoreCase("fahrrad")) {
            return new Fahrrad(rahmengroesse, farbe, gaenge, licht, klingel, schutzbleche, gepaecktraeger, preis,
                    besitzer);
        } else if (fahrradTyp.equalsIgnoreCase("e-bike")) {
            System.out.println("Gib die Akkukapazität ein:");
            int akkukapazitaet = scanner.nextInt();
            scanner.nextLine();

            System.out.println("Gib die Reichweite ein:");
            int reichweite = scanner.nextInt();
            scanner.nextLine();

            System.out.println("Hat das E-Bike einen Akku? (true/false)");
            boolean akku = scanner.nextBoolean();
            scanner.nextLine();

            System.out.println("Hat das E-Bike einen Motor? (true/false)");
            boolean motor = scanner.nextBoolean();
            scanner.nextLine();

            System.out.println("Hat das E-Bike ein Display? (true/false)");
            boolean display = scanner.nextBoolean();
            scanner.nextLine();

            System.out.println("Fahrrad wurde erstellt.");

            return new EFahrrad(rahmengroesse, farbe, gaenge, licht, klingel, schutzbleche, gepaecktraeger,
                    akkukapazitaet, reichweite, motor, akku, display, preis, besitzer);

        } else {
            System.out.println("Ungültiger Fahrradtyp.");
            return null;
        }
    }

    public static Fahrrad fahrradVerändern(Fahrrad temp) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(" \n \nWas willst du tun?");
        if (temp instanceof EFahrrad) {
            System.out.println("1: Lich ändern");
            System.out.println("2: Klingel ändern");
            System.out.println("3: Schutzbleche ändern");
            System.out.println("4: Gepäckträger ändern");
            System.out.println("5: Akkukapazität ändern");
            System.out.println("6: Reichweite ändern");
            System.out.println("7: Motor ändern");
            System.out.println("8: Akku ändern");
            System.out.println("9: Display ändern");
            System.out.println("10: Preis ändern");
            System.out.println("11: Besitzer ändern");
            System.out.println("12: Farbe ändern");
            System.out.println("13: Gänge ändern");
            System.out.println("14: Rahmengröße ändern");
            System.out.println("15: Zustand ändern");
            System.out.println("16: Fahrrad löschen");

            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    temp.setLicht(!temp.getLicht());
                    break;
                case 2:
                    temp.setKlingel(!temp.getKlingel());
                    break;
                case 3:
                    temp.setSchutzbleche(!temp.getSchutzbleche());
                    break;
                case 4:
                    temp.setGepaecktraeger(!temp.getGepaecktraeger());
                    break;
                case 5:
                    System.out.println("Gib die neue Akkukapazität ein:");
                    int akkukapazitaet = scanner.nextInt();
                    scanner.nextLine();
                    ((EFahrrad) temp).setAkkukapazitaet(akkukapazitaet);
                    break;
                case 6:
                    System.out.println("Gib die neue Reichweite ein:");
                    int reichweite = scanner.nextInt();
                    scanner.nextLine();
                    ((EFahrrad) temp).setReichweite(reichweite);
                    break;
                case 7:
                    ((EFahrrad) temp).setMotor(!((EFahrrad) temp).getMotor());
                    break;
                case 8:
                    ((EFahrrad) temp).setAkku(!((EFahrrad) temp).getAkku());
                    break;
                case 9:
                    ((EFahrrad) temp).setDisplay(!((EFahrrad) temp).getDisplay());
                    break;
                case 10:
                    System.out.println("Gib den neuen Preis ein:");
                    int preis = scanner.nextInt();
                    scanner.nextLine();
                    temp.setPreis(preis);
                    break;
                case 11:
                    System.out.println("Gib den neuen Besitzer ein:");
                    String besitzer = scanner.nextLine();
                    temp.setBesitzer(besitzer);
                    break;
                case 12:
                    System.out.println("Gib die neue Farbe ein:");
                    String farbe = scanner.nextLine();
                    temp.setFarbe(farbe);
                    break;
                case 13:
                    System.out.println("Gib die neue Anzahl der Gänge ein:");
                    int gaenge = scanner.nextInt();
                    scanner.nextLine();
                    temp.setGaenge(gaenge);
                    break;
                case 14:
                    System.out.println("Gib die neue Rahmengröße ein:");
                    int rahmengroesse = scanner.nextInt();
                    temp.setRahmengroesse(rahmengroesse);
                    break;
                case 15:
                    System.out.println("Gib den neuen Zustand ein:");
                    int zustand = scanner.nextInt();
                    scanner.nextLine();
                    temp.setZustand(zustand);
                    break;
                case 16:
                    return null;
                default:
                    System.out.println("Ungültige Eingabe");
            }
        } else {
            System.out.println("1: Lich ändern");
            System.out.println("2: Klingel ändern");
            System.out.println("3: Schutzbleche ändern");
            System.out.println("4: Gepäckträger ändern");
            System.out.println("5: Preis ändern");
            System.out.println("6: Besitzer ändern");
            System.out.println("7: Farbe ändern");
            System.out.println("8: Gänge ändern");
            System.out.println("9: Rahmengröße ändern");
            System.out.println("10: Zustand ändern");
            System.out.println("11: Fahrrad löschen");

            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    temp.setLicht(!temp.getLicht());
                    break;
                case 2:
                    temp.setKlingel(!temp.getKlingel());
                    break;
                case 3:
                    temp.setSchutzbleche(!temp.getSchutzbleche());
                    break;
                case 4:
                    temp.setGepaecktraeger(!temp.getGepaecktraeger());
                    break;
                case 5:
                    System.out.println("Gib den neuen Preis ein:");
                    int preis = scanner.nextInt();
                    scanner.nextLine();
                    temp.setPreis(preis);
                    break;
                case 6:
                    System.out.println("Gib den neuen Besitzer ein:");
                    String besitzer = scanner.nextLine();
                    temp.setBesitzer(besitzer);
                    break;
                case 7:
                    System.out.println("Gib die neue Farbe ein:");
                    String farbe = scanner.nextLine();
                    temp.setFarbe(farbe);
                    break;
                case 8:
                    System.out.println("Gib die neue Anzahl der Gänge ein:");
                    int gaenge = scanner.nextInt();
                    scanner.nextLine();
                    temp.setGaenge(gaenge);
                    break;
                case 9:
                    System.out.println("Gib die neue Rahmengröße ein:");
                    int rahmengroesse = scanner.nextInt();
                    scanner.nextLine();
                    temp.setRahmengroesse(rahmengroesse);
                    break;
                case 10:
                    System.out.println("Gib den neuen Zustand ein:");
                    int zustand = scanner.nextInt();
                    scanner.nextLine();
                    temp.setZustand(zustand);
                    break;
                case 11:
                    return null;
                default:
                    System.out.println("Ungültige Eingabe");
            }
        }
        return temp;
    }
}
