let arr = [1,3,4,6,4,2]

val = first_small_second_small(arr)
console.log(`smallest value is ${val[0]}`)
if(val[1] == Number.MAX_VALUE)
    console.log(`second smallest value is not present`)
else
    console.log(`second smallest value is ${val[1]}`)

function first_small_second_small(arr){
    let smallest = Number.MAX_VALUE
    let second_smallest = Number.MAX_VALUE

    for(val of arr){
        if(val < smallest){
            second_smallest = smallest
            smallest = val
        } else if(val < second_smallest && val != smallest){
            second_smallest = val
        }
    }

    return [smallest, second_smallest]
}

