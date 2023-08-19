/*      Program Description: this program contains the volume and surface area on separare lines
        Author: Abraham Izarra
        Date: 30 sept 2019
 */

#include <stdio.h>

int main()

{
    float volume;
    int height = 10;
    float width = 2.5;
    float lenght = 11.5;
    float surface_area;
    
    volume = height * width * lenght;
    surface_area = (lenght * height) * 6;
    
    printf ("volume is %f \n", volume);
    printf ("surface area is %f \n", surface_area);
    
    return 0;
    
}
