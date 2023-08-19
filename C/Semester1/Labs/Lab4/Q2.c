/*      Program Description: this program ask the user to enter an integer between 1 to 100 and checks if the number is even or odd
        Author: Abraham Izarra
        Date: 14 oct 2019
*/

#include <stdio.h>

int main()

{ //start main
    
    int num1;
    
    printf ("Enter a number from 1 to 100 \n");
    
    scanf ("%d", & num1);
    
    if (num1 % 2 == 0)
        
    { //start if block
        
        printf ("Your number is even %d \n", num1);
        
    } //end if block
    else
    { //start else block
        
        printf ("Your number is odd %d \n", num1);
        
    } //end else block
    
    return 0;
    
} //end main
