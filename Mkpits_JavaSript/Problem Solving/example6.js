// program on marks of students
function StudentMarks() {
  var name = prompt("enter the name");
  console.log(name);
  let s1 = prompt("enter the mark of math");
  console.log(s1);
  let s2 = prompt("enter the marks of physics");
  console.log(s2);
  let s3 = prompt("enter the marks of chemistry");
  console.log(s3);
  var total = parseInt(s1) + parseInt(s2) + parseInt(s3);
  console.log("total marks is : " + total);
  var average = total / 3;
  console.log("average of marks is : " + average);
  if (average >= 60 && s1 >= 60 && s2 >= 60 && s3 >= 60) {
    console.log(name + " pass in first class");
  } else if (average >= 50 && s1 >= 50 && s2 >= 50 && s3 >= 50) {
    console.log(name + " pass in second class");
  } else if (average >= 35 && s1 >= 35 && s2 >= 35 && s3 >= 35) {
    console.log(name + " is pass");
  } else {
    console.log(name + " is failed");
  }
}
