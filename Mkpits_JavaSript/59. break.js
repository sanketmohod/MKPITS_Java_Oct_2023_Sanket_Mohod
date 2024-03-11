// Break
// 1, 4, 9, 25, 36, 49, 81, 100,..................
let squre;
for (let i = 1; i <= 100; i++) {
  squre = i * i;

  if (i % 4 == 0) {
    break;
  }
  console.log(squre);
}
