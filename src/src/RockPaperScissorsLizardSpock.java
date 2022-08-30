/**
 * DESCRIPTION:
 * In this kata, your task is to implement an extended version of the famous rock-paper-scissors game. The rules are as follows:
 *
 * Scissors cuts Paper
 * Paper covers Rock
 * Rock crushes Lizard
 * Lizard poisons Spock
 * Spock smashes Scissors
 * Scissors decapitates Lizard
 * Lizard eats Paper
 * Paper disproves Spock
 * Spock vaporizes Rock
 * Rock crushes Scissors
 * Task:
 * Given two values from the above game, return the Player result as "Player 1 Won!", "Player 2 Won!", or "Draw!".
 *
 * Inputs
 * Values will be given as one of "rock", "paper", "scissors", "lizard", "spock".
 */
import java.util.*;
public class RockPaperScissorsLizardSpock {
    public static String rpsls(String player1, String player2){
        List<String> arr = List.of("scissors", "paper", "rock", "lizard", "spock");
        int i1 = arr.indexOf(player1);
        int i2 = arr.indexOf(player2);
        if(i1 < i2) return (i2 - i1) % 2 != 0 ? "Player 1 Won!" : "Player 2 Won!";
        if(i1 > i2) return (i1 - i2) % 2 != 0 ? "Player 2 Won!" : "Player 1 Won!";
        return "Draw!";
    }

}
