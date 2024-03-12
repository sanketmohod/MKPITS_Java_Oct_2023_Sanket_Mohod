
// filter method - filters the array with values
// return new array
const arr = [1, 2, 3, '4', null];
console.log(arr.filter((value) => typeof value === "number")); // [1, 2, 3]

// find method - returns first element that matches condition or undefined if none match
let x = arr.find((element) => element > 1); // 2
console.log(x);

