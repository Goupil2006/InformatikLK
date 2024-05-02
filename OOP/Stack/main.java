package OOP.Stack;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Stack stack = new Stack();
        System.out.println("Anzahl der Elemente eingeben: ");
        int n = scanner.nextInt();
        for (int i = 0; i < n; i++) {
            System.out.println("Element eingeben: ");
            int value = scanner.nextInt();
            stack.push(new Element(value));
        }
        for (int i = 0; i < n; i++) {
            Element element = stack.pop();
            System.out.println("Element an der Stelle " + (i + 1) + ": " + element.getValue());
        }

    }
}
