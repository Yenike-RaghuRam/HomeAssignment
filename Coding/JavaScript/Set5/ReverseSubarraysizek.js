function reverseSubArraySizek(arr, k){

    for(let ind=0; ind<arr.length; ind=ind+k){
        start = ind
        end = Math.min(ind+k-1, arr.length-1);

        while(start<end){
            let temp = arr[start]
            arr[start] = arr[end]
            arr[end] = temp
            start++
            end--
        }
    }

}
let arr = [1, 2, 3, 4, 5]
reverseSubArraySizek(arr, 3)
console.log(arr)