import java.util.Scanner;
import java.util.Random;

public class RockPaperScissors {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        String[] rps = {"R", "P", "S"};
        String computerPlay = rps[random.nextInt(3)];

        System.out.println("LET'S PLAY ROCK, PAPER, SCISSORS");
        System.out.println("Press R for Rock");
        System.out.println("Press P for Paper");
        System.out.println("Press S for Scissors");
        System.out.print("What will be your move? ");
        String personPlay = scanner.nextLine().toUpperCase();

        System.out.println("Computer's Move is: " + computerPlay);

        if (personPlay.equals(computerPlay)) {
            System.out.println("It's a Tie. Try again...");
        } else if (personPlay.equals("R") && computerPlay.equals("S") ||
                   personPlay.equals("P") && computerPlay.equals("R") ||
                   personPlay.equals("S") && computerPlay.equals("P")) {
            System.out.println("You win!!!");
        } else {
            System.out.println("You lose!!!");
        }
    }