/*      Program Description: Testing different things with pointers
       Author: Abraham Izarra
       Date: 19 Nov 2019
*/


#include <stdio.h>

int main()
{
    
    int var1 = 1, i;
    int var2;
    
    int *ptr1 = & var1;
    int *ptr2 = & var2;
    
    for (i = 0; i < 1; i++)
    {
        printf ("ptr contains %d \n", *ptr1);
        
        ptr1++;
    }
    
    printf ("ptr2 address is %p \n", & ptr2 );
    
    scanf ("%p \n", & ptr2);
    
    printf ("%p \n",  & (*ptr2) );
    
    //CONCLUSION it is possible to change the address location of a pointer but the system does not let you change what is inside that random location by using a pointer
    
    
    return 0;
}

/*
 
 RESULT: during printf (%p, & ptr2)
     ptr contains 1
     ptr2 address is 0x7ffeefbff470
     FB6546
     5
     0x7ffeefbff470
 ________________________________

RESULT: during printf (%p, & (*ptr2) )
     ptr contains 1
     ptr2 address is 0x7ffeefbff470
     FB6546
     5
     0xfb6546
 ________________________________
 
RESULT: during printf (%d, & (*ptr2) )
    ptr contains 1
    ptr2 address is 0x7ffeefbff470
    fb6546
    5
    16475462
 ________________________________

 RESULT: during printf (%p, * ptr2)
     ptr contains 1
     ptr2 address is 0x7ffeefbff470
     FB6546
     5
     ERROR
 ________________________________
 
 RESULT: during printf (%d, * ptr2)
    ptr contains 1
    ptr2 address is 0x7ffeefbff470
    FB6546
    5
    ERROR
 
 
 */

