function Series() {
  let a = 1,
    b = 4,
    c = 7;
  document.write(a + " " + b + " " + c);
  console.log(a);
  console.log(b);
  console.log(c);
  for (var i = 1; i <= 10; i++) {
    var sum = parseInt(a) + parseInt(b) + parseInt(c);
    console.log(sum);
    document.write(" " + sum);
    a = b;
    b = c;
    c = sum;
  }
}
