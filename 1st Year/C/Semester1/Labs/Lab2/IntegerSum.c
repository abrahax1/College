/*      Program Description: this program calculates and display the sum of the integers 1 to 5
        Author: Abraham Izarra
        Date: 30 sept 2019
*/

#include <stdio.h>

int main()

{
    
    int sum;
    float average;
    
    sum = 1 + 2 + 3 + 4 + 5;
    average = 1.0 + 1.1 + 1.2 + 1.3 + 1.4 + 1.5 + 1.6 + 1.7 + 1.8 + 1.9 + 2.0;
    
    printf ("sum contains %d \n", sum);
    printf ("average contains %f \n", average);
    
    average = average /11;
    
    printf ("average contains %f \n", average);
    
    return 0;
    
}
