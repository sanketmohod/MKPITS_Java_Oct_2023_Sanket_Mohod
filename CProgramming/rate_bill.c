#include <stdio.h>
#include <conio.h>
main()
{
  int rate;
  float bill;
  printf("enter the rate ;");
  scanf("%d", &rate);
  if (rate < 100)
  {
    bill = rate * 1.00;
    printf("bill is %f", bill);
  }
  else if (rate >= 100 && rate < 200)
  {
    bill = rate * 1.25;
    printf("bill is %f", bill);
  }
  else if (rate > 200 && rate < 300)
  {
    bill = rate * 1.50;
    printf("bill is %f", bill);
  }
  else if (rate > 300 && rate < 400)
  {
    bill = rate * 1.75;
    printf("bill is %f", bill);
  }
  else if (rate >= 400)
  {
    bill = rate * 2.00;
    printf("bill is %f", bill);
  }
  return 0;
}