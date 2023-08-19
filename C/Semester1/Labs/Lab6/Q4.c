/*      Program Description:  this programs asks for 4 numbers and swaps their places (1st and 2nd)(3rd and 4th)
        Author: Abraham Izarra
        Date: 4 nov 2019
*/

#include <stdio.h>

#define Array_Length 5

int main()
{
    
    int Array1 [Array_Length], Array2 [Array_Length];
    int i = 0, j = 0;
    int counter = 0;
    
    printf ("enter 5 numbers \n");
    
    for (i = 0; i < Array_Length; i++)
    {
        scanf ("%d", & Array1[i]);
        
    }
    
    printf ("\nYour backward series is: ");
    
    for (j = 4; j > -1; j--)
    {
        Array2[i] = Array1[j];
         
        if (counter > 3)
        {
            printf ("%d ", Array2[i]);
            
            counter++;
            
        }
        else
        {
            printf ("%d, ", Array2[i]);
            
            counter++;
            
        }
        
    }
    printf ("\n\n");
    
    
    return 0;
    
}
