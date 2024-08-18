function frequencyHighSmaller(arr,x,y){
    let freqx = 0
    let freqy = 0
    for(val of arr){
        if(val == x)
            freqx++
        else if(val == y)
            freqy++
    }
    if(freqx > freqy)
        return x
    else if(freqy > freqx)
        return y
    else
        return Math.min(x, y)
}

console.log(frequencyHighSmaller([1,1,2,2,3,3,4,4,4,4,5], 4, 5))