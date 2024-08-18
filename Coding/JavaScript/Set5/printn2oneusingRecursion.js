function printntoone(num){
    if(num == 0)
        return
    console.log(num)
    printntoone(num - 1)
}
printntoone(10)
