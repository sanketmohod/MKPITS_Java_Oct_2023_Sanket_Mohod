#include<stdio.h>
#include<conio.h>
main()
{
   int a = 6,b = 5,result;
   char C;
   printf("enter the cherecter :");
   scanf("%c",&C);
   switch(C){
    case 'A':
    result = a + b;
    break;
    case 'B':
    result = a - b;
    break;
    case 'M':
    result = a * b;
    break;
    case 'D':
    result = a / b;
    break;
    case 'N':
    result = a % b;
    break;
    default : printf("plz check the choice");
   }
   printf("the result is %d",result);
   return 0;
}