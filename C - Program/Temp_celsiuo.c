#include<stdio.h>
#include<conio.h>
main()
{
    int fehrenheit;
    float temp;
    printf("enter the temp in fehreheit :");
    scanf("%d",&fehrenheit);
    temp = (fehrenheit - 32) * 5/9;
    printf("temp in celsius is %f",temp);
    return 0;
}
