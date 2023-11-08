#include <stdio.h>
#include <conio.h>
main()
{
    int MWT = 40, MI = 60;
    // MWT - Marks of written test, MI - Marks of interview
    if (MWT >= 50)
    {
        if (MI >= 50)
        {
            printf("Selected");
        }
        else
        {
            printf("Not Selected");
        }
    }
    else{
        printf("Not Selected");
    }
    return 0;
}

// OR

// #include<stdio.h>
// #include<conio.h>
//  main()
//  {
//     int MWT = 60,MI = 40;
//     // MWT - Marks of written test, MI - Marks of interview
//     if(MWT >= 50)
//     if(MI >= 50)
//     printf("Selected");
//     else
//     printf("Not Selected");
//     return 0;
// }