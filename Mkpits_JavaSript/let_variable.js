// initialization of variable
// let is block scoped variables, it only exist within the block in which the variable were declared. it cannot be accessed outside of that block.
// we can also called local variable

let numb = 123;
let name = "karan";
let isPresent = true;
console.log(numb);
console.log(name);
console.log(isPresent);

// try to declare variable with same name
// let name = "sanket";
// console.log(name);
// we can not re-declare the same variable through let keyword/variable.
// we can update the value of same variable.
numb = 456;
console.log(numb); // it will give us updated value
