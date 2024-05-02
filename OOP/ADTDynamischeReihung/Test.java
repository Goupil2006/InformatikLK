package OOP.ADTDynamischeReihung;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        DynamischeReihung reihung = new DynamischeReihung();
        Scanner scanner = new Scanner(System.in);
        boolean isRunning = true;
        while (isRunning) {
            System.out.println("Was willst du machen?");
            System.out.println("1. Person hinzufügen");
            System.out.println("2. Person zum Arzt");
            System.out.println("3. Person anzeigen an Index");
            System.out.println("4. Person an Index auf die 1");
            String input = scanner.nextLine();
            if (input.equals("1")) {
                System.out.println("Gib den Wert ein:");
                int value = scanner.nextInt();
                scanner.nextLine();
                reihung.append(new Element(value));
            } else if (input.equals("2")) {
                System.out.println("Gib den Index ein:");
                int index = scanner.nextInt();
                scanner.nextLine();
                reihung.delete(index);
            } else if (input.equals("3")) {
                System.out.println("Gib den Index ein:");
                int index = scanner.nextInt();
                scanner.nextLine();
                System.out.println(reihung.getItem(index).getValue());
            } else if (input.equals("4")) {
                System.out.println("Gib den Index ein:");
                int index = scanner.nextInt();
                scanner.nextLine();
                Element temp = reihung.getItem(index);
                reihung.setItem(1, temp);
            } else {
                isRunning = false;
            }
            for (int i = 1; i < reihung.getLength(); i++) {
                System.out.println(reihung.getItem(i).getValue());
            }
        }

    }
}
