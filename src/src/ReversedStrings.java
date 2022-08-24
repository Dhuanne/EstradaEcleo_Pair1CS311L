import static org.junit.Assert.assertEquals;

public class ReversedStrings {
    public static String solution(String str) {
        return new StringBuilder(str).reverse().toString();
    }

    public void sampleTests() {
        assertEquals("dlrow", ReversedStrings.solution("world"));
    }
}
