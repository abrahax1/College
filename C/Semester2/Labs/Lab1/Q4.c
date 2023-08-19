/*      Description: this program calculates miles per litre of each element by using pointers
        date: 30 Jan 2020
        Author: Abraham Izarra
*/

#include <stdio.h>

int main()
{
    float litres[] = {11.5, 11.21, 12.7, 12.6, 12.4};
    float miles[] = {471.5, 358.72, 495.3, 453.6, 421.6};
    int mpl[5]; /* Miles per Litre. */
    int i, j = 1;
    float *ptr1 = litres, *ptr2 = miles;
    int  *ptr3 = mpl;
    
    
    for (i = 0; i < 5; i++)
    {
        *(ptr3 + i) = *(ptr2 + i) / *(ptr1 + i);
        
        printf ("(%d) %d Miles per Litre1 \n", j, *(ptr3 + i) );
        
        j++;
        
    }
    
    printf ("\n\n");
    
    
    return 0;
    
}
