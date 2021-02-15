/*      Program Description: this program contains a 3x2 2D array
        Author: Abraham Izarra
        Date: 11 Nov 2019
*/

#include <stdio.h>

#define ROW 3
#define COLUMN 2

int main()
{
    int array1[ROW][COLUMN];
    int i, j;
    

    printf ("Enter 6 numbers \n");
    
    for (i = 0; i < ROW; i++)
    {
        for (j = 0; j <COLUMN; j++)
        {
            scanf ("%d", & array1[i][j]);
            
        }
        
    }
    printf ("This are your numbers entered \n");
    
    for (i = 0; i < ROW; i++)
    {
        for (j =0; j < COLUMN; j++)
        {
            printf("%d \n", array1[i][j]);
            
        }
        
    }
    
    
    return 0;
}
