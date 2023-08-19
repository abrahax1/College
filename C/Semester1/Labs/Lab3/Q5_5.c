/*      Program Description: this program ask for the user age and then displays the amount of heart beats for the user life
        Author: Abraham Izarra
        Date: 9 oct 2019
*/

#include <stdio.h>

int main()

{

    int Age,
        BPM = 75,
        amount_of_heartbeats_in_a_lifetime,
        age_in_minutes;
        
    printf ("Enter your age \n");
    
    scanf ("%d", & Age);
    
    age_in_minutes = Age * 365 * 1440;
    amount_of_heartbeats_in_a_lifetime = age_in_minutes / BPM;
    
    printf ("Your BPM in a lifetime is %d \n",amount_of_heartbeats_in_a_lifetime);
    
    return 0;
    
}
