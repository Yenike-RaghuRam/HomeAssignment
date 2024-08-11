package Set3;


public class ReverseWordsGivenSentence {

    public static String reverseWords(String str){
        String new_str = "";
        String[] arr = str.split(" ");
        for(int i=arr.length - 1;i>=0;i--){
            if(i == 0){
                new_str += arr[i];
            }else {
                new_str += arr[i] + " ";
            }
        }
        return new_str;
    }

    public static void main(String[] args) {
        System.out.println(reverseWords("geeks quiz practice code"));
    }

}


