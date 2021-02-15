/*      Program Description: This program ask and displays 2 characters in different lines
        Author: Abraham Izarra
        Date: 7 oct 2019
*/

#include <stdio.h>

int main ()

{
    char char1,
         char2;
    
    printf ("enter two letters \n");
    
    scanf ("%c \n", & char1);  //when %1s is used the program will ignored space and enter
    scanf ("%c", & char2);    //when %1s is used the program will ignored space and enter
    
    printf ("letter 1 is %c \n", char1); //if %d is used then a number will be displayed because of ASCII
    printf ("letter 2 is %c \n",char2); //if %d is used then a number will be displayed because of ASCII
    
//when space key or enter key is pressed the program reads them as character
    
    return 0;
    
}
