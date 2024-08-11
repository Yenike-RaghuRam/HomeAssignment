package Set2;

public class RemoveConsectiveDupliString {

    public static String removeconsecdup(String str){
        String new_str = "";
        int initial_index = 0;
        for(int i = 1; i<str.length();i++){
            if(str.charAt(initial_index) != str.charAt(i)){
                new_str += str.charAt(initial_index);
                initial_index = i;
            }
        }
        new_str += str.charAt(initial_index);

        return new_str;
    }

    public static void main(String[] args) {
        String s1 = "aabccba"; // abcba

        System.out.println(removeconsecdup(s1));

    }
}
