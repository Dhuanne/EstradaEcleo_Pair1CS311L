/**
 * Complete the solution so that it reverses all of the words within the string passed in.

    Example(Input --> Output):

    "The greatest victory is that which requires no battle" --> "battle no requires which that is victory greatest The"
 */

public class ReversedWords{

    public static String reverseWords(String str){
        //write your code here...
       String[] str2 = str.split(" ");
        String fin = "";
        for(int i=str2.length-1;i>=0;i--){
          fin += str2[i];
          if(i>0)fin+=" ";
        }
        return fin;
     
    }
   }
