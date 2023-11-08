#include<stdio.h>
#include<conio.h>
 main()
 {
    int a,b,c,total;
    printf("enter the three angles :");
    scanf("%d%d%d",&a,&b,&c);
    total = a + b + c;
    printf("total is %d\n",total);
    if(total == 180){
        printf("all angles form a triengle");
    }else
    {
        printf("all angles is not form a triengle");
    }
    return 0;
}