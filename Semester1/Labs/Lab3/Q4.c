/*      Program Description: this program ask the user for 2 different characters but using getchar() and the putchar()
        Author: Abraham Izarra
        Date: 7 oct 2019
*/

#include <stdio.h>

int main()

{
    
    char char1;
    char char2;
    char gar;
    
 
    printf ("enter two letters \n");
    
    char1 = getchar();
    gar = getchar();
    char1 = getchar();
    
    putchar(char1);
    putchar(char2);
    putchar(gar);
    
    return 0;
    
/*this program will not function correctly as getchar() and putchar() is not an effective method
*/
    
}
