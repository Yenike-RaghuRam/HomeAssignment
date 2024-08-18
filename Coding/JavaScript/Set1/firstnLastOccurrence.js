function first_occurrence(arr, checkval){
    if(arr.length == 0)
        return -1
    let low  = 0
    let high = arr.length - 1
    let result = -1
    while(low <= high){
        let mid = Math.floor(low + (high - low)/2)
        if(arr[mid] == checkval)
        {
            result = mid
            high = mid - 1
        }
        else if(arr[mid] > checkval){
            high = mid - 1
        } else {
            low = mid + 1
        }
    }
    return result
}

function second_occurrence(arr, checkval){
    if(arr.length == 0)
        return -1
    let low  = 0
    let high = arr.length - 1
    let result = -1
    while(low <= high){
        let mid = Math.floor(low + (high - low)/2)
        if(arr[mid] == checkval)
        {
            result = mid
            low = mid + 1
        }
        else if(arr[mid] > checkval){
            high = mid - 1
        } else {
            low = mid + 1
        }
    }
    return result
}

let arr = [1, 3, 5, 5, 5, 5, 67, 123, 125]
console.log(first_occurrence(arr, 5))
console.log(second_occurrence(arr, 5))
console.log(first_occurrence(arr, 1))
console.log(second_occurrence(arr, 1))
console.log(first_occurrence(arr, 123))
console.log(second_occurrence(arr, 123))