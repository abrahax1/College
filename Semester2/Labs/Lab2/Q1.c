/*      Description: this program uses a void function to print 10 stars in one line
        date: 6 feb 2020
        Author: Abraham Izarra
*/

#include <stdio.h>

void stars(int);

int main()
{
    
    int numStars = 10;
    
    //call function
    stars(numStars);
    
    return 0;
    
} //end main

void stars (int N1)
{
    int i;
    
    //print stars
    for (i = 0; i < N1; i++)
    {
        printf ("*");
        
    }
    
    printf ("\n\n");
    
}//end stars
