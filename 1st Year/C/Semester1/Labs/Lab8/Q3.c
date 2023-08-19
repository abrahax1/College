/*      Program Description: This program uses a 2D array and asks user for values, it then calculates and displays (i)The sum of row 0 and row 1 and row 2 separately, (ii)The sum of the column 0 and column 1 separately, it thens finds the highest number and displays it
       Author: Abraham Izarra
       Date: 19 Nov 2019
*/

#include <stdio.h>

#define ROW 3
#define COLUMN 2

int main()
{
    int array1[ROW][COLUMN];
    int i,j;
    int highest, Sum = 0;
    
    
    
    printf ("Enter %d numbers \n", ROW * COLUMN);
    
    for (i = 0; i < ROW; i++)
    {
        for (j = 0; j < COLUMN; j++)
        {
            scanf ("%d", & array1[i][j] );
            
        }
    }
    
    for (i = 0,j=0; (i < ROW), j<COLUMN; i++, j++)
    {
        Sum = Sum + array1[i][j];
        
    }
    printf ("\nThis is the sum of Row1 %d \n", Sum);
    
    printf ("\n");
    
    return 0;
}
