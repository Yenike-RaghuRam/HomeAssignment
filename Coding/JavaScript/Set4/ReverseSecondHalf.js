function reversesecondhafl(str)
{
    let n = str.length
    newstr = ""
    if(n%2 == 0){
        newstr = str.slice(0, Math.floor(n/2))
        for(let i = str.length -1 ;i >= Math.floor(n/2); i--){
            newstr += str[i]
        }
    } else {
        newstr = str.slice(0, Math.floor(n/2) + 1)
        for(let i = str.length -1 ;i >= Math.floor(n/2) + 1; i--){
            newstr += str[i]
        }
    }
    return newstr
}

console.log(reversesecondhafl("12345"))
console.log(reversesecondhafl("1234"))