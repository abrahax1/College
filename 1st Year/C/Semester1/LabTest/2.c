/*      Program Description: this program contains 2 arrays one named barack and the other one michelle, the barack array will then be copy into the michelle array by replacing the contents then it will display the contents of the array michelle.
        Author: Abraham Izarra
        Date: 2 Dec 2019
        OS: MacOS Catalina
        Compiler: Xcode
*/

#include <stdio.h>
#define SIZE 10

int main()
{
    //declaration of variables
    char barack [] = { 'Y', 'E', 'S', ' ', 'W', 'E', ' ', 'C', 'A', 'N'};
    char michelle [SIZE];
    char *ptr = barack;
    char *ptr2 = michelle;
    int i;
    
    //part 1
    for (i = 0; i < SIZE; i++)
    { //start for loop to copy the contents of the dereferenced pointer1 into the dereferenced pointer2
        
        *(ptr2 + i) = *((ptr + i));
        
    } //end for loop
    
    //part2
    for (i = 0; i < SIZE; i++)
    { //start for loop to replace the blank spaces into '_'
        //used ASCII values for blank space found it by changing the print %c to %d
        if ( *(ptr2 + i) == 32)
        { //start if statement to replace the blank spaces
            *(ptr2 + i) = '_';
        
        } //end if statement
        
    } //end for loop
    
    //part3
    for (i = 0; i < SIZE; i++)
    { //start for loop to print the contents of the dereferenced pointer2
        printf ("%c", *(ptr2 + i) );
        
    } //end for loop
    
    //print spaces so it looks nicer at the end of the program
    printf ("\n\n");
    
    
    return 0;
    
    
} //end main
