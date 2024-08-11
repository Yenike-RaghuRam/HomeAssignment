const fs = require('fs');

let vowels = new Set(['a', 'e', 'i', 'o', 'u'])
let count = 0

const data = fs.readFileSync('One.txt',
  { encoding: 'utf8', flag: 'r' });

for(let charc of data){
  if(vowels.has(charc.toLowerCase())){
    count++;
  }
}
console.log(count)
// fs.readFile('One.txt', (err, data) => {
//   if (err) throw err;
 
// //   console.log(data.toString());
//   for(let charc of data.toString()){
//     // console.log(charc)
//     if(vowels.has(charc.toLowerCase()))
//         count++
//   }
//   console.log(count)
// })



