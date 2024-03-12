// enter the string and replace its character

let name = prompt("enter your name.");
console.log("user inpit : " + name);
let character = prompt("enter the character to replace");
let index = prompt("enter the index value to replace.");
let name1 = name.replace(name[index], character);
alert(name1);
console.log("after replacing 4th character : " + name1);
