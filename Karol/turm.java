package Karol;

import javakarol.Welt;
import javakarol.Roboter;

public class turm {
    public static void main(String[] args) {

        Welt matrix = new Welt(10, 10, 10);
        Roboter neo = new Roboter(1, 1, 'O', matrix);
        for (int i = 0; i < 3; i++) {
            neo.Hinlegen();
        }
        neo.SprunghoeheSetzen(3);
        neo.Schritt();
        // Ergaenze Programmcode, sodass Neo alle Ziegel einsammelt
    }
}
