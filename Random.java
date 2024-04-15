import java.util.Scanner;

public class Random {

        public static void main(String [] args) {
            Scanner scanner = new Scanner(System.in);
            int randomNumber = (int) (Math.random()*100) +1;
            System.out.println("Enter your guess (1-100):");
            System.out.println("You Have 10 guess");
            int count = 0;

            for(int guess =9; guess > 0; guess-- ) {
                int playerGuess = scanner.nextInt();
                count++;

                if(playerGuess == randomNumber ) {
                    System.out.println("Correct! you win the game!");
                    System.out.println("It took you " + count + " tries.");

                }
                else if(randomNumber > playerGuess) {
                    System.out.println("Nope! The Number is higher.");
                    System.out.println("You Have " + guess + " guess left . Guess Again" );
                }
                else  {
                    System.out.println("Nope! The Number is lower.");
                    System.out.println("You Have " + guess+ " guess left . Guess Again");
                }
            }
        }
    }


