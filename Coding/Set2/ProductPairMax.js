let arr = [-1, -3, -4, 2, 0, -5];
console.log(productpair_max(arr))

function productpair_max(arr){

    let maxi = Number.MIN_SAFE_INTEGER
    let second_maxi = Number.MIN_SAFE_INTEGER

    for(val of arr){
        if(val > maxi){
            second_maxi = maxi
            maxi = val
        } else if(val > second_maxi && val != maxi){
            second_maxi = val
        }
    }

    let neg_maxi = Number.MIN_SAFE_INTEGER
    let neg_second_maxi = Number.MIN_SAFE_INTEGER

    for(val of arr){
        if(Math.abs(val) > maxi){
            neg_second_maxi = neg_maxi
            neg_maxi = Math.abs(val)
        } else if(Math.abs(val) > second_maxi && Math.abs(val)!=maxi){
            second_maxi = Math.abs(val)
        }
    }

    return Math.max(maxi * second_maxi, neg_maxi * neg_second_maxi)

}