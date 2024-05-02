package Karol;

import javakarol.Welt;
import javakarol.Roboter;

public class treppe {
    public static void main(String[] args) {

        Welt matrix = new Welt(10, 10, 10);
        Roboter neo = new Roboter(1, 1, 'O', matrix);
        for (int i = 1; i < 9; i++) {
            for (int j = 0; j < i; j++) {
                neo.Hinlegen();
            }
            neo.Schritt();
        }
        // Ergaenze Programmcode, sodass Neo alle Ziegel einsammelt
    }
}
