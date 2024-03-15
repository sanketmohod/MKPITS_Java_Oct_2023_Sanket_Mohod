// filter for numbers divisible 10 from a given array

let arr = [];
let size = prompt("enter the size of array.");
for (let i = 0; i < size; i++) {
  arrelement = prompt(`emter the ${i + 1} array element`);
  arr.push(arrelement);
}
console.log(arr);

console.log("Numbers divisible by ten : ");

let DivisibleByTen = arr.filter((num) => num % 10 == 0);
console.log(DivisibleByTen);
