/*     Program Description: This program asks the user 2 integers stores them and using pointers calculates their sum
       Author: Abraham Izarra
       Date: 25 Nov 2019
*/

#include <stdio.h>

int main()
{
    int num1, num2, sum;
    int *ptr1 = &num1;
    int *ptr2 = &num2;
    int *ptrS = &sum;
    
    
    printf ("Enter two numbers \n");
    
    scanf ("%d %d", & *(ptr1), & *(ptr2) );
    
    *ptrS = *ptr1 + *ptr2;
    
    printf ("The sum of these two numbers is %d \n", *ptrS);
    
    
    return 0;
}
