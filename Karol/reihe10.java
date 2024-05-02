package Karol;

import javakarol.Welt;
import javakarol.Roboter;

public class reihe10 {
    public static void main(String[] args) {

        Welt matrix = new Welt(11, 11, 10);
        Roboter neo = new Roboter(1, 1, 'O', matrix);
        for (int i = 0; i < 10; i++) {
            neo.Hinlegen();
            neo.Schritt();
        }
        // Ergaenze Programmcode, sodass Neo alle Ziegel einsammelt
    }
}
