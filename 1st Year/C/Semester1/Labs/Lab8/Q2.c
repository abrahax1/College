/*      Program Description: Completing an exercise using 2D arrays
       Author: Abraham Izarra
       Date: 19 Nov 2019
*/

#include <stdio.h>

#define ROW 6
#define COLUMN 4

int main()
{
    int data[ROW][COLUMN] = {3,2,5,7,4,2,
                             1,4,4,8,13,1,
                             9,1,0,2,0,0,
                             0,2,6,3,-1,-8};
    
    //declare the sum
    int i,j;
    int sum = 0;
    
    
    //compute the sum
    for (i = 0; i < ROW; i++)
    {
        for (j = 0; j < COLUMN; j++)
        {
            sum = sum + data[i][j];
        }
    }
    
    //display the sum
    printf ("This is your Sum of numbers: \n%d \n", sum);
    
    
    return 0;
}
