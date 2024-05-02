package OOP.MunzMaster;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Coin[] coins = new Coin[6];
        coins[0] = new Coin(1);
        coins[1] = new Coin(2);
        coins[2] = new Coin(1);
        coins[3] = new Coin(2);
        coins[4] = new Coin(1);
        coins[5] = new Coin(2);

        // Shuffle the coins array
        for (int i = coins.length - 1; i > 0; i--) {
            int j = (int) (Math.random() * (i + 1));
            Coin temp = coins[i];
            coins[i] = coins[j];
            coins[j] = temp;
        }

        Queue queue = new Queue(null, null);
        for (int i = 0; i < coins.length; i++) {
            queue.enqueue(coins[i]);
        }

        boolean found = true;
        while (found) {
            Coin temp = queue.dequeue();
            System.out.println("Erste Münze: " + temp.getValue() + "\n Was ist dein Guess? (1 oder 2)");
            int guess = scanner.nextInt();
            if (guess == queue.getHead().getValue()) {
                System.out.println("Richtig!");
                queue.enqueue(temp);
            } else {
                System.out.println("Falsch!");
                found = false;
            }
        }
    }
}
