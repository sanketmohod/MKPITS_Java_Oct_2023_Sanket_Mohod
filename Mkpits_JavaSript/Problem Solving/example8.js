function Series() {
  var sign = 1;
  for (var i = 1; i <= 10; i++) {
    if (i % 4 != 0) {
      var sq = parseInt(i) * parseInt(i) * parseInt(sign);
      console.log(sq);
      document.write(" " + sq);
      sign = sign * -1;
      // console.log(sign);
      // document.write(" "+sign);
    }
  }
}
