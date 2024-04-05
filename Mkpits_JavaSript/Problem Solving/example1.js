// simple interest
function SimpleInterest() {
  var Interest;
  const amount = 200,
    rate = 300,
    time = 4;
  var mul = amount * rate * time;
  console.log(mul);
  Interest = mul / 100;
  console.log(Interest);
  document.write("Simple interest is : "+ Interest);
}
