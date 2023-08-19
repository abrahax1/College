/*      Program Description: this program uses the while loop to display the numbers from 1 to 10 in descending order
        Author: Abraham Izarra
        Date: 28 oct 2019
*/

#include <stdio.h>

int main()
{
    
    int i = 10;
    
    while (i > 1)
    {
        printf ("%d, ", i);
        
        i = i - 1;
        
        if (i == 1)
        {
            printf ("1 \n");
        }
    }
    
    return 0;
}

