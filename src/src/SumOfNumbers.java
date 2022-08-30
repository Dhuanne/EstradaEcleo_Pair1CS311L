/**
 * Given two integers a and b, which can be positive or negative,
 * find the sum of all the integers between and including them and return it.
 * If the two numbers are equal return a or b.
 *
 * Note: a and b are not ordered!
 * Examples:
 * (1, 0) --> 1 (1 + 0 = 1)
 * (1, 2) --> 3 (1 + 2 = 3)
 * (0, 1) --> 1 (0 + 1 = 1)
 * (1, 1) --> 1 (1 since both are same)
 * (-1, 0) --> -1 (-1 + 0 = -1)
 * (-1, 2) --> 2 (-1 + 0 + 1 + 2 = 2)
 * */
public class SumOfNumbers {
    public static int GetSum(int a, int b)
    {
        int max = Math.max(a, b);
        int min;
        int result = 0;
        for(min = Math.min(a, b); min<=max; min++){
            result += min;
        }
        return result;
    }
}
