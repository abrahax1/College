/*  Program Description: This program uses pass by reference functions to calculate the area of a square and a circle by using the length and radius respectively
    Date: 21 Feb 2020
    Author: Abraham Izarra
*/

#include <stdio.h>
#include <math.h>

float A_Square (float*);
float A_Circle (float*);

int main()
{
    float length_Square = 0, Radius_circle = 0;
    
    printf ("Enter the Length of a side of the square and the Radius of the circle \n");
    
    scanf ("%f %f", &length_Square, &Radius_circle);
    
    printf ("\n");
    
    A_Square(& length_Square);
    A_Circle(& Radius_circle);
    
    printf ("Area of Square is %.2f \nArea of Circle is %.2f \n\n", length_Square, Radius_circle);
    
    return 0;
    
}//end main

float A_Square (float *length_Square)
{
    *length_Square = pow(*length_Square, 2);
    
    return *length_Square;
    
}//end A_Square

float A_Circle (float *Radius_circle)
{
    float pi = 3.14;
    
    *Radius_circle = pi * (pow(*Radius_circle, 2) );
    
    return *Radius_circle;
    
}
