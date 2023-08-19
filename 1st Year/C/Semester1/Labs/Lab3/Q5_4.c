/*      Program Description: this program displays float numbers without the decimal part
        Author: Abraham Izarra
        Date: 9 oct 2019
*/

#include <stdio.h>

int main()

{
    
    float v1 = 5.0,
          v2 = -4.5,
          v3 = 11.25;
    
    printf ("v1 is %.0f \n", v1);
    printf ("v2 is %.1f \n",v2);
    printf ("v3 is %.2f \n", v3);
    
    return 0;
    
}
