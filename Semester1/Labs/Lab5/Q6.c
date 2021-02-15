/*      Program Description: This program displays the sum of the odd numbers from 1 to 99
        Author: Abraham Izarra
        Date: 28 oct 2019
*/

#include <stdio.h>

int main()
{
    int number = 0, sum = 0;
    
    while (number < 99)
    {
        
        number = number + 1;
        
        if (! (number % 2 == 0) )
        {
            sum = number + sum;
        }
        
    }
    
    printf ("%d", sum);
    printf ("\n");
    
    return 0;
}
