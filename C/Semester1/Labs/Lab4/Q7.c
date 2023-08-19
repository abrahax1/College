/*      Program Description: this program ask for a number from 1 to 7 and displays it in the order of days, eg: 2 (Tuesday)
        Author: Abraham Izarra
        Date: 14oct 2019
*/

#include <stdio.h>

int main()

{ //start of main
    
    char num;
    
    printf ("Enter a number from 1 to 7 \n");
    
    scanf ("%1s", & num);
    
    switch (num)
    { //start of switch block
        case '1':
        {
            printf ("Monday \n");
            
            break;
        }
        case '2':
        {
            printf ("Tuesday \n");
            
            break;
        }
        case '3':
        {
            printf ("Wednesday \n");
            
            break;
        }
        case '4':
        {
            printf ("Thursday \n");
            
            break;
        }
        case '5':
        {
            printf ("Friday \n");
            
            break;
        }
        case '6':
        {
            printf ("Saturday \n");
            
            break;
        }
        case '7':
        {
            printf ("Sunday \n");
            
            break;
        }
        default:
        {
            printf ("Error, you have to enter a number from 1 to 7 \n");
        }
            
    } //end of switch block
    
    return 0;
    
} //end of main
