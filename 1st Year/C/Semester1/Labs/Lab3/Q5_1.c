/*      Program Description: this is to fix problems from a previous given program
        Author: Abraham Izarra
        Date: 7 oct 2019
*/

#include <stdio.h>

int main()

{
    
    int num;
    
// added \n for readability
    printf ( "Please type a number Followed by Enter \n" );
    
/* This was input as %f (wrong delimeter used)
   there was no &
*/
    scanf ( "%d", & num );
    
// for readability added \n
    printf ( "the number you typed was: %d \n", num );
    
// return 0; was not added to the program
    return 0;
    
}
