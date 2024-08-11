let arr = [1,3,4,6,4,2,6]
let sum = 8
let pair = []
let set1 = new Set()
for(let num of arr){
    let remaining_sum = sum - num
    if(set1.has(remaining_sum)){
        pair.push([num, remaining_sum])
    }
    set1.add(num)
}
console.log(pair)