/*      Program Description: What happens if the following code is used?
       Author: Abraham Izarra
       Date: 19 Nov 2019
*/


#include <stdio.h>

int main()
{
    //code
    int var1;
    int *ptr;
    
    var1 = 1;
    ptr = & var1;
    
    //%d changes the outcome although it should display the address location in hexadecimal the it is change to a normal numerical value
    printf ("the address of var1 is %d \n", & var1); //the %d should be %p
    
    //the missing & does not change the outcome of the address location, because it is using %p
    printf ("ptr contains %p \n", ptr); //there is a missing &, should be & ptr
    
    //the missing * (indirection operator changes the outcome to 1 as it is inside var1 but when the indirection operator is missing it displays the address location normal numerical value (although it is sharing address with var1?)
    printf ("*ptr contains %d \n", ptr); //there is a missing * should be * ptr
    
    
    return 0;
}
