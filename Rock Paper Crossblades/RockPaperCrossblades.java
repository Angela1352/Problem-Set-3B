
/**
 * Angela Chen 1-2
 * Oct. 7, 2023
 * Problem Set 3B
 */

import java.util.Scanner;

public class RockPaperCrossblades {

    public static void main(String[] args) {     

        Scanner input = new Scanner(System.in);

        boolean playerWin = true;
        final int ROCK = 0;
        final int PAPER = 1;
        final int CROSSBLADES = 2;
        String r = "rock", p = "paper", c = "crossblades";
        int human = -5, computer = -5;

        System.out.println("Human, let's have an epic game of Rock, Paper, Crossblades!");
        System.out.println();
        System.out.print("You: ");
        String speech = input.nextLine();
        System.out.println();

        if (speech.length() >= 4 && r.equalsIgnoreCase(speech.substring(speech.length()-4))) human = 0;
        else if (speech.length() >= 5 && p.equalsIgnoreCase(speech.substring(speech.length()-5))) human = 1;
        else if (speech.length() >= 11 && c.equalsIgnoreCase(speech.substring(speech.length()-11))) human = 2;

        if (speech.length()>= 50 && human >= 0) {
            computer = (int)(Math.random()*2);
            System.out.print("Me: Does he know my strategy? Two stones in a row... what are the chances? Did he steal my notes? Did he follow me into the archives? No, stay the course: ");
            if (computer == 0) System.out.println("ROCK");
            else if (computer == 1) System.out.println("PAPER");
            else if (computer == 2) System.out.println("CROSSBLADES");
            System.out.println();
        } else if (speech.length() < 50 && human >= 0) {
            playerWin = false;
            System.out.println("Pathetic. You cannot hope to beat me without the passion of a thousand suns, without the dedication of a Pleistocene glacier! I choose ");
            if (human == 0) System.out.println("PAPER");
            else if (human == 1) System.out.println("CROSSBLADES");
            else if (human == 2) System.out.println("ROCK");
            System.out.println();
        } 

        if (human < 0) {
            playerWin = false;
            System.out.println("Me: You have failed to adhere to the ancient traditions of Rock, Paper, Crossblades! You have lost by disqualification! Disgraceful!");
            System.out.println();
        } else if (computer == human) {
            playerWin = false;
            System.out.println("Result: Unbelievable! We have tied! *Eye twitches*");
            System.out.println();
        } else if (computer == 1 && human == 2 || computer == 1 && human == 2 || computer == 2 && human == 0) playerWin = true;
        else if (human == 1 && computer == 2 || human == 1 && computer == 2 || human == 2 && computer == 0) playerWin = false;

        if (playerWin) System.out.println("Result: How could a tiny little human BEAT ME?! NOOOOOOOOO!");
        else if (!playerWin || !playerWin && computer != human) System.out.println("Result: As I predicted, I have won this battle. The kingdom is MINE!");
        System.out.println();
        System.out.println("computer" + computer);
        System.out.println("human" + human);
    }

}