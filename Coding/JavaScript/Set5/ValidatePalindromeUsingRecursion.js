function helper(num, temp, orig_num){
    if(num == 0)
        return temp == orig_num

    return helper(Math.floor(num/10), temp* 10 + num%10, orig_num)
}

function validpalindrecur(num){
    return helper(num, 0, num)
}
console.log(validpalindrecur(121))
console.log(validpalindrecur(123))