import java.util.Random;
import java.util.Scanner;

public class GuessingProject {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Random val = new Random();
        int randomNumber = val.nextInt(1000);

        System.out.println("Guess the number between 0 and 999 ");

        int prediction;
        int tries = 0;

        do {

            prediction = scanner.nextInt();
            tries++;

            if (prediction == randomNumber) {
                System.out.println("Congratulation !!! You found the number in " + tries + " tries");
            } else if (prediction > randomNumber) {
                System.out.println("Lower - ");
            } else {
                System.out.println("Higher +");
            }

        } while (prediction != randomNumber);

        scanner.close();
    }
}
