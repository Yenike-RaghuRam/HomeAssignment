console.log(singleDigit(1234))
function singleDigit(num){
    while(num > 9){
        let sum = 0
        while(num != 0){
            let rem = num % 10
            sum += rem
            num = Math.floor(num/10)
        }
        num = sum
    }
    return num
}