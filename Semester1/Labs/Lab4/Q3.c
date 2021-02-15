/*      Program Description: this program replaces multiples if stataments for a switch statement
        Author: Abraham Izarra
        Date: 14 oct 2019
*/

#include <stdio.h>

int main()

{ //start main
    
    char marriage_status;
    
    printf ("Enter a letter for Marriage Status \neg: S for single \n");
    
    scanf ("%1s", & marriage_status);
    
    switch (marriage_status)
    { //start switch statement
        case 'S':
        {
            printf ("You have entered Single \n");
            
            break;
        }
        
        case 'M':
        {
            printf ("You have entered Married \n");
            
            break;
        }
            
        case 'W':
        {
            printf ("You have entered Widowed \n");
            
            break;
        }
            
        case 'E':
        {
            printf ("You have entered Separated \n");
            
            break;
        }
            
        case 'D':
        {
            printf ("You have entered Divorced \n");
            
            break;
        } //end switch statement
        default:
        { //start else block
            
            printf ("error: invalid code \n");
            
        } //end else block
        
    } //end switch statement
    
    return 0;
     
} //end main
