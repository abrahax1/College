/*  Program Description: this program uses a function to calculate if a number is even or odd and then returns a 0 or 1 depending on the number inputted
    Date: 13 Feb 2020
    Author: Abraham Izarra
*/

#include <stdio.h>

//function signature
int even_odd(int, int);

int main()
{
    int number;
    int i = 0;
    
    printf ("Enter any number \n");
    
    scanf ("%d", &number);
    
    i = even_odd (number, i);
    
    if (i == 0)
    {
        printf ("Your number is even \n\n");
        
    }
    else
    {
        printf ("Your number is odd \n\n");
        
    }
    
    return 0;
    
}//end main

//implement function even_odd
int even_odd(int number, int i)
{
    number = number % 2;
    
    if (number == 0)
    {
        return i;
        
    }
    else
    {
        i++;
        
        return i;
    }
    
}
