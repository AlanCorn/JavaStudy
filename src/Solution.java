java.util.EmptyStackException;
import java.util.Stack;
class Solution {
    public static boolean isMatch(char a, char b){
        if(a=='(' && b==')'){
            return true;
        }else if(a=='{' && b=='}'){
            return true;
        }else if(a=='[' && b==']'){
            return true;
        }
        return false;
    }
    public static boolean isValid(String s) {
        Stack<Character> myStack=new Stack<Character>();
        boolean flag = false;
        char compareChar;
        for(int i = 0; i <s.length(); i++) {
            compareChar = s.charAt(i);
            if(myStack.empty()){
                myStack.push(compareChar);
            }else if (isMatch(compareChar,myStack.peek())){
                myStack.pop();
            }else{
                myStack.push(compareChar);
            }
        }
        return myStack.empty();
    }
    public static void main(String[] args) {
        String s ="(){}[]";
        System.out.println(isValid(s));
    }
}
