// generate the random number and compare it to user input number
// if number is greater then message "user input greater number"
// if number is smaller then message "user input smaller number"
// if match then message " numbers are match"

let random = Math.ceil(Math.random() * 10);
console.log("system generated number : " + random);
let userInput = parseInt(prompt("Enter your number"));
console.log("you have entered : " + userInput);

while (userInput > 1) {
  if (userInput > random) {
    alert("userInput is greater.");
    console.log("userInput is greater.");
  } else if (userInput < random) {
    alert("userInput is smaller.");
    console.log("userInput is smaller.");
  } else {
    alert("Numbers are match.");
    console.log("Numbers are match.");
    break;
  }
  userInput = parseInt(prompt("Enter your number again."));
  console.log("you have entered : " + userInput);
}
