function rearrangemaxmin(arr){
    let minindex = 0
    let maxindex = arr.length - 1
    let maxelem = arr[arr.length - 1] + 1

    for(let i = 0;i<arr.length;i++){
        if(i%2 == 0){
            arr[i] += (arr[maxindex]%maxelem) * maxelem
            maxindex--
        } else {
            arr[i] += (arr[minindex]%maxelem) * maxelem
            minindex++
        }
    }

    for(let i=0;i<arr.length;i++){
        arr[i] = Math.floor(arr[i]/maxelem)
    }

    console.log(arr)

}

rearrangemaxmin([1,2,3,4,5,6])