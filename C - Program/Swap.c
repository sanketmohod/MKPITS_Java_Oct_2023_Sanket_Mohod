#include<stdio.h>
#include<conio.h>
main()
{
    int a,b,c;
    printf("enter the values of a & b numbers :");
    scanf("%d%d",&a,&b);
    c = a;    //swapping variables by using third variables 'c':
    a = b;
    b = c;
    printf("value of a is %d\n",a);
    printf("value of b is %d",b);
    return 0;
}

            // OR
             
// #include<stdio.h>
// #include<conio.h>
// main()
// {
//     int a,b;
//     printf("enter the values of a & b numbers :");
//     scanf("%d%d",&a,&b);
//     a = a + b;
//     b = a - b;  //swapping variables by withought using third variables:
//     a = a - b;
//     printf("value of a is %d\n",a);
//     printf("value of b is %d",b);
//     return 0;
// }


