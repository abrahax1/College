/*
       Program Description: this program uses a 2D array of [4][5] asking the user to input numbers and then searching for values that are less than 0 therefore displaying these values along with the row and column they are in
       Author: Abraham Izarra
       Date: 18 Nov 2019
*/

#include <stdio.h>
#define ROW 4
#define COLUMN 5

int main()
{
    int array [ROW][COLUMN];
    int i,j, counter1 = 0, counter2 = 0;
    
    
    printf ("Enter 20 numbers\n");
    
    for (i = 0; i < ROW; i++)
    {
        for (j = 0; j < COLUMN; j++)
        {
            scanf ("%d", & array[i][j] );
        }
    }
    
    printf ("\nThis are the numbers inputted less or equal to 0\n\n");
    
    for (i = 0; i < ROW; i++)
    {
        counter1 = 0;
        counter2 = 0 ;
        
        for (j = 0; j < COLUMN; j++)
        {
            if (array[i][j] <= 0)
            {
                printf ("%d ", array[i][j] );
                printf ("array [%d][%d] ", counter1, counter2 );
                
                counter1++;
                counter2++;
            }
        }
    }
    
    printf ("\n\n");
    
    return 0;
}
