import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        String[] rpsMoves = {"paper", "rock", "scissors"};
        String pcMove = rpsMoves[(new Random().nextInt(rpsMoves.length))];
        //---------------------------------------------------------------
        Scanner input = new Scanner(System.in);
        System.out.println("-----------------------------------------------------------");
        System.out.println("Please select a paper rock or scissors");
        String playerMove = input.next();
        //---------------------------------------------------------------
        if (playerMove.equals("rock") || playerMove.equals("paper") || playerMove.equals("scissors"))
        {
        } else {
            System.out.println("You didn't write a paper rock or scissors {Example: rock, paper, scissors}");
            System.out.println("-----------------------------------------------------------");
        }
        if (playerMove.equals(pcMove)) {
            System.out.println("I chose also " + pcMove + " it's a draw, Let's play again!");
            System.out.println("-----------------------------------------------------------");
        } else if (playerMove.equals("rock"))
        {
            if (pcMove.equals("paper")) {
                System.out.println("): You lost, my choice was: " + pcMove + " but let's play again!");
                System.out.println("-----------------------------------------------------------");
            } else if (pcMove.equals("scissors")) {
                System.out.println("(: You won, my choice was: " + pcMove + " let's play again!");
                System.out.println("-----------------------------------------------------------");
            }
        } else if (playerMove.equals("paper"))
        {
            if (pcMove.equals("scissors")) {
                System.out.println("): You lost, my choice was: " + pcMove + " but let's play again!");
                System.out.println("-----------------------------------------------------------");
            } else if (pcMove.equals("rock")) {
                System.out.println("(: You won, my choice was: " + pcMove + " let's play again!");
                System.out.println("-----------------------------------------------------------");
            }
        } else if (playerMove.equals("scissors")) {
            if (pcMove.equals("rock"))
            {
                System.out.println("): You lost, my choice was: " + pcMove + " but let's play again!");
                System.out.println("-----------------------------------------------------------");
            } else if (pcMove.equals("paper")) {
                System.out.println("(: You won, my choice was: " + pcMove + " let's play again!");
                System.out.println("-----------------------------------------------------------");
            }
        }
    }
}

