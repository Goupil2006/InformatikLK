package Karol;

import javakarol.Roboter;
import javakarol.Welt;

public class LabyEntkommen {
    public static void main(String[] args) {

        Welt matrix = new Welt(20, 20, 10);
        matrix.ZiegelVerstreuen(200, 7);
        Roboter neo = new Roboter(1, 1, 'S', matrix);
        neo.VerzoegerungSetzen(10);
        neo.SprunghoeheSetzen(10);
    }
}
