/*      Program Description: this program ask for temperature in fahrenheit and coverts it to degrees
        Author: Abraham Izarra
        Date: 9 oct 2019
*/

#include <stdio.h>

int main()

{
    float Fahrenheit,
          equation,
          equation2,
          equation3;
    
    printf ("Enter a temperature in Degrees Fahrenheit \n");
    
    scanf ("%f", & Fahrenheit);
    
    equation = Fahrenheit - 32.0;
    equation2 = equation * 5.0;
    equation3 = equation2 / 9.0;
    
    printf ("Temperature in Degree Celsius is %.2f \n", equation3);
    
    return 0;
    
}
