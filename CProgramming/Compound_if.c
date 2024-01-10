#include<stdio.h>
#include<conio.h>
main()
{
    int P,C,M;
    printf("enter the marks of P & C & M :");
    scanf("%d%d%d",&P,&C,&M);
    float avg;
    avg = (P + C + M)/3;
    if((P>=50 && C>=50 && M>=50) || (avg>=60))
    printf("pass");
    else 
    printf("fail");
    return 0;
}