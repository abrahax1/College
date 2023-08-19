/*      Program Description: this program ask for two numbers and displays the result dividing the second number into the first
        Author: Abraham Izarra
        Date: 10 oct 2019
*/

#include <stdio.h>

int main()

{
    
    int num1,
        num2,
        equation;
    
    printf("Enter 2 numbers \n");
    
    scanf ("%d %d", & num1, & num2);
    
    equation = num2 % num1;
    
    printf ("Your first number is %d \n", num1);
    printf ("Your second number is %d \n", num2);
    printf ("Your division total is %d", equation);
    
    return 0;
    
}
