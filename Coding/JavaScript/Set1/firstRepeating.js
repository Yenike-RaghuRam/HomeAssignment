function firstRepeating(num){
    let set1 = new Set()
    for(let val of num){
        if(set1.has(val))
            return val
        set1.add(val)
    } 
}

let num = [1, 2, 3, 3, 3, 6, 6]
let result = firstRepeating(num)
if(typeof result === 'undefined')
    console.log("there is no repeating number")
else
    console.log(`${result} is repeating number`)
