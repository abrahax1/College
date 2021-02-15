/*      Program Description: this program ask the user to enter the number of term and display it
        Author: Abraham Izarra
        Date: 21 oct 2019
        OS: Mac OS Catalina
        Compiler: Xcode
*/

#include <stdio.h>

int main()

{ //start main
    int Terms, num1, num2 = 0, num3 = 1, i;
    
    char beginning;
    
    printf ("Enter the letter 'S' to Start the program \nOr Enter the letter 'E' to End Program \n");
    
    scanf ("%1s", & beginning);
    
    switch (beginning)
    { //start switch block
        case 'S':
        case 's':
        { //start case 1
            printf ("This program has been started \n");
            
            //this loop will display the Fibonacci series
               
               printf ("Enter the number of terms to display in the sequence \n");
               
               scanf ("%d", & Terms);
               
               for (i = 0; i < Terms; i++)
               { //start for loop
                   
                   //this is the sum for the Finobacci series (did not work)
                   
                   num1 = num2 + num3;
                   num2 = num3;
                   num3 = num1;
                   
                   printf ("%d \n", num1);
                   
               }// end for loop
            
            break;
        } //end case 1
            
        case 'E':
        case 'e':
        { //start case 2
            printf ("This program has ended \n");
            
            break;
        } //end case 2
            
            default:
        {
            printf ("Error, You must enter a valid letter \n");
        }
            
    } //end switch statement
    
    return 0;
    
} //end main
