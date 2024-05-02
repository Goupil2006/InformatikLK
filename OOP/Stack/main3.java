package OOP.Stack;

import java.util.Scanner;

public class main3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Stack stack = new Stack();
        stack.push(new Element("eins"));
        stack.push(new Element("zwei"));
        stack.push(new Element("drei"));
        stack.push(new Element("vier"));
        stack.push(new Element("fünf"));
        boolean run = true;
        while (run) {
            System.out.println("\n1. Oberste Rechnung ausheften");
            System.out.println("2. Vorne einheften");
            System.out.println("3. Nach Pointer einheften");
            System.out.println("4. Pointer nach unten bewegen");
            System.out.println("5. Pointer auf erstes Element setzen");
            System.out.println("6. Pointer löschen");
            int eingabe = scanner.nextInt();
            scanner.nextLine();
            switch (eingabe) {
                case 1:
                    System.out.println(stack.pop().getValue());
                    break;
                case 2:
                    System.out.println("Element eingeben: ");
                    stack.push(new Element(scanner.nextLine()));
                    break;
                case 3:
                    System.out.println("Element eingeben: ");
                    stack.addAfterPointer(new Element(scanner.nextLine()));
                    break;
                case 4:
                    stack.pointermovedown();
                    break;
                case 5:
                    stack.pointertop();
                    break;
                case 6:
                    System.out.println(stack.deletePointerElement().getValue());
                    break;
                default:
                    run = false;
                    break;
            }

            System.out.println("\nGesamter Stack: ");
            Element foo = stack.top();
            while (foo != null) {
                System.out.println(foo.getValue());
                foo = foo.getNext();
            }
        }

    }
}
