/*      Program Description:  this programs uses an array to read 3 temperatures reading in fahrenheit and displays them as celcius
        Author: Abraham Izarra
        Date: 4 nov 2019
*/
#include <stdio.h>

#define ARRAY_LENGTH 3
int main ()
{
    
    float Fahrenheit[ARRAY_LENGTH];
    float Celsius;
    int counter;
    
    
    printf ("enter a Temperature in Fahrenheit \n");
    
    
    for (counter = 0; counter < 3; counter++)
    { //start for loop
        scanf ("%f", & Fahrenheit[0]);
        
        Celsius = (Fahrenheit[0] - 32) * (5.0 / 9.0);
        
        printf ("Temperature in Fahrenheit is %.2f Temperature in celsius is %.2f \n", Fahrenheit[0], Celsius);
        
    } //end for loop
    
    return 0;
}
