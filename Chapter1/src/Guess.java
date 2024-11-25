import java.util.Random;
import java.util.Scanner;

public class Guess {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int min = 0;
        int max = 100;
        Random r = new Random();
        int secret = r.nextInt((max - min) + min);
        System.out.println("Guess your secret password");

        while (true) {
            System.out.println("Enter your secret password(between" + min + " and " + max + "): ");
            int guess = sc.nextInt();

            if (guess <  min || guess > max) {
                System.out.println("Please enter a number between " + min + " and " + max + ".");
                continue;
            }


            if (guess == secret) {
                System.out.println("Congratulations! You guessed secret password :" + secret);
                break;
            } else if (guess < secret) {
                min = guess;
                System.out.println("You are too low! Try to guess between " + min + " and " + max);
            } else {
                max = guess;
                System.out.println("You are too high! Try to guess between " + min + " and " + max);
            }
        }
    }
}
