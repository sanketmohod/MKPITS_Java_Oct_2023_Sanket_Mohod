//arimehemetic add operator(+)

let a = 18;
let b = 45;
let sum = a + b;
console.log("sum of " + a + " and " + b + " is: " + sum);

// Now adding number to string
let str = "Hello";
let result = str + sum;
console.log(
  "After adding " + str + " with " + sum + " the result is : " + result
);

// adding number with infinity
let c = Infinity + sum;
console.log("After adding with infinity : "+c);

// adding with NAN
let d= NaN + sum;
console.log("after Adding with NaN :" +d);