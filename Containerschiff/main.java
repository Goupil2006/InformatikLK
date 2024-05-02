package Containerschiff;

public class main {
    public static void main(String[] args) {

        Stack land = new Stack();
        Schiff schiff = new Schiff(4);

        land.push(new Container(10, "Hamburg"));
        land.push(new Container(20, "Hamburg"));
        land.push(new Container(30, "Hamburg"));
        land.push(new Container(40, "Hamburg"));
        land.push(new Container(50, "Hamburg"));
        land.push(new Container(60, "Los Angeles"));
        land.push(new Container(70, "Los Angeles"));
        land.push(new Container(80, "Los Angeles"));
        land.push(new Container(90, "Los Angeles"));
        land.push(new Container(100, "Los Angeles"));

        Queue s = verladenVorbereiten(land, "Los Angeles");

        schiff.containerVerteilen(s);

        Queue s2 = verladenVorbereiten(land, "Hamburg");

        schiff.containerVerteilen(s2);

        schiff.berechneStapelgewichte();

        System.out.println(schiff.stapelgewichtePruefen());
        Stack[] temp = schiff.stapelreihe;
        for (int i = 0; i < temp.length; i++) {
            System.out.println("Stapel " + i + ": ");
            Container current = temp[i].top();
            while (current != null) {
                System.out.println(current.gewicht);
                current = current.getNext();
            }
            System.out.println("Stapel mit dem Gewicht " + schiff.stapelgewichte[i] + " Ende");
        }
    }

    // Aufgabe d
    public static Queue verladenVorbereiten(Stack land, String ort) {
        Queue s = new Queue(null, null);
        Container current = land.pop();
        while (current != null) {
            if (current.isZielort(ort)) {
                s.enqueue(current);
            }
            current = current.getNext();
        }
        return s;
    }
}
