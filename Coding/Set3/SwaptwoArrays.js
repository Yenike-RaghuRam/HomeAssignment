let arr1 = [1,2,3,4,5]
let arr2 = [6,7,8,9,10]

swaparray(arr1, arr2)
console.log(arr1)
console.log(arr2)

function swaparray(arr1, arr2){
    if(arr1.length != arr2.length)
    {
        console.log("arrays cannot be swapped")
        return
    }
    for(let i=0;i<arr1.length;i++){
        let temp = arr1[i]
        arr1[i] = arr2[i]
        arr2[i] = temp
    }
}