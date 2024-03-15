// create an array of squre of given number

let arr = [];

let size = prompt(`enter the size os array.`);
for (let i = 0; i < size; i++) {
  let arrelement = prompt(`Enter element ${i + 1}`);
  arr.push(arrelement);
}
console.log(arr);
console.log("square array is : ");
let squrearray = arr.map((num) => num * num);
console.log(squrearray);
