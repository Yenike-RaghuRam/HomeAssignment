function removeleadzeroes(str){
    for(ind in str){
        if(str[ind] != '0')
            break;
    }
    return str.slice(ind)
}

console.log(removeleadzeroes("0000012345"))