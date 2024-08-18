function printValuesBasedOnNumber(str){

    let stck = []
    let result = ""
    for(val of str){
        if(val != ']'){
            stck.push(val)
        } else {
            let str = result
            while(stck[stck.length - 1] != '['){
                str = stck.pop() + str
            }
            stck.pop()
            let times = stck.pop()
            result = ""
            while(times != 0){
                result += str
                times--
            }
        }
    }
    return result
}

console.log(printValuesBasedOnNumber("3[b2[ca]]"))
