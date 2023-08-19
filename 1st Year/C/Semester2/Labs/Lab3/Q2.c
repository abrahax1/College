/*  Program Description: This program uses a function to calculate the average of 3 numbers and sends the average to the main function
    Date: 13 Feb 2020
    Author: Abraham Izarra
*/

#include <stdio.h>

float Average(float, float, float, float);

int main()
{
    float num1, num2, num3;
    
    float average = 0;
    
    printf ("Please enter 3 numbers \n");
    
    scanf ("%f %f %f", &num1, &num2, &num3);
    
    average = Average(num1, num2, num3, average);
    
    printf ("Your average is %.2f \n\n", average);
    
    return 0;
    
}//end main

float Average(float num1, float num2, float num3, float average)
{
    average = (num1 + num2 + num3) / 3;
    
    return average;
    
}
