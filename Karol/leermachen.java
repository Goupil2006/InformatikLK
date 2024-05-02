package Karol;

import javakarol.Roboter;
import javakarol.Welt;

public class leermachen {
    public static void main(String[] args) {

        Welt matrix = new Welt(110, 110, 10);
        matrix.ZiegelVerstreuen(100000, 10);
        Roboter neo = new Roboter(1, 1, 'S', matrix);
        neo.VerzoegerungSetzen(0);
        neo.SprunghoeheSetzen(10);
        Boolean finished = false;
        int wand = 0;
        while (!finished) {
            while (!neo.IstWand()) {
                while (neo.IstZiegel()) {
                    neo.Aufheben();
                }
                neo.Schritt();
            }
            wand++;
            if (wand % 2 != 0) {
                neo.LinksDrehen();
            } else {
                neo.RechtsDrehen();
            }
            if (neo.IstWand()) {
                finished = true;
            } else {
                while (neo.IstZiegel()) {
                    neo.Aufheben();
                }
                neo.Schritt();
                if (wand % 2 != 0) {
                    neo.LinksDrehen();
                } else {
                    neo.RechtsDrehen();
                }
            }
        }

        // Neo goes to the corner
        neo.LinksDrehen();
        while (!neo.IstWand()) {
            neo.Schritt();
        }
        neo.LinksDrehen();
        while (!neo.IstZiegel()) {
            neo.Schritt();
        }
        while (neo.IstZiegel()) {
            neo.Aufheben();
        }
    }
}
