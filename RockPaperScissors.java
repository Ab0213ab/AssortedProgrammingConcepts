/*

Andrew Schaefer

Write a program that is similar to the popular game titled “Rock-Paper-Scissors.” The program 
randomly generates the number of 1, 2, or 3 with 1 being Rock, 2 being Paper, and 3 being 
Scissors. Then, the program is to prompt the user to enter a value of 1, 2, or 3. Next, the 
program displays a clear readable message displaying both the computer’s selection, the 
user’s selection, and the results.

*/

import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class RockPaperScissors {

    // Compares choices to determine winner
    public static void compareChoices(int userChoice, int computerChoice) {
        switch (userChoice) {
            case 1:
                switch (computerChoice) {
                    case 1:
                    System.out.println("You both chose rock so, it's a tie!");
                    break;
                    case 2:
                    System.out.println("You chose rock and the computer chose paper. " + 
                    "Paper covers rock, so the computer wins!");
                    break;
                    case 3:
                    System.out.println("You chose rock and the computer chose scissors. " + 
                    "Rock destroys scissors so, you win!");
                    break;
                }
                break;
            case 2: 
                switch (computerChoice) {
                    case 1:
                    System.out.println("You chose paper and the computer chose rock. " +
                    "Paper covers rock so, you win!");
                    break;
                    case 2:
                    System.out.println("You both chose paper so, it's a tie!");
                    break;
                    case 3:
                    System.out.println("You chose paper and the computer chose scissors. " + 
                    "Scissors cut paper so, the computer wins!");
                    break;
                }
                break;
            case 3: 
                switch (computerChoice) {
                    case 1:
                    System.out.println("You chose scissors and the computer chose rock. " +
                    "Rock destroys scissors so, the computer wins!");
                    break;
                    case 2:
                    System.out.println("You chose scissors and the computer chose paper. " + 
                    "Scissors cut paper so, you win!");
                    break;
                    case 3:
                    System.out.println("You both chose scissors so, it's a tie!");
                    break;
                }
                default:
                    System.out.println("You entered an incorrect number.");
            break;
        }
    }


    
    public static void main(String[] args) {

        // Generates random number between 1-3
        int computerChoice = ThreadLocalRandom.current().nextInt(1,3 + 1);

        Scanner sc = new Scanner(System.in);

        System.out.println("Welcome to Rock, Paper, Scissors." + 
        "\nPlease enter your choice of 1 for rock, 2 for paper, " +
        "or 3 for scissors. Good luck!");
        int userChoice = sc.nextInt();

        System.out.println("User Choice: " + userChoice);

        compareChoices(userChoice, computerChoice);

        sc.close();
       
    }   
}
