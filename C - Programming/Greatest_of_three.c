#include<stdio.h>
#include<conio.h>
main()
{
    int a,b,c;
    printf("enter the three numbers :");
    scanf("%d%d%d",&a,&b,&c);
    if(a > b && a > c)
    {
        printf("%d is greatest number",a);
    }
    else if(b > a && b > c)
    {
        printf("%d is greatest number",b);
    }
    else
    printf("%d is greatest number",c);
    return 0;
}