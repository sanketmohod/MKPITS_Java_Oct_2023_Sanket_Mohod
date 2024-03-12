// reduce method
// 1. It takes a function as an argument that is called for each element in the array, and it reduces the elements into a single output

let arr = [10, 20, 30, 40, 50];
console.log(arr);

let add = (a, b) => {
  return a + b;
};
let result = arr.reduce(add);
console.log(result);
