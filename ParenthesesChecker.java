public class ParenthesesChecker {

    public static boolean areParenthesesBalanced(String str) {
        int balance = 0;
        
        
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            
            if (ch == '(') {
                balance++;
            }
            else if (ch == ')') {
                balance--;
                
                if (balance < 0) {
                    return false;
                }
            }
        }
        
        return balance == 0;
    }

    public static void main(String[] args) {
        
        String input = "(())"; 
        if (areParenthesesBalanced(input)) {
            System.out.println("Parentheses are balanced.");
        } else {
            System.out.println("Parentheses are not balanced.");
        }
    }
}

