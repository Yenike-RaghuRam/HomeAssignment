function naturalsum(num){
    if(num == 0)
        return 0
    return num + naturalsum(num - 1)
}
console.log(naturalsum(5))