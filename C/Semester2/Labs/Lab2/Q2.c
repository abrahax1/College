/*      Description: this program uses a function with two parameters, (char and int) the char will be displayed the amount of times the int eg: (*, 4) will display ****
        date: 6 feb 2020
        Author: Abraham Izarra
*/


#include <stdio.h>

void Number_Char (char, int);

int main()
{
    char My_character;
    int Number;
    
    printf ("Enter a character you would like to see display \n");
    
    scanf("%1s", & My_character);
    
    printf ("Enter the amount of times you want the character to be diplayed \n");
    
    scanf("%d", & Number);
    
    //call function
    Number_Char(My_character, Number);
    
    return 0;
    
}//end main

//implement function to print characters using loop
void Number_Char (char character, int Number)
{

    int i;
    
    for (i = 0; i < Number; i++)
    {
        printf ("%c", character);
        
    }
    
    printf ("\n\n");
    
} //end No_char

