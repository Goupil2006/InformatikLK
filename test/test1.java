// A Programm that takes in a number and gives back all the primefactors of that number

import java.util.Scanner;

public class test1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int num = (int) sc.nextInt();
        int i = 2;
        while (num > 1) {
            if (num % i == 0) {
                System.out.println(i);
                num = num / i;
            } else {
                i++;
            }
        }
    }
}