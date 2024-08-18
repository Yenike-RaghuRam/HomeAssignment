function sumofdigits(num){
    if(num == 0)
        return 0
    return num % 10 + sumofdigits(Math.floor(num/10))
}
console.log(sumofdigits(10))
console.log(sumofdigits(101))
console.log(sumofdigits(111))