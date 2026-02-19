import java.util.HashMap;
import java.util.Map;

public class StringUtils {
    public static boolean areAnagrams(String str1, String str2) {
        if (str1 == null || str2 == null) {
            return false;
        }
        
        str1 = str1.replaceAll("\\s", "").toLowerCase();
        str2 = str2.replaceAll("\\s", "").toLowerCase();
        
        if (str1.length() != str2.length()) {
            return false;
        }
        
        Map<Character, Integer> charCount = new HashMap<>();
        
        for (char c : str1.toCharArray()) {
            charCount.put(c, charCount.getOrDefault(c, 0) + 1);
        }
        
        for (char c : str2.toCharArray()) {
            int count = charCount.getOrDefault(c, 0);
            if (count == 0) {
                return false; 
            }
            charCount.put(c, count - 1);
        }
        
        return true;
    }
    
    public static void main(String[] args) {
        System.out.println("listen and silent: " + areAnagrams("listen", "silent"));
        System.out.println("hello and world: " + areAnagrams("hello", "world"));
    }
}