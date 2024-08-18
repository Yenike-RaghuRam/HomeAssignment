function diagonalElements(arr){
    let diag = []
    for(ind in arr){
        diag.push(arr[ind][ind])
    }
    return diag
}

let arr = []
let vals = [1, 2, 3, 4, 4, 3, 2, 1, 7, 8, 9, 6, 6, 5, 4, 3]
let row = 4
let col = 4
let ind = 0
for(let i = 0;i<row;i++){
    arr[i] = []
    for(let j=0;j<col; j++){
        arr[i][j] = vals[ind]
        ind++
    }
}
console.log(diagonalElements(arr))
