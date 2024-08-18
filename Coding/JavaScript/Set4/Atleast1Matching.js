function atleast1Matching(arr1, arr2){
    let s = new Set()
    for(val of arr2){
        s.add(val)
    }
    for(val of arr1){
        if(s.has(val))
            return true
    }
    return false
}


let arr1 = [1,3,1,4,9,5,2]
let arr2 = [2,1,3,4,10]
console.log(atleast1Matching(arr1, arr2))