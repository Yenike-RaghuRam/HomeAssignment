function reverseExcSpecial(str){
    arr = str.split('')
    let start = 0
    let end = arr.length - 1
    while(start < end){
        if(!isalphaNumeric(arr[start])){
            start++
        } else if(!isalphaNumeric(arr[end])){
            end--
        } else {
            let temp = arr[start]
            arr[start] = arr[end]
            arr[end] = temp
            start++
            end--
        }
        
    }
    return arr.join('')
}

function isalphaNumeric(chr){
    if ((chr >= '0' && chr <= '9') ||
        (chr >= 'a' && chr <= 'z') ||
        (chr >= 'A' && chr <= 'Z'))
        return true
    return false

}

console.log(reverseExcSpecial("a1oll@eh"))