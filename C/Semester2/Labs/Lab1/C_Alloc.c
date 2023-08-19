/*      Description: this program uses Calloc()
        date: 30 Jan 2020
        Author: Abraham Izarra
*/

#include <stdio.h>
#include <stdlib.h>

int main ()
{
    
    int *ptr;
    int N_of_nums, i;
    
    printf ("Enter the number of numbers \n");
    
    scanf ("%d", & N_of_nums);
    
    ptr = calloc(N_of_nums, sizeof(1) );
    
    if (ptr == NULL)
    {
        printf ("Failed to allocate memory \n");
        
    }
    else
    {
        for (i = 0; i < N_of_nums; i++)
        {
            scanf ("%d", & *(ptr + i) );
            
        }
        
        for (i = 0; i < N_of_nums; i++)
        {
            printf ("%d \n", *(ptr + i) );
            
        }
        
        free(ptr);
        
    }
    
    return 0;
    
}
