package Set4;

public class RepeatEachCharacterTwice {
    public static String repeatEachTwice(String str){
        String newstr = "";
        for(int i=0;i<str.length();i++){
            newstr += str.charAt(i) + Character.toString(str.charAt(i));
        }
        return newstr;
    }
    public static void main(String[] args) {
        System.out.println(repeatEachTwice("welcome"));
    }
}
