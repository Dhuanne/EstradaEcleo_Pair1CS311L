/**
 * Complete the solution so that it reverses the string passed into it.
 * */
public class ReversedStrings {
    public static String solution(String str) {
        String nstr ="";

        char ch;
        for (int i=0; i<str.length(); i++)
        {
            ch= str.charAt(i); //extracts each character
            nstr= ch+nstr; //adds each character in front of the existing string

        }

        return nstr;
    }

}
