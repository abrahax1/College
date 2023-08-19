/*      Program Description: this program prints the contents and address of num1 and char, print the contents of ptr1 and ptr2 and print the contents of the addresses stored in ptr1 and ptr2 using the dereference operator
        Author: Abraham Izarra
        Date: 25 Nov 2019
*/

#include <stdio.h>

int main()
{
    int num1 = 4;
    char char1 = 'A';
    int *ptr1 = & num1;
    char *ptr2 = & char1;
    
    
    //part 1
    printf ("%d, %p \n", num1, & num1);
    printf ("%c, %p \n", char1, & char1);
    
    printf ("\n\n");
    
    //part 2
    printf ("%p \n", ptr1);
    printf ("%p \n", ptr2);
    
    printf ("\n\n");
    
    //part 3
    printf ("%d \n", *ptr1);
    printf ("%c \n", *ptr2);
    
    printf ("\n\n");
    
    //part 4 (yes, pointers have their own address)
    
    printf ("%p \n", & ptr1);
    printf ("%p \n", & ptr2);
    
    
    return 0;
}
