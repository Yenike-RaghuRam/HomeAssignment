function leaders(arr){
    let leads = []
    let curr_leader = arr[arr.length - 1];
    leads.push(curr_leader)
    for(let i = arr.length - 2; i>=0 ;i--){
        if(arr[i] > curr_leader){
            curr_leader = arr[i]
            leads.unshift(curr_leader)
        }
    }
    console.log(leads)
}
console.log(leaders([16,17,4,3,5,2]))