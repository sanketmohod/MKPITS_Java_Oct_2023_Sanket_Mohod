#include<stdio.h>
#include<conio.h>
 main()
 {
    int a,b,c,total;
    printf("enter the three angles :");
    scanf("%d%d%d",&a,&b,&c);
    if(a == b && a == c && b == c){
        printf("equilateral triengle");
    }
    else if(a == b || a == c || b == c)
    {
        printf("isosceles triengle");
    }
    else
    {
        printf("scalene triengle");
    }
    return 0;
}