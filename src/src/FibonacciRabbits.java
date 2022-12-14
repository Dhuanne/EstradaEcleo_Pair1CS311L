/**
 * In his publication Liber Abaci Leonardo Bonacci, aka Fibonacci, 
 * posed a problem involving a population of idealized rabbits. 
 * These rabbits bred at a fixed rate, matured over the course of one month, 
 * had unlimited resources, and were immortal.

 * Create a function that determines the number of pairs of mature rabbits after n months, 
 * beginning with one immature pair of these idealized rabbits that produce b pairs of offspring at the end of each month.

    To illustrate the problem, consider the following example:

    n = 5 months
    b = 3 births
    -> 19 mature rabbit pairs
    Month	Immature pairs	Mature pairs
    0	        1	            0
    1	        0	            1
    2	        3	            1
    3	        3	            4
    4	        12	            7
    5	        21	            19
 */


public class FibonacciRabbits {
    public static int fibRabbits(int n, int b) {
        int immature = 1, mature = 0, month = 0;            while (month < n) {
                // give birth
                int newBirth = mature * b;
                // grow up
                mature += immature;
                immature = newBirth;
                month++;
            }
            return mature;
        }
    
}
