/**
 * DESCRIPTION:
Consider the numbers 6969 and 9116. When you rotate them 180 degrees (upside down), 
these numbers remain the same.  To clarify, if we write them down on a paper and turn 
the paper upside down, the numbers will be the same. 
Try it and see! Some numbers such as 2 or 5 don't yield numbers when rotated.

Given a range, return the count of upside down numbers within that range. 

For example, solve(0,10) = 3, because there are only 3 upside down numbers >= 0 and < 10. They are 0, 1, 8.
 */

public class UpsideDownNumbers {
    public int solve(int x, int y) {
      int count = 0;
      for (int i=x; i<y; i++)
      if (itWorks(i)) count++;
      return count;
    }
    public boolean itWorks(int x){
      String num = String.valueOf(x);
      String nem = num.replaceAll("[01986]","");
      if (nem.length() > 0) return false;
      String number = "";
      for (int i=0; i<num.length(); i++)
        number = num.charAt(i) + number;
      number = number.replaceAll("6","t");
      number = number.replaceAll("9","6");
      number = number.replaceAll("t","9");
      return number.equals(String.valueOf(x));
    }
}
