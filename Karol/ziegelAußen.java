package Karol;

import javakarol.Welt;
import javakarol.Roboter;

public class ziegelAußen {
    public static void main(String[] args) {
        Welt matrix = new Welt(11, 11, 10);
        Roboter neo = new Roboter(1, 1, 'S', matrix);
        for (int i = 0; i < 4; i++) {
            while (!neo.IstWand()) {
                neo.Hinlegen();
                neo.Schritt();
            }
            neo.LinksDrehen();
        }
    }

}
