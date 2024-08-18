console.log(removeConsecutiveDuplicates("aabccba"))
function removeConsecutiveDuplicates(str){
    let repeatingchar_index = 0
    let new_str = ""
    for(let index=1; index < str.length ; index++){
        if(str[index] !== str[repeatingchar_index]){
            new_str += str[repeatingchar_index]
            repeatingchar_index = index
        }
    }
    new_str += str[repeatingchar_index]
    return new_str
}