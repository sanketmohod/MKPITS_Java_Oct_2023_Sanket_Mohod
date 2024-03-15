// fibonacci series
// 1, 1, 2, 3, 5, 8, 13,..............

let num1 = 1;
let num2 = 1;
console.log(num1);
console.log(num2);
  let num3 = num1 + num2;
for (let i = 1; i < 10; i++) {

  console.log(num3);
  num2 = num3;
  num1 = num2;
 num3 = num1 + num2;
}
