/*     Program Description: This program reads 3 integers into an array and copies this numbers into a different array
       Author: Abraham Izarra
       Date: 3 Dec 2019
*/

#include <stdio.h>
#define LENGTH 3

int main()
{
    
    int array1[LENGTH], array2[LENGTH], i;
    
    printf ("Enter 3 numbers \n");
    
    for (i = 0; i < LENGTH; i++)
    {
        scanf ("%d", & *(array1 + i) );
        
        *(array2 + i) = *(array1 + i);
        
    }
    
    printf ("\n");
    
    for (i = 0; i < LENGTH; i++)
    {
        if (i == 2)
        {
            printf ("%d, %d", *(array1 + i), *(array2 + i) );
            
        }
        else
        {
            printf ("%d, ", *(array1 + i) );
            printf ("%d, ", *(array2 + i) );
            
        }
        
    }
    
    printf ("\n\n");
    
    
    return 0;
    
}
