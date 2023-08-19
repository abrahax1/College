/*  Program Description: program given to understand what is happening using strings
    Author: Abraham Izarra
    Date: 1 March 2020
*/

#include <stdio.h>

int main()
{
    printf( "%5s \n", "abcd" ) ; //Compiles, gives right answer
    printf( "%5s \n", "abcdef" ) ; //Compiles, gives right answer
    printf( "%-5s \n", "abc" ) ; //Compiles, gives right answer
    printf( "%5s \n", "abcde" ) ; //Compiles, gives wrong answer fixed by removing ".2" (%5.2s)
    printf( "%-5s \n", "abcde" ) ; //Compiles, gives wrong answer fixed by removing ".2" (%-5.2s)
    
    return 0;
              
              
}
