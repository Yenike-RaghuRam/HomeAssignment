let arr = [6, 5, 2, 3, 5, 2, 2, 1]

console.log(countpairequal(arr))

function countpairequal(arr){
    let count_occurrence_map = new Map()
    for(val of arr){
        if(count_occurrence_map.has(val)){
            count_occurrence_map.set(val, count_occurrence_map.get(val) + 1)
        } else {
            count_occurrence_map.set(val, 1)
        }
    }
    let count = 0
    for(val of count_occurrence_map.values()){
        count += Math.floor(val/2)
    }

    return count
}