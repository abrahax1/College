/*     Program Description: This program uses pointers to read the radius of a circle and then calculates the diameter and area of the circle
       Author: Abraham Izarra
       Date: 3 Dec 2019
*/

#include <stdio.h>

int main()
{
    
    float radius, diameter, area;
    float *ptrR = &radius;
    float *ptrD = &diameter;
    float *ptrA = &area;
    
    printf ("Enter the radius of the circle \n");
    
    scanf ("%f", & *(ptrR) );
    
    *(ptrD) = ( *(ptrR) * 2);
    *(ptrA) = ( (*(ptrR) * *(ptrR)) * 3.14);
    
    printf ("The diameter is %.2f and the area is %.2f \n", *(ptrD), *(ptrA) );
    
    
    return 0;
    
}
