/*  Program Description: This program let the user enter two words and compares them with the array (commented code is a second method)
    Author: Abraham Izarra
    Date: 5 March 2020
*/

#include <stdio.h>
#include <string.h>

#define SIZE 20
#define SIZE2 2 //#define SIZE2 1

char Join (char);

int main()
{
    char *Word[SIZE] = {"Hello", "User"}; //char *Word[SIZE] = {"Hello User"};
    char User_Word[SIZE];
    
    printf ("Enter the word \n");
    
    //gets(User_Word);
    
    for (int i = 0; i < SIZE2; i++)
    {
        
        scanf ("%s", User_Word);
        Join(*User_Word);
        
        int Value = strcmp (User_Word, Word[i] );
        
        if (Value == 0)
        {
            printf ("Your word is correct \n");
        }
        else
        {
            printf ("Your word is incorrect \nEnter word again\n");
            
            i--;
            
        }
        
    }//end loop
    
    return 0;
    
}//end main

char Join (char User_Word)
{
    char Text;
    
    return 0;
}
