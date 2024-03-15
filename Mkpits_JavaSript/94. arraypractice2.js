// keep adding numbers to the array until 0 is added to the array

let arr = [];
let size = prompt("enter the size of array.");
for (let i = 0; i < size; i++) {
  arrelement = prompt(`emter the ${i + 1} array element`);
  if (arrelement == 0) {
    break;
  } else {
    arr.push(arrelement);
  }
}
console.log(arr);
