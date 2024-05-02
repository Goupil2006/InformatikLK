package OOP.Stack;

public class main2 {
    public static void main(String[] args) {
        Stack stack1 = new Stack();
        for (int i = 0; i < 20; i++) {
            int temp = (int) (Math.random() * 5);
            switch (temp) {
                case 0:
                    stack1.push(new Element(10));
                    break;
                case 1:
                    stack1.push(new Element(20));
                    break;
                case 2:
                    stack1.push(new Element(50));
                    break;
                case 3:
                    stack1.push(new Element(1));
                    break;
                case 4:
                    stack1.push(new Element(2));
                    break;
                default:
                    break;
            }
        }
        Stack stack2 = new Stack();
        Stack stack3 = new Stack();
        Stack stack4 = new Stack();
        Stack stack5 = new Stack();
        Stack stack6 = new Stack();
        while (!stack1.isEmpty()) {
            switch (stack1.pop().getValue()) {
                case 10:
                    stack2.push(new Element(10));
                    break;
                case 20:
                    stack3.push(new Element(20));
                    break;
                case 50:
                    stack4.push(new Element(50));
                    break;
                case 1:
                    stack5.push(new Element(1));
                    break;
                case 2:
                    stack6.push(new Element(2));
                    break;
            }
        }
        int Anzahl = 0;
        while (!stack2.isEmpty()) {
            stack2.pop();
            Anzahl++;
        }
        System.out.println("Anzahl der 10ct Stücke: " + Anzahl);
        System.out.println("Der Wert ist: " + (Anzahl * 10) + "ct");
        Anzahl = 0;
        while (!stack3.isEmpty()) {
            stack3.pop();
            Anzahl++;
        }
        System.out.println("Anzahl der 20ct Stücke: " + Anzahl);
        System.out.println("Der Wert ist: " + (Anzahl * 20) + "ct");
        Anzahl = 0;
        while (!stack4.isEmpty()) {
            stack4.pop();
            Anzahl++;
        }
        System.out.println("Anzahl der 50ct Stücke: " + Anzahl);
        System.out.println("Der Wert ist: " + (Anzahl * 50) + "ct");
        Anzahl = 0;
        while (!stack5.isEmpty()) {
            stack5.pop();
            Anzahl++;
        }
        System.out.println("Anzahl der 1€ Stücke: " + Anzahl);
        System.out.println("Der Wert ist: " + (Anzahl * 1) + "€");
        Anzahl = 0;
        while (!stack6.isEmpty()) {
            stack6.pop();
            Anzahl++;
        }
        System.out.println("Anzahl der 2€ Stücke: " + Anzahl);
        System.out.println("Der Wert ist: " + (Anzahl * 2) + "€");
    }
}
