let arr1= [ 1, 3, 4, 5];
let arr2 = [2, 4, 6, 8];
let arr3 = new Array(arr1.length + arr2.length)

let arr1len = arr1.length
let arr2len = arr2.length
let arr1index = 0
let arr2index = 0
let arr3index = 0

while(arr1index < arr1len && arr2index < arr2len){
    if(arr1[arr1index] < arr2[arr2index]){
        arr3[arr3index] = arr1[arr1index]
        arr1index++
    } else {
        arr3[arr3index] = arr2[arr2index]
        arr2index++
    }
    arr3index++
}

while(arr1index < arr1len){
   
        arr3[arr3index] = arr1[arr1index]
        arr1index++
        arr3index++
   
}

while(arr2index < arr2len){
    arr3[arr3index] = arr2[arr2index]
    arr2index++
    arr3index++
}

console.log(arr3)