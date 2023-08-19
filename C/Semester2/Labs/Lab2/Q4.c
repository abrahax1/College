/*      Description: This program does different equations in different functions
        date: 6 feb 2020
        Author: Abraham Izarra
*/

#include <stdio.h>
void sum(int, int, int);
void average(int);

int main()
{
    int Num1, Num2, Num3;
    
    printf ("Enter 3 numbers \n");
    
    scanf ("%d %d %d", &Num1, &Num2, &Num3);
    
    //call function sum
    sum(Num1, Num2, Num3);
    
    
    return 0;
    
}

//implement function sum
void sum(int Num1, int Num2, int Num3)
{
    int total;
    
    total = Num1 + Num2 + Num3;
    
    //call function average
    average(total);
    
}

void average(int total)
{
    int average;
    
    average = total / 3;
    
    printf ("Your Average is %d \n\n", average);
    
}
