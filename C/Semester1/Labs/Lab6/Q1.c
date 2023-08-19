/*      Program Description: array reading 5 numbers and copies the content of the array into the another array
        Author: Abraham Izarra
        Date: 4 nov 2019
*/

#include <stdio.h>

#define ARRAY_LENGHT 5

int main()
{
    
    int array [ARRAY_LENGHT], array_2 [ARRAY_LENGHT], i = 0;
    
    printf ("enter 5 numbers \n");
    
    for (i = 0; i < ARRAY_LENGHT; i++)
    {
        scanf ("%d", &array[i]);
        
        array_2[i] = array[i];
        
        printf ("Array 2 is %d \n", array_2[i]);
    }
    
    return 0;
}
