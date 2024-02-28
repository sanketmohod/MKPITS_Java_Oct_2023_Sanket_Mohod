// delete unary perator
// This operator is more specifically used to delete JavaScript object properties.

let student = {
  name: "karan",
  age: 23,
  city: "Amravati",
  mobile: 459545456,
  state: "maharashtra",
};

console.log(student);
// adding property
student.email = "karn@gmail.com";
console.log(student);

// now delete property
delete student.city;
console.log(student);
