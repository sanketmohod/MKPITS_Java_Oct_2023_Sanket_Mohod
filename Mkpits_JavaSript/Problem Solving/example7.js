// print the serues 1, 4, 9, 25, 36, 49, 81, .........
function Series() {
  for (var i = 1; i <= 20; i++) {
    if (i % 4 != 0) {
      var sq = parseInt(i) * parseInt(i);
      console.log(sq);
      document.write(" " + sq);
    }
  }
}
