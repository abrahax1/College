/*  Program Description: this program uses two different ways to initialise an string array and then attempts to print the null character
    Author: Abraham Izarra
    Date: 1 March 2020
*/

#include <stdio.h>
#define SIZE 50

int main()
{
    //first way
    char my_word[SIZE] = {'H','E','L','L','O','\0'};
    
    puts (my_word);
    //if the program does not c have the null character it will work but there is a chance it might crash
    
    //second way
    char my_word2[SIZE] = "Hello";
    
    puts (my_word2);
    
    printf ("Null char is %c \n", my_word[5]);
    printf ("Null char2 is %c \n", my_word2[5]);
    //null character is never printed, just a space.
    
    return 0;
    
    
}
