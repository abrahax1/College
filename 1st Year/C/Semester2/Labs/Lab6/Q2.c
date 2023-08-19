/*  Program Description: This Program compares the user input to a string containing countries and then prints their respective capitals
    Author: Abraham Izarra
    Date: 5 March 2020
*/

#include <stdio.h>
#include <string.h>

#define SIZE 10
#define SIZE2 20

int main()
{
    char *Country[SIZE2] = {"Australia", "Belgium", "China", "Denmark", "England", "France", "Greece", "Ireland", "Scotland", "Wales"};
    char User_Country[SIZE];
    
    printf ("Enter a country \n");
    
    scanf ("%s", User_Country);
    
    for (int i = 0; i < SIZE; i++)
    {
        if (strcmp (User_Country, Country[i] ) == 0)
        {
            printf ("The capital is: ");
            
            if (strcmp (User_Country, Country[0] ) == 0 )
            {
                printf ("Canberra \n");
            }
            if (strcmp (User_Country, Country[1] ) == 0 )
            {
                printf ("Brussels \n");
            }
            if (strcmp (User_Country, Country[2] ) == 0 )
            {
                printf ("Beijing \n");
            }
            if (strcmp (User_Country, Country[3] ) == 0 )
            {
                printf ("Copenhagen \n");
            }
            if (strcmp (User_Country, Country[4] ) == 0)
            {
                printf ("London \n");
            }
            if (strcmp (User_Country, Country[5] ) == 0 )
            {
                printf ("Paris \n");
            }
            if (strcmp (User_Country, Country[6] ) == 0 )
            {
                printf ("Athens \n");
            }
            if (strcmp (User_Country, Country[7] ) == 0 )
            {
                printf ("Dublin \n");
            }
            if (strcmp (User_Country, Country[8] ) == 0 )
            {
                printf ("Edinburgh \n");
            }
            if (strcmp (User_Country, Country[9] ) == 0 )
            {
                printf ("Cardiff \n");
            }
            
        }//end outer if
        
    }//end for
    
    for (int i = 0; i < SIZE; i++)
    {
        if (strcmp (User_Country, Country[i] ) > 0)
        {
            printf ("We do not have the capital of this country yet \n");
            
            break;
            
        }
        
    }
    
    return 0;
    
}//end main
