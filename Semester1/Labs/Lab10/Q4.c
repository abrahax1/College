/*     Program Description: This program uses a floating point array, then display the contents of the address location before the first element of the array and the contents of the address location after the last element of the array
       Author: Abraham Izarra
       Date: 3 Dec 2019
*/

#include <stdio.h>
#define LENGTH 3

int main()
{
    
    float array[LENGTH] = {1.1,2.2,3.3};
    
    
    printf ("%.1f, %.1f \n", *(array - 1), *(array + 3) );
    //after displaying the results i get 0.0 for the one before the first element and a random negative value for the one after the last element 
    
    return 0;
    
}
