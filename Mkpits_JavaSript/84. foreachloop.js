// for aeach loop - use to find the values, index and array

let arr = [101, 202, 303, 404, 505, 606];

arr.forEach((value) => {
  console.log(value);
});

arr.forEach((value, index) => {
  console.log(index);
});

arr.forEach((value, index, array) => {
  console.log(array);
});
