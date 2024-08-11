package Set1;

public class AnagramStrings {
    public static boolean isAnagram(String str1, String str2){
        if(str1.length() != str2.length())
            return false;
        int str1_ascii = 0;
        int str2_ascii = 0;
        for(int i=0;i<str1.length();i++){
            str1_ascii += str1.charAt(i);
        }
        for(int i= 0; i<str2.length();i++){
            str2_ascii += str2.charAt(i);
        }
        return str1_ascii == str2_ascii;
    }
    public static void main(String[] args) {

        String str1 = "abc";
        String str2 = "bac";

        System.out.println(isAnagram(str1, str2));

    }
}
