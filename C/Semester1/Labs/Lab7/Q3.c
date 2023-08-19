/*
        Program Description: this program reads 15 numbers, displays rhem in separate lines, in one line separated by spaces and in one line separated by spaces but in reverse order
        Author: Abraham Izarra
        Date: 11 Nov 2019
 
 */

#include <stdio.h>

#define Numbers 15
int main()
{
    
    int Number[Numbers];
    int i;
    
    printf ("enter 15 numbers \n");
    
    for (i = 0; i < Numbers; i++)
    {
        scanf ("%d", & Number[i]);
        
    }
    
    printf ("\n\nThis are your numbers each in a line\n\n");
    
    for (i = 0; i < Numbers; i++)
    {
        
        printf ("%d \n", Number[i]);
        
    }
    
    printf ("\n\nThis are your numbers each separated by a space\n\n");
    
    for (i = 0; i < Numbers; i++)
    {
        printf ("%d ", Number[i]);
    }
    
    printf ("\n\nThis are your numbers in reverse order each separated by a space\n\n");
    
    for (i = 14; i > -1; i--)
    {
        printf ("%d ", Number[i]);
    }
    
    printf ("\n\n");
    
    return 0;
}
