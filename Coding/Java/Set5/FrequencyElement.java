package Set5;

public class FrequencyElement {

    public static int frequencyElem(int[] arr, int x, int y){
        int freqx = 0;
        int freqy = 0;
        for(int i=0; i<arr.length;i++){
            if(arr[i] == x)
                freqx++;
            else if(arr[i] == y)
                freqy++;
        }
        if(freqx == freqy){
            return Math.min(x, y);
        } else {
            if(freqx > freqy)
                return x;
            else
                return  y;
        }
    }
    public static void main(String[] args) {
        int[] arr = {1,1,2,2,3,3,4,4,4,4,5};
        System.out.println(frequencyElem(arr, 4, 5));
    }
}
