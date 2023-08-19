/*  Program Description: This program uses a function to find if s number is even or odd (NOT WORKING) 
    Date: 22 Feb 2020
    Author: Abraham Izarra
*/

#include <stdio.h>
#define SIZE 5

int i;
int Check (int []);

int main()
{
    int Even_Odd[SIZE];
    int Even_N = 0;
    
    printf ("Enter %d numbers \n", SIZE);
    
    for (i = 0; i < SIZE; i++)
    {
        scanf ("%d", Even_Odd);
        
    }
    
    Even_N = Check(Even_Odd);
    
    return 0;
    
}//end main

int Check (int Even_Odd[SIZE])
{
    int Even_N = 0;
    int even[SIZE], odd[SIZE];
    
    
    for (i = 0; i < SIZE; i++)
    {
        printf ("TEST %d", Even_Odd[i]);
        Even_Odd[i] = Even_Odd[i] % 2;
        
        if (Even_Odd[i] == 0)
        {
            even[i] = Even_Odd[i];
            Even_N++;
            
        }
        else
        {
            odd[i] = Even_Odd[i];
            
        }
        
    }
    
    for (i = 0; i < SIZE; i++)
    {
        printf ("EVEN: %d \n", even[i]);
        printf ("ODD: %d \n", odd[i]);
        
    }
    
    return Even_N;
}

