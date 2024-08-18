let arr = [1,3,4,6,4,2]
let smallest = Number.MAX_SAFE_INTEGER
let second_smallest = Number.MAX_SAFE_INTEGER
for(let val of arr){
    if(val < smallest){
        second_smallest = smallest
        smallest = val
    } else if(val < second_smallest && val != smallest){
        second_smallest = val
    }
}
if(second_smallest == Number.MAX_SAFE_INTEGER){
    console.log("there is no second smallest")
}
else
    console.log(second_smallest)