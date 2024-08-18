package Set4;

import java.util.Arrays;

public class ReverseStringExceptPosSpecial {

    public static String reverseExceptPosSpecial(String str){
        char[] val = str.toCharArray();
        int start = 0;
        int end = val.length - 1;
        while(start < end){
            if(!Character.isLetterOrDigit(val[start]))
                start++;
            else if(!Character.isLetterOrDigit(val[end]))
                end--;
            else{
                char temp = val[start];
                val[start] = val[end];
                val[end] = temp;
                start++;
                end--;
            }
        }
        String newstr = "";
        for(char ch : val){
            newstr += ch;
        }
        return newstr;
    }

    public static void main(String[] args) {
        System.out.println(reverseExceptPosSpecial("Hello@1a"));
    }
}
