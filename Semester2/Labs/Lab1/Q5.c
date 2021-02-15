/*      Description: this program uses malloc to allocate 5 numbers and then calculate their average
        date: 30 Jan 2020
        Author: Abraham Izarra
*/

#include <stdio.h>
#include <stdlib.h>

#define NUMBER 5

int main()
{
    
    float Numbers, Average, Sum = 0, N_of_Bytes;
    float *ptr1 = & Numbers, *ptr2 = & Average;
    int i;
    
    N_of_Bytes = NUMBER * sizeof(float);
    
    ptr1 = malloc(N_of_Bytes);
    
    if (ptr1 == NULL)
    {
        printf ("Failed to allocate \n");
        
    }
    else
    {
        printf ("Successfull allocation \n");
        
        printf ("Enter the numbers you want to enter \n");
        
        for (i = 0; i < NUMBER; i++)
        {
            scanf ("%f", & *(ptr1 + i) );
            
            Sum = Sum + *(ptr1 + i);
            
        }
        
        Average = Sum / 5;
        
        printf ("\nYour average is %.2f \n\n", *(ptr2) );
        
        free (ptr1);
    }
    
    
    return 0;
}
