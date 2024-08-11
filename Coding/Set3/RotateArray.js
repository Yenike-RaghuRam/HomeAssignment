let arr = [1, 3, 5, 7, 9]

rotateArrayRight(arr, 2)
console.log(arr)
rotateArrayLeft(arr, 2)
console.log(arr)

function rotateArrayRight(arr, number_of_times){
    reverseArray(arr, 0, arr.length - 1)
    reverseArray(arr, 0, number_of_times - 1)
    reverseArray(arr, number_of_times, arr.length - 1)
}

function rotateArrayLeft(arr, number_of_times){
    reverseArray(arr, 0, arr.length - 1)
    reverseArray(arr, arr.length - number_of_times, arr.length - 1)
    reverseArray(arr, 0, number_of_times - 1)
}

function reverseArray(arr, startIndex, endIndex){
    while(startIndex < endIndex){
        let temp = arr[startIndex]
        arr[startIndex] = arr[endIndex]
        arr[endIndex] = temp
        startIndex++
        endIndex--
    }
    
}