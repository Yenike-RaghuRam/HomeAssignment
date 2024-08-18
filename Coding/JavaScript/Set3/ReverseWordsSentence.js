console.log(reverseWords("geeks quiz practice code"))
function reverseWords(str){
    str_arr = str.split(" ")
    new_str = ""
    for(let i=str_arr.length - 1; i>=0; i--){
        if(i == 0)
            new_str += str_arr[i]
        else
            new_str += str_arr[i] + " "
    }
    return new_str
}