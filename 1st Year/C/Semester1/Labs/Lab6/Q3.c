 /*      Program Description:  this programs asks for 4 numbers and swaps their places (1st and 2nd)(3rd and 4th)
         Author: Abraham Izarra
         Date: 4 nov 2019
 */

 #include <stdio.h>

#define Array_Length 4

int main()
{
    
    int Numbers [Array_Length];
    
    int num1, num2, num3, num4;
    int i = 0;
    
    
    printf ("enter four numbers \n");
    
    for (i = 0; i < 4; i++)
    {
        scanf ("%d %d %d %d", & num1, & num2, & num3, & num4);
        
        Numbers[0] = num1;
        Numbers[1] = num2;
        Numbers[2] = num3;
        Numbers[3] = num4;
        
        printf ("This is your series: ");
        
        while (i < 4)
        {
            printf ("%d ", Numbers[i]);
            
            i++;
        }
        
        printf ("\n");
        
        
        num1 = Numbers[1];
        num2 = Numbers[0];
        num3 = Numbers[3];
        num4 = Numbers[2];
        
        printf ("This is your series with changed order: %d %d %d %d \n", num1, num2, num3, num4);
        
    }
    
    return 0;
}
