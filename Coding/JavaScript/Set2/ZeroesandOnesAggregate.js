
let arr = [0, 1, 0, 1, 0, 0, 1, 1, 1, 0]
let arr_len = arr.length
aggregate(arr, arr_len)
console.log(arr)

function aggregate(arr, arr_len){
    let one_index_pos = 0
    for(let cur_index=0;cur_index<arr_len;cur_index++){
        if(arr[cur_index] == 0){
            let temp = arr[cur_index]
            arr[cur_index] = arr[one_index_pos]
            arr[one_index_pos] = temp
            one_index_pos++
        }
    }
}