/*      Program Description: this program ask for 1 single number and displays it in words, eg: 5 (five)
        Author: Abraham Izarra
        Date: 14oct 2019
*/

#include <stdio.h>

int main()

{ //start of main
    char num1;
    
    printf ("Enter a single number \n");
    
    scanf ("%1s", & num1);
    
    switch (num1)
    
    { //start of switch block
            
        case '0':
        {
            printf ("Zero \n");
            
            break;
        }
            
        case '1':
        {
            printf ("One \n");
            
            break;
        }
        case '2':
        {
            printf ("Two \n");
            
            break;
        }
        case '3':
        {
            printf ("Three \n");
            
            break;
        }
        case '4':
        {
            printf ("Four \n");
            
            break;
        }
        case '5':
        {
            printf ("Five \n");
            
            break;
        }
        case '6':
        {
            printf ("Six \n");
            
            break;
        }
        case '7':
        {
            printf ("Seven \n");
            
            break;
        }
        case '8':
        {
            printf ("Eight \n");
            
            break;
        }
        case '9':
        {
            printf ("Nine \n");
            
            break;
        }
            default:
        {
            printf ("You have to enter a number from 0 to 9 \n");
        }
            
    } //end of switch block
    
    return 0;
    
} //end of main

