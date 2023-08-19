/*      Description: this program uses Malloc()
        date: 30 Jan 2020
        Author: Abraham Izarra
*/

#include <stdio.h>
#include <stdlib.h>

int main()
{
    
    int *ptr;
    int number_of_nums;
    int number_of_bytes;
    int i;
    
    printf ("Enter the number of numbers \n");
    
    scanf ("%d", & number_of_nums);
    
    //calculate the number of bytes required for the memory block
    
    number_of_bytes = number_of_nums * sizeof(1);
    
    //allocate memory required
    
    ptr = malloc(number_of_bytes);
    
    //check if memory allocated successfully
    
    if (ptr == NULL)
    {
        printf ("Memory failed to allocate \n");
        
    }
    else
    {
    //enter data into memory block
    
        for (i = 0; i < number_of_nums; i++)
        {
            scanf ("%d", & *(ptr + i) );
    
        }
        
        //display contents of memory block
        
        for (i = 0; i < number_of_nums; i++)
        {
            printf ("%d \n", *(ptr + i) );
            
        }
        
        //release memory block
        
        free(ptr);
        
    } //end else
    
    
    return 0;
    
} //end main
