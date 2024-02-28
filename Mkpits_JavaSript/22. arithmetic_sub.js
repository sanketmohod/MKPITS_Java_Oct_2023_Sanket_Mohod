// Arithmetic subtract(-) operator
let a = 60;
let b = 45;
let sub = a - b;
console.log("sub of " + a + " and " + b + " is: " + sub);

// Now subtract number to string
let str = "Hello";
let result = str - sub;
console.log(
  "After subtraction " + str + " with " + sub + " the result is : " + result
);

// subtracting number with infinity
let c = Infinity - sub;
console.log("After subtracting with infinity : " + c);

// subtract with NAN
let d = NaN - sub;
console.log("after subtration with NaN :" + d);
