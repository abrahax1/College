/*  Program Description: this program uses puts and gets to reads the name of the user and displays it with spaces between characters
    Author: Abraham Izarra
    Date: 1 March 2020
*/

#include <stdio.h>
#include <string.h>

#define SIZE 50

int main()
{
    char Name[SIZE];
    //char Name_Spaced[SIZE] =
    long Length = 0;
    
    
    puts ("Enter your first name");
    
    gets (Name);
    
    Length = strlen(Name);
    
    for (int i = 0; i < Length; i++)
    {
        printf ("%c ", Name[i]);
    }
    
    puts("");
    
    return 0;
}
