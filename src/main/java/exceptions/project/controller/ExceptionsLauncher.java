package exceptions.project.controller;

import exceptions.project.model.Square;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionsLauncher {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        boolean wrongInput = true;
        double side = 0;
        double surface = 0;
        // Opdracht 3. Controleer op juiste invoer van een getal.
        while (wrongInput) {
            try {
                System.out.print("Geef een zijde: ");
                side = input.nextDouble();
                wrongInput = false;
            } catch (InputMismatchException fout) {
                System.out.println("Je moet een getal invoeren met een komma.");
                input.next(); // Om de buffer te legen.
            }
        }
        // Geef nu de oppervlakte terug.
        Square square = new Square(side);
        System.out.printf("De oppervlakte is: %.2f\n", square.getSurface());

        // Opdracht 4. Controleer op een positieve invoer van de oppervlakte.
        // Ook nu wordt gecontroleerd dat er een getal wordt ingevoerd.
        boolean negativeInput = true;
        while (negativeInput) {
            wrongInput = true;
            while (wrongInput) {
                try {
                    System.out.print("Geef een oppervlakte: ");
                    surface = input.nextDouble();
                    wrongInput = false;
                } catch (InputMismatchException fout) {
                    System.out.println("Je moet een getal invoeren met een komma.");
                    input.next(); // Om de buffer te legen.
                }
            }
            // De oppervlakte is een getal. Controleer hier of dit niet negatief is.
            try {
                System.out.printf("De bijbehorende zijde is %.2f\n", Square.CalculateSide(surface));
                negativeInput = false;
            } catch (IllegalArgumentException berekenZijdeFout) {
                System.out.println(berekenZijdeFout.getMessage());
            }
        }
    }
}
