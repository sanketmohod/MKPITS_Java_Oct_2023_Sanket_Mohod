// use reduce to calculate the factorial of given number from an array of first nth natural number(n be the natural number whose factorial should be calculated)

let arr = [1, 2, 3, 4, 5];

let factor = arr.reduce((acc, curr) => {
  return acc * curr;
});
console.log(factor);
