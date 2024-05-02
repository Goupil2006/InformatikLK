package Karol;

import javakarol.Welt;
import javakarol.Roboter;

public class ziegelAußenAbstand {
    public static void main(String[] args) {
        Welt matrix = new Welt(11, 11, 10);
        Roboter neo = new Roboter(1, 1, 'S', matrix);
        for (int i = 0; i < 4; i++) {
            while (!neo.IstWand()) {
                neo.Schritt();
                neo.LinksDrehen();
                if (!neo.IstZiegel()) {
                    neo.Hinlegen();
                }
                neo.RechtsDrehen();
            }
            neo.LinksDrehen();
            neo.Aufheben();
            neo.Schritt();
        }
    }

}
