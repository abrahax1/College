/*      Program Description: this program will randomize a number, if the number is even it will halve it if it is odd it will multiply it by 3 and add 1, then it will display the number of times the math was performed
        Author: Abraham Izarra
        Date: 28 oct 2019
*/

#include <stdio.h>

int main()
{
    int i, steps = 0;
    
    printf ("Enter a number that is higher than 1 \n");
    
    scanf ("%d", & i);
    
    printf ("Initial value is %d \n", i);
    
    while (! (i == 1) )
    {
        if (i < 1)
        {
            printf ("Error, please enter a number higher than 1\n");
            
            break;
        }
        
        if (i % 2 == 0)
        {
            i = i / 2;
            
            printf ("Next value is %d \n", i);
            
            steps = steps + 1;
        }
        else
        {
            
            i = i * 3 + 1;
            
            printf ("Next value is %d \n", i);
                
            steps = steps + 1;
        }
        if (i == 1)
        {
            printf ("Number of Steps is %d \n", steps);
        }
    }
    
    return 0;
}
