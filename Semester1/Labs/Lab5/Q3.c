/*      Program Description: this program ask the user for a number between 1 and 5 and displays all the numbers (between 1 to 20) that are evenly divisible by such number
        Author: Abraham Izarra
        Date: 28 oct 2019
*/

#include <stdio.h>

int main()
{
    int i = 0, number, equation, Divisible  = 0 ;
    int array[20];
    
    printf ("Enter a number between 1 and 5 \n");
    
    scanf ("%d", & number);
    
    printf ("Your number can evenly divide the numbers \n");
    
    for (array [0] = 0; array [0] < 20; array [0] = array[0] + 1)
    {
        printf ("array is %d \n", array [0]);
        do
        {

            equation = number / 2;
            Divisible = equation;
                
            printf ("what %d, ", Divisible);
                
            i = i + 1;
            
        }
        while (i == 1);
        
    }
    
    printf ("\n");

    
    return 0;
}
