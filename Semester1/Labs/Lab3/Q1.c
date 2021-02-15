/*      Program Description: this program ask the user to enter and displays 3 numbers on separate lines
        Author: Abraham Izarra
        Date: 7 oct 2019
*/

#include <stdio.h>

int main()

{
    int first_number;
    int second_number;
    int third_number;
    
    first_number = 0;
    second_number = 0;
    third_number = 0;
    
    printf ("Enter 3 numbers \n");
    
    scanf ("%d", & first_number);
    scanf ("%d", & second_number);
    scanf ("%d", & third_number);
    
    printf ("first number is %d \n", first_number);
    printf ("second number is %d \n", second_number);
    printf ("third number is %d \n", third_number);
    
    return 0;
    
}
