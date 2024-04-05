// square of even numbers series
function Series() {
  var n = 10,
    a = 2;
  for (var i = 2; i <= n * 2; i = i + 2) {
    var sq = a * i;
    console.log(+sq);
    document.write("<br>" + sq);
    a = a + 2;
  }
}
