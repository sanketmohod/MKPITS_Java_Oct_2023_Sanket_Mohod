// fibonacci series
function Series() {
  let a = 1,
    b = 1;
  document.write(a + " " + b);
  console.log(a);
  console.log(b);
  for (var i = 1; i <= 10; i++) {
    var sum = parseInt(a) + parseInt(b);
    console.log(sum);
    document.write(" " + sum);
    a = b;
    b = sum;
  }
}
