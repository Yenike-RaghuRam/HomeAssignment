let arr = [1,3,4,6,4]
let largest = Number.MIN_SAFE_INTEGER
let second_largest = Number.MIN_SAFE_INTEGER
for(let num of arr){
    if(num > largest){
        second_largest = largest
        largest = num
    } else if(num > second_largest && num != largest){
        second_largest = num
    }
}
if(second_largest === Number.MIN_SAFE_INTEGER)
    console.log("there is no second highest")
else
    console.log(second_largest)