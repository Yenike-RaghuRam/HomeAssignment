console.log(reverseNumber(21))
function reverseNumber(num){
    let new_num = 0
    while(num!=0){
        let digit = num % 10
        new_num = new_num * 10 + digit
        num = Math.floor(num/10)
    }
    return new_num
}