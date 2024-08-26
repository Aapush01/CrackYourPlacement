//68. Text Justification
import java.util.*;

public class TextJustification{
    public List<String> fullJustify(String[] words, int maxWidth) {
        List<String> result = new ArrayList<>();
     int index = 0;

     while (index < words.length) {
         int totalChars = words[index].length();
         int last = index + 1;

         while (last < words.length) {
             if (totalChars + 1 + words[last].length() > maxWidth) break;
             totalChars += 1 + words[last].length();
             last++;
         }

         StringBuilder sb = new StringBuilder();
         int gaps = last - index - 1;

         // If we're on the last line or the number of words in the line is 1, left justify
         if (last == words.length || gaps == 0) {
             for (int i = index; i < last; i++) {
                 sb.append(words[i]);
                 if (i < last - 1) sb.append(" ");
             }
             // Fill the rest with spaces
             while (sb.length() < maxWidth) {
                 sb.append(" ");
             }
         } else {
             // Calculate the spaces
             int spaces = (maxWidth - totalChars) / gaps;
             int extraSpaces = (maxWidth - totalChars) % gaps;

             for (int i = index; i < last - 1; i++) {
                 sb.append(words[i]);
                 sb.append(" ");

                 // Extra space distribution
                 for (int j = 0; j < spaces + (i - index < extraSpaces ? 1 : 0); j++) {
                     sb.append(" ");
                 }
             }
             sb.append(words[last - 1]);
         }

         result.add(sb.toString());
         index = last;
     }

     return result;
 }
    public static void main(String[] args) {

    }
}