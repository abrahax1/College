/*      Program Description: this program contains a 2D array
        Author: Abraham Izarra
        Date: 11 Nov 2019
*/

#include <stdio.h>

#define Array_Length 10


int main()
{
    int i;
    int a[Array_Length];
    
    for (i = 0; i < Array_Length; i++)
    {
        a[i] = 9 - i;
        
    }
    for (i = 0; i < Array_Length; i++)
    {
        a[i] = a [ a[i] ];
    }
    
    printf ("%d \n", a[8]);
    
    return 0;
    
}
