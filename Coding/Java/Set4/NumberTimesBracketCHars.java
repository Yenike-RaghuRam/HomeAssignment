package Set4;

import java.util.Stack;

public class NumberTimesBracketCHars {
    public static String numberTimechar(String val){
        Stack<Character> s = new Stack<>();
        String result = "";
        for(int i = 0;i<val.length();i++){
            if(val.charAt(i) != ']'){
                s.push(val.charAt(i));
            } else {
                String str = result;
                while(s.peek() != '['){
                    str = s.pop() + str;
                }
                s.pop();
                int times = s.pop() - '0';
                result = "";
                while(times != 0){
                    result += str;
                    times--;
                }
            }
        }
        return result;
    }
    public static void main(String[] args) {
        System.out.println(numberTimechar("3[b2[ca]]"));
    }
}
