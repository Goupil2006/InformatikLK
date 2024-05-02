package Karol;

import javakarol.Welt;
import javakarol.Roboter;

public class matrix {
  public static void main(String[] args) {

    Welt matrix = new Welt(10, 8, 5);
    Roboter neo = new Roboter(1, 1, 'S', matrix);
    neo.Schritt();
    neo.Schritt();
    neo.Schritt();
    neo.Hinlegen();
    neo.Hinlegen();
    // Ergaenze Programmcode, sodass Neo alle Ziegel einsammelt
  }
}
