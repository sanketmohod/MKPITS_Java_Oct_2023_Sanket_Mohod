// Create and array of numbers and take input from the user to add numbers to this array.
let arr = [];
let size = prompt("enter the size of array.");
for (let i = 0; i < size; i++) {
  arrelement = prompt(`emter the ${i + 1} array element`);
  arr.push(arrelement);
}
console.log(arr);
