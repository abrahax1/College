/*      Program Description: this program ask for 2 numbers and display the first one as a percentage of the second number
        Author: Abraham Izarra
        Date: 9 oct 2019
*/

#include <stdio.h>

int main()

{
    float num1,
          num2,
          equation;
    
    printf ("Enter 2 numbers \n");
    
    scanf ("%f %f", & num1, & num2);
    
    equation = num1 / num2 * 100;
    
    printf ("You first number is %.1f \n", num1);
    printf ("Your percentage is %.1f \n", equation);
    
    return 0;
    
}
