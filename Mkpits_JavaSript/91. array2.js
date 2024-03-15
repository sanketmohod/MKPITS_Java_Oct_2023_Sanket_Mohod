// prime number program

let i = 1;
let j = 2;

for (i = 1; i < 20; i++) {
  for (j = 2; j < i; j++) {
    if (i % j == 0) {
      break;
    }
    if (i == j) {
      console.log(j);
    }
  }
}
