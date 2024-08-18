
console.log(fibinocci(10))

function fibinocci(n){
    let arr = new Array(n+1)
    arr[1] = 0
    arr[2] = 1
    for(let index=3; index<arr.length;index++){
        arr[index] = arr[index - 1] + arr[index - 2];
    }
    return arr.slice(1)
}