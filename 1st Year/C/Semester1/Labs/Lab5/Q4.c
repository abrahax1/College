/*      Program Description: this program counts to 10 and if the value is equal to 3 and 7 it displays "number is equal to" 3 or 7 respectively
        Author: Abraham Izarra
        Date: 28 oct 2019
*/


#include <stdio.h>

int main()
{
    int count = 1;
    
    while (count < 11)
    {
        printf ("%d \n", count);
        
        count = count + 1;
        
        if (count == 3)
        {
            printf ("This number is three ");
        }
        
        if (count == 7)
        {
            printf ("This number is seven ");
        }
    }
    
    return 0;
}
