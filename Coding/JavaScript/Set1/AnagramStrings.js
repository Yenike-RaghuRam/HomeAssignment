let str1 = "abc"
let str2 = "bac"

if(str1.length == str2.length){
    let str1asciicount = 0
    let str2asciicount = 0
    for(let index in str1){
        str1asciicount += str1.charCodeAt(index)
    }
    for(let index in str2){
        str2asciicount += str2.charCodeAt(index)
    }
    if(str1asciicount == str2asciicount)
        console.log("given strings are anagrams")
    else
        console.log("given strings are not anagrams")

} else {
    console.log("Given strings are not anagrams")
}