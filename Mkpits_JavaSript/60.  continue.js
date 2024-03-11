// continue statements

// 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16,................
// print only even number series which is start from 2, 4, 6,.....................

for (let i = 1; i <= 100; i++) {
  if (i % 2 != 0) {
    continue;
  }
  console.log(i);
}
