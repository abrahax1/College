/*  Program Description: program given to understand what is happening using strings
    Author: Abraham Izarra
    Date: 1 March 2020
*/

#include <stdio.h>

int main()
{
    char *text = "Some text";
    
    printf( "%s\n", text ) ;//displays "Some text"
    printf( "%c\n", *text ) ;//displays only one character ("S")
    printf( "%c\n", *"more text" ) ;//displays only one character ("m")
    printf( "%c\n", *(text+1) ) ;//displays only one character ("o")
    printf( "%s\n", text+1 ) ;//displays "ome text"
    printf( text ) ; //displays "Some text" but gives a warning: (potentially insecure)
    *( text + 4 ) = '\0'; printf( "\n%s\n", text) ;//Compiles but gives an error straight away (fixed by removing '\0' but still gives a warning)
    printf( "%c \n", "text"[2] ) ;//displays only one character ("x")
    printf( "%s \n", "text" + 2 ) ;//displays "xt"
    
    
    return 0;
}
