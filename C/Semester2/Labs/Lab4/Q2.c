/*  Program Description: This program uses a function to sort an array and display the highest Number inside the array
    Date: 21 Feb 2020
    Author: Abraham Izarra
*/

#include <stdio.h>
#define SIZE 5
int i, j;

int Sort (int []);

int main()
{
    int Numbers[SIZE];
    int Highest = 0;
    
    printf ("Enter 5 numbers \n");
    
    for (i = 0; i < SIZE; i++)
    {
        scanf ("%d", Numbers + i);
        
    }
    
    Highest = Sort(Numbers);
    
    printf ("\nHighest number is %d \n\n", Highest);
    
    return 0;
    
}//end main

//this function sorts arrays not working fully
//https://www.sanfoundry.com/c-program-sort-array-ascending-order/
int Sort (int Numbers[])
{
    int Highest = 0;
    
    for (i = 0; i < SIZE; i++)
    {
        for (j = i + i; j < SIZE; j++)
        {
            if (*(Numbers + i) > *(Numbers + j) )
            {
                Highest = *(Numbers + i);
                *(Numbers + i) = *(Numbers + j);
                *(Numbers + j) = Highest;
                
            }
        }
    }
    
    return Highest;
    
}//end Sort

