/*     Program Description: This program uses 2 floating point arrays with 3 elements in each, asks the user to enter values into the first array and then copies the contents into the second array
       Author: Abraham Izarra
       Date: 25 Nov 2019
*/

#include <stdio.h>
#define LENGTH 3

int main()
{
    
    float array1 [LENGTH];
    float array2 [LENGTH];
    int i;
    
    printf ("Enter 3 numbers \n");
    
    for (i = 0; i < LENGTH; i++)
    { //asks for numbers
        scanf ("%f", & *(array1 + i) );
        
        //copy array1 into array2
        *(array2 + i) = *(array1 + i);
    }
    
    printf ("\nThis are your numbers \n");
    
    for (i = 0; i < LENGTH; i++)
    { //display numbers
        printf ("%.1f \n", *(array2 + i) );
    }
    
    printf ("\n");
    
    
    return 0;
}
