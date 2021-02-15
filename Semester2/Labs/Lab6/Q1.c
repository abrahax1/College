/*  Program Description: This program compares user input to a string containing names and then greets the user if their name is in the array else displays a message of error
    Author: Abraham Izarra
    Date: 5 March 2020
 */

#include <stdio.h>
#include <string.h>

#define SIZE 50
#define NAME_SIZE 10

int main()
{
    char *Names[SIZE] = {"Alan", "Raphael", "Abraham", "Nico", "Ethan", "Jack"};
    char User_Name[NAME_SIZE];
    int value = 0;
    
    printf ("Enter your name \n");
    
    scanf ("%s", User_Name);
    
    for (int i = 0; i < 6; i++)
    {
        value = strcmp (User_Name, Names[i]);
        
        if (value == 0)
        {
            printf ("Greetings \n");
            
        }
    }
    if (value > 0)
    {
        printf ("Name not found \n");
        
    }
    
    return 0;
}
