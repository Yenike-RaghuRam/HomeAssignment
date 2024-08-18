package Set4;

public class ReverseSecondHalf {
    public static String reverse2ndHalf(String str){
        String new_str = "";
        int second_index_start;
        if(str.length() % 2 == 0){
            new_str += str.substring(0, str.length()/2);
            second_index_start = str.length()/2;
        } else {
            new_str += str.substring(0, str.length()/2 + 1);
            second_index_start = str.length()/2 + 1;
        }
        for(int i = str.length() - 1 ;i>=second_index_start;i-- ){
            new_str += str.charAt(i);
        }
        return new_str;
    }
    public static void main(String[] args) {
        System.out.println(reverse2ndHalf("12345"));
        System.out.println(reverse2ndHalf("1234"));

    }
}
