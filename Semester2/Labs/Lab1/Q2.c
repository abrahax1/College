/*      Description: This program uses malloc to function as an array and allocate the numbers the user wants 
        date: 30 Jan 2020
        Author: Abraham Izarra
*/

#include <stdio.h>
#include <stdlib.h>


int main()
{
    
    int N_of_nums, No_of_Bytes = 0;
    int i;
    int *ptr;
    
    
    printf ("Enter the amount of numbers you want to enter \n");
    
    scanf ("%d", & N_of_nums );
    
    No_of_Bytes = N_of_nums * sizeof(int);
    
    ptr = malloc(No_of_Bytes);
    
    if (ptr == NULL)
    {
        printf ("Error to allocate \n");
        
        return 0;
        
    }
    else
    {
        printf ("\nSuccessfull allocation \n");
        
        printf ("\nEnter the numbers you want to have displayed \n");
           
        for (i = 0; i < N_of_nums; i++)
        {
            scanf ("%d", & *(ptr + i) );
            
        }
           
        printf ("\n");
           
        for (i = 0; i < N_of_nums; i++)
        {
            if (i == N_of_nums - 1 )
            {
                printf ("%d", *(ptr + i) );
                
            }
            else
            {
                printf ("%d, ", *(ptr + i) );
                
            }
            
        }
        
        free (ptr);
        
    }
    
    printf ("\n\n");
    
    return 0;
    
}
