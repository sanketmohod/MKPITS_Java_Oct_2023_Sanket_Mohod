function Series() {
  var sum1 = 1;
  var sum2 = 2;

  console.log(sum1);

  console.log(sum2);

  document.write(sum1 + " " + sum2);
  for (var i = 1; i <= 10; i++) {
    if (i % 2 != 0) {
      sum1 = sum1 + 3;
      console.log(sum1);
      document.write(" " + sum1);
    } else {
      sum2 = sum2 + 4;
      console.log(sum2);
      document.write(" " + sum2);
    }
  }
}
