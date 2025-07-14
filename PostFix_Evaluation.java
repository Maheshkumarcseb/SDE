import java.util.Stack;

public class PostFix_Evaluation {

    public static int evaluate(String[] str) {
        Stack<Integer> stack = new Stack<>();

        for (String token : str) {
            if (isOperator(token)) {
                int b = stack.pop();
                int a = stack.pop();
                int result = performOperation(a, b, token);
                stack.push(result);
            } else {
                stack.push(Integer.parseInt(token));
            }
        }

        return stack.pop();
    }

    public static boolean isOperator(String str) {
        return str.equals("+") || str.equals("-") || str.equals("*") || str.equals("/");
    }

    public static int performOperation(int a, int b, String str) {
        if (str.equals("+"))
            return a + b;
        else if (str.equals("-"))
            return a - b;
        else if (str.equals("*"))
            return a * b;
        else if (str.equals("/"))
            return a / b;
        else
            throw new IllegalArgumentException("Invalid operator: " + str);
    }

    public static void main(String[] args) {


        // Example postfix expression: 2 + (3 * 1) - 9 = -4
        // String[] str = {"2", "3", "1", "*", "+", "9", "-"};
         String[] str = {"100", "200", "+", "2", "/", "5", "*", "7", "+"};
        int ans = evaluate(str);

        System.out.println("Result: " + ans);  // Output: -4
    }
}
