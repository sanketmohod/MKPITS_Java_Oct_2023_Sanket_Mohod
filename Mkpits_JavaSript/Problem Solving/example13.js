function Series() {
  var a = 1;
  for (var i = 0; i <= 20; i++) {
    var sr = parseInt(i) * parseInt(i) + parseInt(a);

    document.write(" " + sr);
    a = a + 1;
  }
}
