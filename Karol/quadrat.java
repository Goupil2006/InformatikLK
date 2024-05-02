package Karol;

import javakarol.Welt;
import javakarol.Roboter;

public class quadrat {
    public static void main(String[] args) {

        Welt matrix = new Welt(11, 11, 10);
        Roboter neo = new Roboter(1, 1, 'O', matrix);
        for (int i = 0; i < 16; i++) {
            for (int j = 0; j < 4; j++) {
                neo.Hinlegen();
                neo.Schritt();
            }
            neo.RechtsDrehen();
            ;
        }
        // Ergaenze Programmcode, sodass Neo alle Ziegel einsammelt
    }
}
