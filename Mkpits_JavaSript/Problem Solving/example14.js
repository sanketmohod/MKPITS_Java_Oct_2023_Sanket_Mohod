function linearSearch() {
  // const arr = new arr[10];
  const arr = [1, 2, 3, 4, 5, 6, 7, 8, 9];
  for (var i = 0; i < arr.length; i++) {
    document.write(" " + arr[i]);
    console.log(arr[i]);
  }
  let key = prompt("enter the key");
  for (var i = 0; i < arr.length; i++) {
    if (arr[i] == key) {
      document.write("the number is at position : " + i);
      console.log("the number is at position : " + i);
    }
  }
}
