/*  Program Description: This program uses a function to find the average of the numbers inputted
    Date: 21 Feb 2020
    Author: Abraham Izarra
*/

#include <stdio.h>
#define SIZE 5

int Average (int []);

int i;


int main()
{
    int Numbers[SIZE];
    int average = 0;
    
    printf ("Enter %d Numbers \n", SIZE);
    
    for (i = 0; i < SIZE; i++)
    {
        scanf ("%d", Numbers + i );
        
    }
    
    average = Average(Numbers);
    
    printf ("Your average is %d \n\n", average);
    
    return 0;
    
}//end main

int Average (int Numbers[])
{
    int average = 0;
    
    for (i = 0; i < SIZE; i++)
    {
        average = average + (*(Numbers + i) );
        
    }
    
    average = average / SIZE;
    
    return average;
    
}
