console.log(ncr(3,1))

function ncr(n , r){
    return factorial(n)/ (factorial(n-r) * factorial(r))
}

function factorial(n){
    let result = 1;
    for(let i=2;i<=n;i++){
        result *= i
    }
    return result
}