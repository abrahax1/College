/*  Program Description: This program is a copy of Problem_2 but making a new array inside the function to change the values (multiply) of the last array FOR SOME REASON IT DOESN'T WORK although it is sending the values from the first array and multiplying them to the second array perfectly.
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

//this function sorts arrays
//https://www.sanfoundry.com/c-program-sort-array-ascending-order/
int Sort (int Numbers[])
{
    int Highest = 0, New_Value[SIZE];
    
    
    for (i = 0; i < SIZE; i++)
    {
        *(New_Value + i) = *(Numbers + i) * 2;
        printf ("%d, ", New_Value[i]);
    }
    
    
    
    for (i = 0; i < SIZE; i++)
    {
        for (j = i + i; j < SIZE; j++)
        {
            if (*(New_Value + i) > *(New_Value + j) )
            {
                Highest = *(New_Value + i);
                *(New_Value + i) = *(New_Value + j);
                *(New_Value + j) = Highest;
                
            }
        }
    }
    
    //printf ("TEST: %d \n\n\n", Highest);
    
    return Highest;
    
}//end Sort

