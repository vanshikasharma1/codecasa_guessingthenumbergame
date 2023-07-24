import java.util.Scanner;
import java.util.Random;

public class GuessTheNumberGame {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Random rand = new Random();
        int randomNumber = rand.nextInt(100) + 1;
        int guess;
        int count = 0;
        boolean correct = false;
    
        System.out.println("Guess the number between 1 and 100. You have 7 attempts.");
    
        while (count < 7 && !correct) {
          guess = input.nextInt();
          count++;
    
          if (guess == randomNumber) {
            System.out.println("You guessed correctly in " + count + " tries!");
            correct = true;
          } else if (guess < randomNumber) {
            System.out.println("Too low, try again.");
          } else {
            System.out.println("Too high, try again.");
          }
        } 
    
        if (!correct) {
          System.out.println("You ran out of attempts. The number was " + randomNumber + ".");
        }
      }
    
}
