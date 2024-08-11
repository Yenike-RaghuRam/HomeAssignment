package Set1;

public class SubsequenceString {

    public static boolean issubsequence(String str1, String str2){

        if(str1.length() > str2.length())
            return false;

        int str1Length = str1.length();
        int str2Length = str2.length();

        int str1_index = str1Length - 1;
        int str2_index = str2Length - 1;

        while(str1_index >=0 && str2_index >=0){
            if(str1.charAt(str1_index) == str2.charAt(str2_index)){
                str1_index--;
            }
            str2_index--;
        }
        return str1_index < 0;
    }
    public static void main(String[] args) {
        String str1 = "aaa";
        String str2 = "abcada";

        System.out.println(issubsequence(str1, str2));

    }
}
