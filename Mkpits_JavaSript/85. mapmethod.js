// map method -  it takes a function and applies that function to each element of an array
// return new array
let arr = [1, 2, 3, 4, 5, 6, 7, 8, 9];
// let newArr = arr.map(x => x*2);
let newArr = arr.map((val) => {
  return val * 2;
});
console.log(newArr);
