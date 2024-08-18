console.log(perfectNumber(6))
console.log(perfectNumber(2))


function perfectNumber(num){
    let sum = 0;
    for(let i = 2;i<=Math.sqrt(num);i++){
        if(num % i == 0){
            sum += i;
            sum += Math.floor(num/i);
        }
    }
    sum += 1
    return sum == num
}