// For in loop
// basicaly we use the for in lopp to iterate the object key values

// show the marks of all peopele in one object

const Marks = {
  karan: 88,
  rohit: 95,
  rihan: 80,
  rahul: 65,
  sahil: 57,
};

for (const key in Marks) {
  //console.log(key);
  //console.log(Marks[key]);
  console.log(key, Marks[key]);
}
