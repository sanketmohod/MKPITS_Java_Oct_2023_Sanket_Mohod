// arithmetic multiplication(*) operator

let a = 18;
let b = 45;
let mul = a * b;
console.log("multiplication of " + a + " and " + b + " is: " + mul);

// Now multiply number to string
let str = "Hello";
let result = str * mul;
console.log(
  "After multiply " + str + " with " + mul + " the result is : " + result
);

// multiply number with infinity
let c = Infinity * mul;
console.log("After after multiply with infinity : " + c);

// multiply with NAN
let d = NaN * mul;
console.log("after multiply with NaN :" + d);

// assigning number to string after that multipling with numbeer
let num = "10";
let num1 = 5;
let res = num * num1;
console.log(res);
