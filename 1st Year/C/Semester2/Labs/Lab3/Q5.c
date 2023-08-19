/*  Program Description: This program uses a pass by value function
    Date: 13 Feb 2020
    Author: Abraham Izarra
*/

#include <stdio.h>

int PassByValue(int);

int main()
{
    int Number1 = 1;
    
    printf ("Before pass %d \n", Number1);
    
    PassByValue(Number1);
    
    printf ("After pass inside main: %d \n", Number1);
    
    return 0;
    
}// end main

int PassByValue(int Number1)
{
    Number1 = Number1 + 2;
    
    printf ("After pass inside fxn: %d \n", Number1);
    
    return Number1;
    
}//end function

