/*      Program Description: this program uses three 2D arrays in the first two they are being initialise, with the values inside the arrays it multiplies their values and stores them in the last array.
        Author: Abraham Izarra
        Date: 19 Nov 2019
 */

#include <stdio.h>

#define ROW 3
#define COLUMN 4

int main()
{
    int array1[ROW][COLUMN] = {1,2,3,
                               4,5,6,
                               7,8,10,
                               11,12,13};
    int array2[ROW][COLUMN] = {14,15,16,17,18,19,20,21,22,23,24,25};
    int array3[ROW][COLUMN];
    int i,j;
    
    
    for (i = 0; i < ROW; i++)
    {
        for (j = 0; j < COLUMN; j++)
        {
            array3[i][j] = array2[i][j] * array1[i][j];
            
        }
    }
    
    printf ("This is inside array3: \n\n");
    
    for (i = 0; i < ROW; i++)
    {
        for (j = 0; j < COLUMN; j++)
        {
            printf ("%d ", array3[i][j]);
            
        }
    }
    
    printf ("\n\n");
    
    return 0;
    
}
