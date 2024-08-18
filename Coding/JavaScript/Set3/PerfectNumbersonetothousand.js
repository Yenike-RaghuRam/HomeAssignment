
for(let i=1; i<=1000;i++){
    if(perfectNumber(i)){
        console.log(i)
    }
}

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