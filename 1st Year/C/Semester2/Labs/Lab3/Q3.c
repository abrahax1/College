/*  Program Description: This program uses a function to find the highest number and returns the highest number into the main function
    Date: 13 Feb 2020
    Author: Abraham Izarra
*/

#include <stdio.h>

int Highest (int, int, int, int);

int main()
{
    int num1, num2, num3, highest = 0;
    
    printf ("Enter 3 numbers \n");
    
    scanf ("%d %d %d", &num1, &num2, &num3);
    
    highest = Highest(num1, num2, num3, highest);
    
    printf ("\nHighest number is %d \n\n", highest);
    
    return 0;
    
}//end main

int Highest(int num1, int num2, int num3, int highest)
{
    if (num1 > num2 && num1 > num3)
    {
        highest = num1;
        
    }
    else if (num2 > num1 && num2 > num3)
    {
        highest = num2;
        
    }
    
    if (num3 > num1 && num3 > num2)
    {
        highest = num3;
        
    }
    
    return highest;
}
