console.log(isPrime(10))
console.log(isArmStrong(153))
function isPrime(num){
    if(num === 2){
        return true
    }
    let initial_factor = 2
    while(initial_factor <= Math.sqrt(num)){
        if(num % initial_factor == 0){
            return false
        }
        initial_factor++
    }
    return true
}

function isArmStrong(num){
    let orig_num = num
    let num_str = num.toString()
    let num_of_digits  = num_str.length
    let sum = 0
    while(num !=0){
        let rem = num % 10
        sum += Math.pow(rem, num_of_digits)
        num = Math.floor(num/10)
    }
    return orig_num == sum
}