function anagramsgrouping(arr){
    let mp = new Map()
    for(str of arr){
        let asciival = 0
        for(v of str){
            p = v.charCodeAt(0)
            asciival += v.charCodeAt(0)
        }
        if(mp.has(asciival)){
            temp = mp.get(asciival)
            temp.push(str)
            mp.set(asciival, temp)
        } else {
            mp.set(asciival, [str])
        }
    }
    return mp.values()
}

console.log(anagramsgrouping(["eat","tea","tan","ate","nat","bat"]))