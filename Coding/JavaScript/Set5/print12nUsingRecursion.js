function printoneton(num){
    if(num == 0)
        return
    printoneton(num - 1);
    console.log(num)
}
printoneton(10)