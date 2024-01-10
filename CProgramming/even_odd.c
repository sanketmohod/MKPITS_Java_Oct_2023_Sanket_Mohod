#include<stdio.h>
#include<conio.h>
main()
{
    int n;
    printf("enter the number :");
    scanf("%d",&n);
    if(n % 2 == 0)
    printf("even");
    else
    printf("odd");
    return 0;
}