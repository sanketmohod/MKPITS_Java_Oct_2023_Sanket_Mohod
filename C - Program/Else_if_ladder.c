#include<stdio.h>
#include<conio.h>
main()
{
    int M;                       // dispaly the grads of marks
    printf("enter the marks :");
    scanf("%d",&M);
    if*(M < 50 )
    {
        printf("grad E");
    }
    else if(M >= 50 && M < 60)
    {
        printf("grad D");
    }
    else if(M >= 60 && M < 70)
    {
        printf("grad C");
    }
    else if(M >= 70 && M < 80)
    {
        printf("grad B");
    }
    else if(M >= 80)
    {
        printf("grad D");
    }
    return 0:
}