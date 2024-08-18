function stringchartwice(str){
    newstr = ""
    for(ind in str){
        newstr += str[ind] + str[ind]
    }
    return newstr
}

console.log(stringchartwice("welcome"))