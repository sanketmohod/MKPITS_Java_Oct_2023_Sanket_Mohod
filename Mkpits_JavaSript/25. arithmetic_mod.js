// Arithmetic division(/) operator
let a = 55;
let b = 15;
let mod = a % b;
console.log("modulus of " + a + " and " + b + " is: " + mod);

// Now modulus number to string
let str = "Hello";
let result = str % mod;
console.log(
  "After modulus " + str + " with " + mod + " the result is : " + result
);

// modulus with infinity
let c = Infinity % mod;
console.log("After modulus with infinity : " + c);

// modulus with NAN
let d = NaN % mod;
console.log("after modulus with NaN :" + d);

// assighning number to string after that modulus with number
let strr = "102";
let num = 3;
let res = str % mod;
console.log(res);
