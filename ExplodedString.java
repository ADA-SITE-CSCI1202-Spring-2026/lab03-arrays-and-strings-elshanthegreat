public class ExplodedString {
    
    public static String explode(String input) {
        if (input == null || input.isEmpty()) {
            return "";
        }
        
        StringBuilder result = new StringBuilder();
        
        for (int i = 1; i <= input.length(); i++) {
            String prefix = input.substring(0, i);
            result.append(prefix);
        }
        
        return result.toString();
    }
    
    public static void main(String[] args) {
        String test = "Alma";
        String exploded = explode(test);
        
        System.out.println("Original: " + test);
        System.out.println("Exploded: " + exploded);
    }
}