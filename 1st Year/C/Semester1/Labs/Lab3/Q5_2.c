/*      Program Description: this is program will display many values using one scanf() for each group
        Author: Abraham Izarra
        Date: 7 oct 2019
*/

#include <stdio.h>

int main()

{
    
//first group
    int first;
//second group
    int second;
    int third;
    int fourth;
//third group
    float principal;
    float rate;
    float time;
//fourth group
    char keyval1;
    char keyval2;
//fifth group
    char c;
    int i;
    float f;
    double d;
    
//first scanf()
    printf ("enter a number\n");
    
    scanf ("%d", & first);
    
    printf ("first number is %d \n",first);
    
//second scanf()
    printf ("enter 3 numbers \n");
    
    scanf ("%d %d %d", & second, & third, & fourth);
    
    printf ("second number is %d \n", second);
    printf ("third number is %d \n", third);
    printf ("fourth number is %d \n", fourth);
    
//third scanf()
    
    printf ("enter 3 numbers with decimals \n");
    
    scanf ("%f %f %f", & principal, & rate, & time);
    
    printf ("principal number is %f \n", principal);
    printf ("rate number is %f \n", rate);
    printf ("time number is %f \n", time);
    
//fourth scanf()
    printf ("type 2 characters \n");
    
    scanf ("%1s %c", & keyval1, & keyval2);
    
    printf ("keyval1 character is %c \n", keyval1);
    printf ("keyval2 character is %c \n", keyval2);
    
//fifth scanf()
    printf ("enter 1 character, 1 number, 1 number with decimals and a double? \n");
    
    scanf ("%1s %d %f %lf", & c, & i, & f, & d);
    
    printf ("c character is %c \n", c);
    printf ("i number is %d \n", i);
    printf ("f number is %f \n", f);
    printf ("d number is %lf \n", d);
    
    return 0;
    
}
