/*      Program Description: this program ask the user for a character and displays a message saying if the character is a vowel or not
        Author: Abraham Izarra
        Date: 14 oct 2019
*/

#include <stdio.h>

int main()

{
    
    char any_char;
    
    printf ("Enter a character \n");
    
    scanf ("%1s", & any_char);
    
    switch (any_char)
     
        //start switch
    {
        case 'a':
        {
            printf ("you entered a lowercase vowel \n");
            
            break;
        }
        
        case 'A':
        {
            printf ("you entered a vowel \n");
            
            break;
        }
        
        case 'e':
        {
            printf ("you entered a vowel \n");
            
            break;
        }
            
        case 'E':
        {
            printf ("you entered a vowel \n");
                       
                       break;
        }
        
        case 'i':
        {
            printf ("you entered a vowel \n");
            
            break;
        }
            
        case 'I':
        {
            printf ("you entered a vowel \n");
                       
                       break;
        }
        
        case 'o':
        {
            printf ("you entered a vowel \n");
            
            break;
        }
            
        case 'O':
        {
            printf ("you entered a vowel \n");
                       
                       break;
        }
        
        case 'u':
        {
            printf ("you entered a vowel \n");
            
            break;
        }
            
        case 'U':
        {
            printf ("you entered a vowel \n");
            
            break;
            
        } //end switch
        
    return 0;
            
} //end main
