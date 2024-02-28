// bitwose or(|) operator
// The operator returns false only if both the operands are false
// 0 |  1 = 1, 0 | 0 = 0,  1 | 1 = 1,  1 | 0 =  1;

let a = 5; //101
let b = 7; //111
console.log(a | b); // 111 -> 7
let c = 5; //101
let d = 5; // 101
console.log(c | d); // 101 -> 5
