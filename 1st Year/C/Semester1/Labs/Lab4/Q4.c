/*      Program Description: this program reads two integers and checks if the first integer is evenly divisible by the second integer
        Author: Abraham Izarra
        Date: 14 oct 2019
*/

#include <stdio.h>

int main()

{ //start main
    
    int num1,
    num2,
    division;
    
    printf ("Entered 2 numbers \n");
    
    scanf ("%d", & num1);
    scanf ("%d", &num2);
    
    division = num1 % num2;
    
    if (division == 0)
    { //start if block
        
        printf ("Your first number divides evenly by the second number \n");
        
    } //end if block
    else
    { //start else block
        
        printf ("Your first number is not evenly divisible by the second number \n");
        
    } //end else block
    
    return 0;
    
} //end main
