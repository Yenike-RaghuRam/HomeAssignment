let arr = [0, 1, 2, 3, 2, 1]
let arr_len = arr.length

console.log(element_start_decreasing(arr, arr_len))

function element_start_decreasing(arr, arr_len){
    let index=arr_len-2
    for( ; index>=0 ; index--){
        if(arr[index] < arr[index + 1]){
            break
        }
    }
    return arr[index + 1]
}