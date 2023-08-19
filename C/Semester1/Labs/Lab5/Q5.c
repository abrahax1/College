/*      Program Description: This program displays all even numbers from 1 to 100
        Author: Abraham Izarra
        Date: 28 oct 2019
*/

#include <stdio.h>

int main()
{
    int num = 1;
    
    while (num < 100)
    {
        if (num % 2 == 0)
        {
            printf ("%d, ", num);
            
        }
        
        num = num + 1;

    }
    printf ("100");
    printf ("\n");
    
    return 0;
}
