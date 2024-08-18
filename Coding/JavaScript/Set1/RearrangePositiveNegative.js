function rearrangepvenve(arr){
    let pindex = 0
    let nindex = arr.length - 1
    // Two Pointers from first and last first-> +ve index , last -ve index
    while(pindex < nindex){
        while(pindex < arr.length){
            if(arr[pindex] < 0) // index value not correct its -ve
                break
            pindex += 2 //increment by 2
        }
        while(nindex >= 0){
            if(arr[nindex] > 0)  //index value not correct its +ve
                break
            nindex -= 2 //decrement by 2
        }
        if(pindex<=arr.length && nindex >= 0){ 
            let temp = arr[pindex]   //swapping pindex and nindex so that values are in correct positions
            arr[pindex] = arr[nindex]
            arr[nindex] = temp
        }
    }
}

function preserve_order(arr){
    if(arr.length <= 1)
    {
        console.log(arr)
        return arr
    }
    let result = new Array(arr.length)
    let p_index = 0
    let n_index = 1

    for(let index=0; index<arr.length; index++){
        if(arr[index] > 0){
            result[p_index] = arr[index]
            p_index += 2
        } else {
            result[n_index] = arr[index]
            n_index += 2
        }
    }
    console.log(result)
}

// let arr = [1,2,-4,6,-3,-2]
// let arr = [1,-3,-4,6,2,-2]
let arr = [-1,1]

// rearrangepvenve(arr)
preserve_order(arr)
// console.log(arr)