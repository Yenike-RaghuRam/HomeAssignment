console.log(splitNumToDigits(100))
function splitNumToDigits(num){

    arr = new Array()
    while(num!=0){
        let digit = num % 10
        arr.unshift(digit)
        num = Math.floor(num/10)
    }
    return arr

}