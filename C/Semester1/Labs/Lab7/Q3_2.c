/*
       Program Description: this program uses Two 1D arrays asking the user to input numbers and displays the result of the corresponding elements multiplication
       Author: Abraham Izarra
       Date: 18 Nov 2019
*/

#include <stdio.h>
#define ARRAYS 5

int main()
{
    int array1 [ARRAYS];
    int array2 [ARRAYS];
    int i, multiplication;
    
    
    printf ("Enter 5 numbers for your first array \n");
    
    for (i = 0; i < ARRAYS; i++)
    {
        scanf ("%d", & array1[i]);
    }
    
    printf ("\nEnter 5 more numbers for your second array \n");
    
    for (i = 0; i < ARRAYS; i++)
    {
        scanf ("%d", & array2 [i]);
    }
    
    printf ("\nThis are the results of the multiplication between the numbers you have entered \n\n");
    
    for (i = 0; i < ARRAYS; i++)
    {
        multiplication = array1[i] * array2[i];
        
        printf ("%d ", multiplication);
    }
    
    printf ("\n\n");
    
    return 0;
}
