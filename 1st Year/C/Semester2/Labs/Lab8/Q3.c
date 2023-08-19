/*  Program Description: this program uses structures and adds a number to the value inside them by doing this i have created a clock
    Author: Abraham Izarra
    Date: 25 mar 2020
*/

struct time_rec
{
    int hours;
    int mins;
    int secs;
    
};//end time_rec

#include <stdio.h>
#include <unistd.h>

int main()
{
    int i = 0;
    
    //entering values
    struct time_rec current_time = {02,59,50};
    
    while (i == 0)
    {
        sleep(1);
        
        current_time.secs++;
        
        if (current_time.secs == 60)
        {
            current_time.secs = 0;
            
            current_time.mins++;
            
            if (current_time.mins == 60)
            {
                current_time.mins = 0;
                
                current_time.hours++;
                
                if (current_time.hours == 12)
                {
                    current_time.hours = 1;
                    current_time.mins = 0;
                    current_time.secs = 0;
                    
                }//end second inner if
                
            }//end first inner if
            
        }//end outer if
        
        printf ("%d: %d: %d \n", current_time.hours, current_time.mins, current_time.secs);
        
    }//end while
    
    return 0;
    
}//end main
