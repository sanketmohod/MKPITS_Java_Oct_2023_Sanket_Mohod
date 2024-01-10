#include<stdio.h>
#include<conio.h>
main()
{
    int MWT;   
    // MWT - Marks of written test
    printf("enter the marks of MWT :");
    scanf("%d",&MWT);
    if(MWT >= 50)
    {
     int MI;
     // MI - Marks of interview
     printf("enter the marks of MI :");
    scanf("%d",&MI);
    if(MI >= 50)
    printf("Selected");
    else
    printf("Not Selected");
    }
    else 
    printf("Not Selected");
    return 0;
}