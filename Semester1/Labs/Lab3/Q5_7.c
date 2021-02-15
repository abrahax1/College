/*      Program Description: this program ask for temperature in degrees and coverts it to fahrenheit
        Author: Abraham Izarra
        Date: 9 oct 2019
*/

#include <stdio.h>

int main()

{
    
    float Degree_Celsius,
          equation,
          equation2,
          equation3;
    
    printf ("Enter the temperature in Degrees Celsius \n");
    
    scanf ("%f", & Degree_Celsius);
    
    equation = Degree_Celsius * 9.0;
    equation2 = equation / 5.0;
    equation3 = equation2 + 32.0;
    
    printf ("Temperature in Degrees Fahrenheit is %.2f \n", equation3);
    
    return 0;
    
}
