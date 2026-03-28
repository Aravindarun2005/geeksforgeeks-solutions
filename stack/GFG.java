// Java program to delete consecutive 
// same words using Stack
import java.util.Stack;

class GfG {
    
    // Function to remove consecutive same 
    // words using stack
    static int removeConsecutiveSame(String[] arr) {
        
        Stack<String> stk = new Stack<>();

        // Traverse the array
        for (String word : arr) {
            
            // If stack is not empty and top element 
            // is same as current
            if (!stk.isEmpty() && stk.peek().equals(word)) {
                stk.pop();
            } else {
                
                // Push if no consecutive duplicate
                stk.push(word);
            }
        }
        
        return stk.size();
    }

    // Driver code
    public static void main(String[] args) {
        
        String[] arr = {"gfg", "for", "geeks", 
                        "geeks", "for"};

        System.out.println(removeConsecutiveSame(arr));
    }
}