import java.util.Scanner;

public class MixedStrings {
    
    public static String swapFirstLastCharacters(String sentence) {
        if (sentence == null || sentence.isEmpty()) {
            return sentence;
        }
        
        String[] words = sentence.split(" ");
        StringBuilder result = new StringBuilder();
        
        for (int i = 0; i < words.length; i++) {
            String word = words[i];
            
            if (word.length() <= 1) {
                result.append(word);
            } else {
                char firstChar = word.charAt(0);
                char lastChar = word.charAt(word.length() - 1);
                String middle = word.substring(1, word.length() - 1);
                
                result.append(lastChar).append(middle).append(firstChar);
            }
            
            if (i < words.length - 1) {
                result.append(" ");
            }
        }
        
        return result.toString();
    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter a sentence: ");
        String input = scanner.nextLine();
        
        String output = swapFirstLastCharacters(input);
        System.out.println(output);
        
        scanner.close();
    }
}