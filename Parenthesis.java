import java.util.*;
import java.util.Stack;

public class Parenthesis{

    public static void main(String[] args) {
        // String s = "[{()}]";
        // String s = "[()()]{}";
        // String s ="([]";
        String s ="([{]})";


        boolean res = checker(s);
        System.out.println(res);
        
    }

    static boolean checker(String str)
    {
        Stack<Character> stack = new Stack<>();
        for(char c : str.toCharArray()){
            if(c =='('|| c=='{' || c=='[')
                stack.push(c);
            else{
                if(stack.isEmpty()) return false;
                char top = stack.pop();
                if( (c==')'&& top !='(') ||(c=='}'&& top !='{')||(c==']'&& top !='[') )
                return false;
            }
        }
        return stack.isEmpty();
    }

}