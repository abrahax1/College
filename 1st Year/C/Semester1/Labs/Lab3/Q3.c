/*      Program Description: this program ask the user for 3 float numbers and display the 1st one to 4 decimal places the 2nd one to 3 decimal places and the 3rd with no decimal places on separate lines
        Author: Abraham Izarra
        Date: 7 oct 2019
*/

#include <stdio.h>

int main()

{
    float num1;
    float num2;
    float num3;
    
    printf ("enter 3 numbers with 4 decimal places \n");
    
    scanf ("%f \n", & num1);
    scanf ("%f \n", & num2);
    scanf ("%f", & num3);
    
    printf ("number 1 is %.4f \n", num1);
    printf ("number 2 is %.3f \n", num2);
    printf ("number 3 is %.0f \n", num3);
    
    return 0;
}
