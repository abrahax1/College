/*      Program Description: this program ask for three numbers and determines if they form a valid triangle
        Author: Abraham Izarra
        Date: 14oct 2019
*/

#include <stdio.h>

int main()

{ //start main
    
    int num1,
        num2,
        num3;
    
    printf ("Enter 3 numbers \n");
    
    scanf ("%d", & num1);
    scanf ("%d", & num2);
    scanf ("%d", & num3);
    
    if (num1 + num2 > num3)
        
    { //start of first if block
        
        if (num1 + num3 > num3)
            
        { //start of second if block
            
           if (num2 + num3 > num1)
               
           { //start of third if block
               
            printf ("You have created a triangle \n");
               
           } //end of third if block
            
        } //end of second if block
        
    } //end of first if block
    
    else
        
    { //start of else
        
        printf ("This is not a triangle \n");
        
    } //end of else
    
    return 0;
    
} //end of main
