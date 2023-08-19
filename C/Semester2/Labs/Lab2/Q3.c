/*      Description: This program finds Highest and Lowest number using a function
        date: 6 feb 2020
        Author: Abraham Izarra
*/

#include <stdio.h>

void find_High_Low(int, int, int);

int High, Low;

int main()
{
    int Num1, Num2, Num3;

    
    printf ("Enter 3 numbers \n");
    
    scanf("%d %d %d", &Num1, &Num2, &Num3);
    
    //call function
    find_High_Low(Num1, Num2, Num3);
    
    printf ("High is %d and Low is %d \n\n", High, Low);
    
    
    return 0;
    
}//end main

//implement find_High_Low
void find_High_Low (int Num1, int Num2, int Num3)
{
        if (Num1 > Num2 && Num1 > Num3)
        {
            High = Num1;
            
            if (Num2 < Num3)
            {
                Low = Num2;
                
            }//end inner if
            else
            {
                Low = Num3;
                
            }//end else
            
        }//end outer if
        
        if (Num2 > Num1 && Num2 > Num3)
        {
            High = Num2;
            
            if (Num1 < Num3)
            {
                Low = Num1;
                
            }//end inner if
            else
            {
                Low = Num3;
                
            }//end else
            
        }//end outer if
        
        if (Num3 > Num1 && Num3 > Num2)
        {
            High = Num3;
            
            if (Num1 < Num2)
            {
                Low = Num1;
                
            }//end inner if
            else
            {
                Low = Num2;
                
            }//end else
            
        }//end outer if
    
}//end Find_High_Low function
