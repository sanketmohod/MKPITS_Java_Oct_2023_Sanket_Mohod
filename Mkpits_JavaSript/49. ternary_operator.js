// terbary operator
// It is like the short form of the if-else condition.

let marks = 45;
let result = marks > 35 ? "pass" : "fail";
console.log(result);

let student_result =
  marks < 35
    ? "fail"
    : marks < 60
    ? "Grad C"
    : marks < 75
    ? "Grade B"
    : marks < 90
    ? "Grade A"
    : "Excellent";
console.log(student_result);
