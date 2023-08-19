/*      Program Description: this program calculates and displays many operations
        Author: Abraham Izarra
        Date: 30 sept 2019
*/

#include <stdio.h>

int main()

{
    
    int var1 = 15;
    int var2 = 10;
    int var3 = 3;
    int operation1 = 0;
    int operation2 = 0;
    int operation3 = 0;
    float operation4 = 0;
    int operation5 = 0;
    
    operation1 = var1 + var2;
    operation2 = var1 - var2;
    operation3 = var1 * var2;
    operation4 = (float) var1 / var2;
    operation5 = var1 % var3;
    
    printf ("operation 1 is %d \n", operation1);
    printf ("operation 2 is %d \n", operation2);
    printf ("operation 3 is %d \n", operation3);
    printf ("operation 4 is %f \n", operation4);
    printf ("operation 5 is %d \n", operation5);
    
    return 0;
    
}
