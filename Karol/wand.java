package Karol;

import javakarol.Welt;
import javakarol.Roboter;

public class wand {
    public static void main(String[] args) {
        Welt matrix = new Welt(11, 11, 10);
        Roboter neo = new Roboter(1, 1, 'S', matrix);
        for (int i = 0; i < 3; i++) {
            neo.Schritt();
            neo.LinksDrehen();
            neo.LinksDrehen();
            neo.Hinlegen();
            neo.Schritt();
            neo.LinksDrehen();
            neo.LinksDrehen();
            for (int j = 0; j < 3; j++) {
                neo.Hinlegen();
                neo.Schritt();

            }
            neo.LinksDrehen();
            neo.LinksDrehen();
        }
    }
}
