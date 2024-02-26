// Swapping of two numbers wothout using third variable
let num1 = 45;
let num2 = 18;
// Before Swapping
console.log("Before swapping:");
console.log("value of num1 is : " + num1);
console.log("Value of num2 is : " + num2);
// After Swapping
console.log("\nAfter swapping:\n");
num1 = num1 + num2;
num2 = num1 - num2;
num1 = num1 - num2;
console.log("Value of num1 after swapping is : " + num1);
console.log("Value of num2 after swapping is : " + num2);
