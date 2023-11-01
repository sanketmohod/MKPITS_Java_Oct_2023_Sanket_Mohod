#include<stdio.h>
#include<conio.h>
main()
{
    char c;
    printf("enter the character : ");
    scanf("%c",&c);
    if(c>=65 && c<=90)
    printf("Upper letter");
    else if(c>=97 && c<=122)
    printf("Lower letter");
    else if(c>=45 && c<=57)
    printf("Numeric");
    else 
    printf("Special symbol");
    return 0; 
}