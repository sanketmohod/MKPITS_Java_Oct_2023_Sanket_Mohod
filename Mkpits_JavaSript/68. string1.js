//  string problem
// extract the amount out of the string - "Please give Rs 1000"

let str = "Please give Rs 1000";
let index = str.indexOf("Rs");
let str1 = str.substring(index + 3);
console.log(str1);
