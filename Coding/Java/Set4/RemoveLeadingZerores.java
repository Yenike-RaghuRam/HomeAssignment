package Set4;

public class RemoveLeadingZerores {

    public static String removeLeadingZeores(String str){
        if(str.isEmpty() || str.charAt(0) != '0'){
            return str;
        }
        int i = 0;
        for(;i<str.length();i++){
            if(str.charAt(i) != '0')
                break;
        }
        return str.substring(i);

    }

    public static void main(String[] args) {
        System.out.println(removeLeadingZeores("0000012345"));
    }
}
