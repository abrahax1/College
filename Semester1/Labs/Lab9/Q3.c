/*     Program Description: this program uses 2 floats variables called input1 and 2 and then prints the address of input1 and 2, prints the address of ptr1 and 2, make ptr1 and 2 point to input1 and 2 respectively, prints the contents of ptr1 and 2, print the contents of the adress store in ptr1 and 2 using the dereference operator
       Author: Abraham Izarra
       Date: 25 Nov 2019
*/

#include <stdio.h>

int main()
{
    float input1 = 1.9;
    float input2 = 3.2;
    
    float *ptr1;
    float *ptr2;
    
    
    //part 1
    printf ("%p \n", & input1);
    printf ("%p \n", & input2);
    
    printf ("\n\n");
    
    //part 2
    printf ("%p \n", & ptr1);
    printf ("%p \n", & ptr2);
    
    printf ("\n\n");
    
    //part 3
    ptr1 = & input1;
    ptr2 = & input2;
    
    printf ("%p \n", ptr1);
    printf ("%p \n", ptr2);
    
    printf ("\n\n");
    
    //part 4
    printf ("%.1f \n", *ptr1);
    printf ("%.1f \n", *ptr2);
    
    
    return 0;
}
