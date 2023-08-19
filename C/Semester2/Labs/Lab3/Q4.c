/*  Program Description: This program uses a function to find the most common character used and returns it to the main function
    Date: 13 Feb 2020
    Author: Abraham Izarra
*/

#include <stdio.h>

char mostCommon (char, char, char, char);

int main()
{
    char char1, char2, char3, commonChar = '0';
    
    printf ("Enter 2 of the same characters and 1 different character \n");
    
    scanf ("%c %c %c", &char1, &char2, &char3);
    
    commonChar = mostCommon(char1, char2, char3, commonChar);
    
    printf ("\nThe most common character was %c \n\n", commonChar);
    
    return 0;
    
}//end main
char mostCommon (char char1, char char2, char char3, char commonChar)
{
    int i = 0;
    
    if (char1 == char2 || char1 == char3)
    {
        i++;
        
        commonChar = char1;
        
    }
    else if (char2 == char3)
    {
        i++;
        
        commonChar = char2;
    }
    
    return commonChar;
    
}//end mostCommon function

