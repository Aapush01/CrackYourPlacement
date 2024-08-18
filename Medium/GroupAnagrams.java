import java.util.*;
//49. Group Anagrams

public class GroupAnagrams{
    public List<List<String>> groupAnagrams(String[] strs) {
        if (strs == null || strs.length == 0) return new ArrayList<>();
        
        Map<String, List<String>> map = new HashMap<>();
        
        for (String s : strs) { 
            char[] charArray = s.toCharArray(); 
            Arrays.sort(charArray);
            String sorted = new String(charArray); 
            if (!map.containsKey(sorted)) {
                map.put(sorted, new ArrayList<>());
            } 
            map.get(sorted).add(s);
        } 
        return new ArrayList<>(map.values());
    }
    public static void main(String[] args) {

    }
}