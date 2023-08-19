/*  Program Description: This program repeates until f is typed, the user will have to input either e or d to enter 3 amounts and then change those amounts to the other currency
    Date: 20 Feb 2020
    Author: Abraham Izarra
    Compiler / OS: Xcode / macOS Catalina
*/

#include <stdio.h>
#define AMOUNTS 3

float change_to_Euro(float[]); //converts US Dollars into Euro
float change_to_Dollar(float[]);//converts Euro into US Dollars

int main()
{
    char Currency;
    float amounts[AMOUNTS];
    int i;
    float Conversion = 0;
    float Average = 0;

    printf ("Enter E for Euro or D for US Dollar \n");
    printf ("If you wish to finish the Program enter F \n");
    
    scanf ("%1s", &Currency);

    switch (Currency)
    {
        case ('E'):
        case ('e'):
        {
            printf ("Enter 3 amounts \n");
            
            for (i = 0; i < AMOUNTS; i++)
            {
                scanf("%f", &(*(amounts + i)) );
                    
            }
            
            Average = change_to_Dollar(amounts);
            
            
        }//ends Euro
            
        case ('D'):
        case ('d'):
        {
            printf ("Enter 3 amounts \n");
            
            for (i = 0; i < AMOUNTS; i++)
            {
                scanf("%f", & *(amounts + i) );
                
            }
            
            Average = change_to_Euro(amounts);
            
            
        }//ends Dollar
            
        case('F'):
        case('f'):
        {
            break;
            
        } //ends program
            
    }//end switch
        
    printf ("Your average is %.2f \n", Average);
    
    return 0;
    
}// end main

//start function Dollar
float change_to_Dollar(float amounts[])
{
    int i;
    float conversion[AMOUNTS];
    float Average = 0;
    
    
    
    for (i = 0; i < AMOUNTS; i++)
    {
        Average = Average + amounts[i];
        Average = Average / 3;
        
        conversion[i] = (amounts[i]);
        
        conversion[i] = conversion[i] + .19;
        
        printf ("%.2f %.2f \n", amounts[i], *conversion);
        
    }
    
    return Average;
}//end change_to_Dollar

//start Function Euro
float change_to_Euro(float amounts[])
{
    int i;
    float conversion[AMOUNTS];
    float Average = 0;
    
    
    
    for (i = 0; i < AMOUNTS; i++)
    {
        Average = Average + amounts[i];
        Average = Average / 3;
        
        conversion[i] = (amounts[i]);
        
        conversion[i] = conversion[i] - .16;
        
        printf ("%.2f %.2f \n", amounts[i], *conversion);
        
        
        
    }

    
    return Average;

}//end change_to_Euro
