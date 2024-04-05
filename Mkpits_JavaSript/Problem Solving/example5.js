function Series() {
  let s = 1;
  document.write(s);
  console.log(s);
  for (var i = 1; i <= 10; i++) {
    s = parseInt(s) + parseInt(i) * parseInt(i);
    document.write(" " + s);
    console.log(s);
  }
}
