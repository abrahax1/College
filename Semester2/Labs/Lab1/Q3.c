/*      Description: this program replaces the blank spaces with "_" by using a pointer
        date: 30 Jan 2020
        Author: Abraham Izarra
*/

#include <stdio.h>
#define ARRAY 7

int main()
{
    
    char array[ARRAY] = {'a', ' ', 'b', ' ', 'c', ' ', 'd'};
    char *ptr = array;
    int i;
    
    
    for (i = 0; i < ARRAY; i++)
    {
        if (array[i] == ' ')
        {
            printf ("_");
            
        }
        else
        {
            printf ("%c", *(ptr + i) );
            
        }
        
    }
    
    printf ("\n\n");
    
    return 0;
    
    
}
