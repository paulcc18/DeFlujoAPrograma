package DeFlujoaPrograma;

/*
Integers: Paul Cumbal & Dominix Barroso
Class: Sistemas 01
*/

import java.util.Scanner;

public class FIBONACCI {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("\tHow many terms do you want to generate?:");
        int numberCases = scanner.nextInt();

        int firstNumber = 0, secondNumber = 1;
        System.out.println("\tThe series for " + numberCases + " terms:");

        for (int i = 0; i < numberCases; i++) {
            System.out.print("    "+ firstNumber );
            int auxiliar = firstNumber + secondNumber;
            firstNumber = secondNumber;
            secondNumber = auxiliar;
        }
        scanner.close();
    }
}
