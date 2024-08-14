import java.util.*;
//151. Reverse Words in a String

public class ReverseWordsInAString {
    public static String reverseWords(String s) {
        // Step 1: Trim the string to remove leading and trailing spaces
        s = s.trim();
        
        // Step 2: Split the string into words
        String[] words = s.split("\\s+");
        
        // Step 3: Reverse the order of words
        Collections.reverse(Arrays.asList(words));
        
        // Step 4: Join the reversed words into a single string
        return String.join(" ", words);
    }
    public static void main(String[] args) {
        String s = "Shahid Afridi You are Great";
        String ans = reverseWords(s);
        System.out.println(ans);
    }
}
