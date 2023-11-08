#include<stdio.h>
#include<conio.h>
main()
{
    char str[10],str1[10],str2[10];
    int mob_numb,pass,cPass,value;
    printf("enter the Name :");
    scanf("%s",&str[10]);
    printf("enter the Email :");
    scanf("%s",&str1[10]);
    printf("enter the Mobile No. :");
    scanf("%d",&mob_numb);
    printf("enter the user_id :");
    scanf("%s",&str2[10]);
    if(strcmp(str2[10], "mkpits")){
        printf("user_id is validate");
    }else{
        printf("user_id is not validate");
    }
    printf("enter the password :");
    scanf("%d",&pass);
    printf("enter the confirm password :");
    scanf("%d",&cPass);
    if(pass == cPass){
        printf("password is valid");
    }
    else{
        printf("not defined");
    }
    return 0;
}