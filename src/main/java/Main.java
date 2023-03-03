import java.util.Scanner;
import java.util.Random;
/**
 * Created by iyasuwatts on 10/17/17.
 */
public class Main {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        Random rand = new Random();
        //int secretNumber = rand.nextInt(10);
        int secretNumber = (int) Math.floor(Math.random() * (11-1)) +1;
        System.out.println(secretNumber);
        int Guesses = 0;
        int userInput = 0;

        System.out.print("Hello, what is your name? :");
               String name = input.next();
                System.out.println("Welcome " + name + " Lets play a game, guess a number from 1-10, if you win, I'll give you a hug");

        do {
            System.out.print("Please make a guess: ");
            userInput = input.nextInt();
            Guesses++;

            if (userInput > secretNumber) {
                System.out.println("Your guess is too high..  ");
                System.out.println("Amount of guesses " + Guesses);

            }else if(userInput < secretNumber) {
                System.out.println("Your guess is too low..  ");
                System.out.println("Amount of guesses " + Guesses);


            }else /*(userInput == secretNumber)*/ {
                System.out.println("CONGRATULATIONS, YOU HAVE WON!!! YOU MAY REDEEM YOUR HUG..... RIGHT NOW ");

                System.out.println("You have done it in: " + Guesses);
                break;

            }
        } while (userInput != secretNumber);

    }
}
        /* while (!Guess) {

            Scanner input = new Scanner(System.in);
            System.out.print("Enter your name: ");
            String name = input.next();
            System.out.println("Welcome " + name + " lets play a guessing game, if you guess right, you get a hug, if you guess wrong, you will no longer be here..... ");
            ;

            System.out.print("MUAHAHAHAHAHA.....guess a number from 1-10... ANY NUMBER: ");
            input.nextInt();
            previousNumber = input.nextInt();
            GuessesLeft++;
            System.out.print(secretNumber);


            if (input.nextInt() == previousNumber) {
                System.out.println("You have guessed that Number Already!! Guess another number: ");
                input.nextInt();

            } else if (number > secretNumber) {
                System.out.print("Your guess is too high..");
                System.out.print("You have " + GuessesLeft + " Guesses left... Guess again: ");
                input.nextInt();
                previousNumber = input.nextInt();
                GuessesLeft++;

            } else if (number < secretNumber) {
                System.out.println("Your guess is too low.... ");
                System.out.print("You have " + GuessesLeft + " Guesses left... Guess again: ");
                input.nextInt();
                previousNumber = input.nextInt();
                GuessesLeft++;

            } else if (GuessesLeft == 3) {
                System.out.println("You no longer have any guesses...... now I must send you........ to the Shadow Realm. MUAHAHAHAHA");
                break;

            } else {
                Guess = true;
                System.out.println("CONGRATULATIONS, YOU HAVE WON!!! YOU MAY REDEEM YOUR HUG..... RIGHT NOW");
                break;

            }
        }
    }
}

*/





       // System.out.println("CONGRATULATIONS, YOU HAVE WON!!! YOU MAY REDEEM YOUR HUG..... RIGHT NOW");
       // break;
