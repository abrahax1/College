/*  Program Description: This program uses structures and adds a number to the value inside them by doing this i have created a calendar
    Author: Abraham Izarra
    Date: 25 mar 2020
*/

struct date_rec
{
    int day;
    int month;
    int year;
    
};//end date_rec

#include <stdio.h>
#include <unistd.h>


int main()
{
    int i = 0;
    //enter values
    struct date_rec current_date = {29,12,2020};
    
    //add one day
    while (i == 0)
    {
        current_date.day++;
    
        if (current_date.day == 31)
        {
            current_date.day = 1;
            
            current_date.month++;
            
            if (current_date.month == 13)
            {
                current_date.month = 0;
                
                current_date.year++;
                
            }//end inner if
            
            sleep(1);
            
            printf ("%d/%d/%d \n", current_date.day, current_date.month, current_date.year);
            
        }//end outer if
        else
        {
            sleep(1);
            
            printf ("%d/%d/%d \n", current_date.day, current_date.month, current_date.year);
            
        }//end else
        
    }//end while
    
    return 0;
    
}//end main
