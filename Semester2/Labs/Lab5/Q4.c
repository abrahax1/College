/*  Program Description: program given to understand what is happening using strings
    Author: Abraham Izarra
    Date: 1 March 2020
*/

#include <stdio.h>
#include <string.h>

int main()
{
    puts ("Part a:");
    
    char *p = "abcd";
    
    while(*p)
        putchar( *p++); //displays abcd
        
    printf ("\n\n");
    
     
    puts ("Part b:"); //(for some reason puts also puts an space without having to use \n )
    
    char *text = "abcd";
    p = text;
    p += strlen(p) - 1;
    while (text <= p )
        puts(p--);
    //displays d in the first line, then cd second line, bcd third line and abcd fourth line
    
    return 0;
}
