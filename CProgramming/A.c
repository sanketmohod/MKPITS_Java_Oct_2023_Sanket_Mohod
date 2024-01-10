#include<stdio.h>
#include<conio.h>

main()
{
    char C;
	int total,a,b;
    printf("Enter your choice :");
	scanf("%c",&C);
	printf("Enter 1st No. :- ");
	scanf("%d",&a);
	printf("Enter 2nd No. :- ");
	scanf("%d",&b);
	switch(C)
	{
		case 'A':
			total=a+b;
			break;
		case 'B':
			total=a-b;
			break;
		case 'M':
			total=a*b;
			break;
		case 'D':
			total=a/b;
			break;
			
            default: printf("Enter valid choice....\n");	
	}
    printf("Your answer is  %d",total);
	return 0;
}