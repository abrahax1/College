/*      Program Description: this program ask for 3 numbers with decimals and display the total of them if their added and their average
        Author: Abraham Izarra
        Date: 9 oct 2019
*/

#include <stdio.h>

int main()

{
    float num1,
          num2,
          num3,
          total,
          average;
    
    printf ("Enter 3 numbers with decimals \n");
    
    scanf ("%f %f %f", & num1, & num2, & num3);
    
    total = num1 + num2 + num3;
    average = total / 3;
    
    
    printf ("Sum total is %.3f \n", total);
    printf ("Average is %.3f \n", average);
    
    return 0;
    
}
