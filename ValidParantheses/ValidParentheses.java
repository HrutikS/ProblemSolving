import java.util.Stack;

public class ValidParantheses{
    public static void main(String[] args) {
        String s = "([])"; //String cannot be empty
        System.out.println(validParantheses(s));
    }

    public static boolean validParantheses(String s) {
        Stack<Character> stk = new Stack<>();
        for(char c : s.toCharArray()){
            if(c=='(' || c=='[' || c=='{'){
                stk.add(c);
            }else{
                if(stk.isEmpty()){
                    return false;
                } 
                if((c==')' && stk.peek()!='(') || (c==']' && stk.peek()!='[') || (c=='}' && stk.peek()!='{')){
                    return false;
                }
                stk.pop();
            }
        }
        return stk.isEmpty();
    }
}
