/*      Program Description:  this programs asks for 5 characters and displays them
        Author: Abraham Izarra
        Date: 4 nov 2019
*/

#include <stdio.h>
#define Array_Length 5

int main()
{
    
    char Letters [Array_Length];
    int i = 0;
    int d;
    int e;
    int f =0;

    for (e=0; e<5; e++) {
        printf ("enter characters \n");

        scanf("%1s",& Letters[f]);
        
        f++;
        
    }
    
    printf("Start\n");
    for (d = 0; d < 5; d++)
    {
        printf ("%c\n", Letters[i]);
        i++;
    }
    
    printf ("\n");
    
    return 0;
}
