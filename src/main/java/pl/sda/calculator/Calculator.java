package pl.sda.calculator;

import java.util.Scanner;

/**
 * Created by jakubwrabel on 14.01.2017.
 */
public class Calculator {
    public static void main(String[] args) {
        Scanner scannerIn = new Scanner(System.in);

        System.out.println("Podaj pierwszą liczbę: ");
        Integer x = scannerIn.nextInt();

        System.out.println("Podaj drugą liczbę: ");
        Integer y = scannerIn.nextInt();

        System.out.println("Podaj znak działania (-, +, *, /):");
        String operationChar = new Scanner(System.in).nextLine();


        Operation operationToPerform = null;

        switch (operationChar) {
            case "+":
                operationToPerform = new Add();
                break;
            case "-":
                operationToPerform = (a, b) -> a + b;
                break;
            default:
                throw new IllegalArgumentException("Zły kod działania");
        }

        double result = operationToPerform.eval(x, y);
        System.out.println("Wynik działania: " + result);


    }
}
