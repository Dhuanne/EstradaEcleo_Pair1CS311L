/**
 * You are given an array(list) strarr of strings and an integer k.
 * Your task is to return the first longest string consisting of k
 * consecutive strings taken in the array.*/
class ConsecutiveString {
    public static String longestConsec(String[] strarr, int k) {
        if (strarr.length == 0|| k > strarr.length || k <= 0 )
            return "";
        String longestStr = "";
        for (int index = 0; index < strarr.length - k + 1; index++) {
            StringBuilder sb = new StringBuilder();
            for (int i = index; i < index + k; i++) {
                sb.append(strarr[i]);
            }
            if (sb.toString().length() > longestStr.length()) {
                longestStr = sb.toString();
            }
        }
        return longestStr;
    }
}
