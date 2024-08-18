function helper(num_position, counter){
    if(counter > num_position)
        return true
    if(num_position % counter == 0)
        return false
    return helper(num_position - (Math.floor(num_position/counter)), counter + 1)
}

function luckNumber(num){
    return helper(num, 2)
}
console.log(luckNumber(7))
console.log(luckNumber(9))
console.log(luckNumber(13))