import static org.junit.Assert.*;
import org.junit.Test;

public class RockPapersScissors {

    public class Kata {
        public static String rps(String p1, String p2) {
            if(p1 == p2) return "Draw!";
            int p = (p1 + p2).equals("scissorspaper") || (p1 + p2).equals("rockscissors") || (p1 + p2).equals("paperrock") ? 1 : 2;
            return "Player " + p + " won!";
        }
    }


    @Test
    public void test1() {
        System.out.println("Fixed Tests Player 1 won!");
        assertEquals("Player 1 won!", Kata.rps("rock", "scissors"));
        assertEquals("Player 1 won!", Kata.rps("scissors", "paper"));
        assertEquals("Player 1 won!", Kata.rps("paper", "rock"));
    }
    @Test
    public void test2() {
        System.out.println("Fixed Tests Player 2 won!");
        assertEquals("Player 2 won!", Kata.rps("scissors", "rock"));
        assertEquals("Player 2 won!", Kata.rps("paper", "scissors"));
        assertEquals("Player 2 won!", Kata.rps("rock", "paper"));
    }
    @Test
    public void test3() {
        System.out.println("Fixed Tests Draw!");
        assertEquals("Draw!", Kata.rps("scissors", "scissors"));
        assertEquals("Draw!", Kata.rps("paper", "paper"));
        assertEquals("Draw!", Kata.rps("rock", "rock"));
    }

}