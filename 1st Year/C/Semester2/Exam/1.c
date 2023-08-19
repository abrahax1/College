/*  Program Description: This program is menu-driven and inside each option there are functions to complete what was asked of in the option: 1st option ask the user if they want to enter a code or generate one autiomatically, 2nd option encrypts the code previously entered, 3rd option checks if the encrypted code matches the access_code, 4th option decrypts the code, 5th option displays the frequency of correct/incorrect times the code was entered and 6th option exits the program and ask if they are sure to do so.
    Author: Abraham Izarra/ C19340801
    Date: 21 April 2020
    Lecturer: Michael Collins
    OS / Compiler: macOS Catalina / Xcode
*/

struct code_counter{
    
    int correct_code;
    int incorrect_code;
    
};

#include <stdio.h>
#include <stdbool.h>
#include <time.h>
#include <stdlib.h>

#define SIZE 4
#define SIZE_i 10

int Numbers_Entered(int *);
int Encrypt_Code(int *);
int Compare_Codes(int *, int *, int *);
void Decrypt_Code(int *);
void Frequency_Correct_Incorrect(int *, int *);
void Yes_No (char *);
void Exit_Program (void);

int main()
{
    struct code_counter Correct, Incorrect;
    
    int Code_Entered[SIZE];
    
    char Option = '\0';
    
    bool allow = false, allow2 = true, allow3 = true, allow4 = false , allow5 = false;
    
    while (Option != '6')
    {
        printf ("\n\n       THIS IS YOUR MENU \n");
        printf ("Enter 1 to enter a code or generate random code. \n");
        printf ("Enter 2 to encrypt the code. \n");
        printf ("Enter 3 to check if the encrypted code matches the authorised access code. \n");
        printf ("Enter 4 to decrypt the code. \n");
        printf ("Enter 5 to display the number of times the encrypted code is correct or wrong. \n");
        printf ("Enter 6 to exit the program. \n\n");
        
        scanf ("%1s", & Option);
        
        getchar();
        
        switch (Option)
        {
            case ('1'):
            {
                Numbers_Entered(&Code_Entered[SIZE]);
                
                allow = true;
                allow2 = true;
                allow3 = true;
                allow4 = true;
                
                break;
                
            }//end generation(user or random) of code
            
            case ('2'):
            {
                //stop user from selecting this option without having entered or generated their code
                if (allow == false)
                {
                    printf ("\nPlease enter your code first \n");
                    
                    break;
                    
                }
                
                //stop user from encrypting their code for a second time in the same code
                if (allow2 == true)
                {
                    Encrypt_Code(&Code_Entered[SIZE]);
                    
                    allow2 = false;
                    allow5 = true;
                    
                    break;
                    
                }
                else
                {
                    printf ("You have already encrypted this code \n");
                    
                    break;
                    
                }
                
                break;
                
            }//end encryption of code
                
            case ('3'):
            {
                //stop user from selecting this option without having entered or generated their code
                if (allow == false)
                {
                    printf ("\nPlease enter your code first \n");
                    
                    break;
                }
                
                //stop user from selecting this option without having encrypted their code
                if (allow2 == true)
                {
                    printf ("\nPlease encrypt your code first \n");
                    
                    break;
                }
                
                //stops user from comparing codes multiple times in order to not get more correct/incorrect counter
                if (allow5 == true)
                {
                    Compare_Codes(&Code_Entered[SIZE], &Correct.correct_code, &Incorrect.incorrect_code);
                    
                    allow5 = false;
                    
                    break;
                    
                }
                
                printf ("You have already compared this code \n");
                
                break;
                
            }//end Comparison of code
      
            case ('4'):
            {
                //stop user from selecting this option without having entered or generated their code
                if (allow == false)
                {
                    printf ("\nPlease enter your code first \n");
                    
                    break;
                    
                }
                
                //stop user from selecting this option without having encrypted their code
                if (allow2 == true)
                {
                    printf ("\nPlease encrypt your code first \n");
                    
                    break;
                    
                }
                
                //stop user from decrypting their code for a second time in the same code
                if (allow3 == true)
                {
                    Decrypt_Code(&Code_Entered[SIZE] );
                    
                    allow3 = false;
                    
                    break;
                }
                else
                {
                    printf ("You have already decrypted this code \n");
                    
                    break;
                    
                }
                
                break;
                
            }//end decryption of code
                
            case ('5'):
            {
                //stop user from selecting this option without having entered or generated their code
                if (allow == false)
                {
                    printf ("\nPlease enter your code first \n");
                    
                    break;
                    
                }
                
                //stop user from selecting this option without having encrypted their code
                if (allow2 == true)
                {
                    printf ("\nPlease check if the codes are the same first \n");
                    
                    break;
                    
                }
                
                if (allow4 == true)
                {
                    Frequency_Correct_Incorrect(&Correct.correct_code, &Incorrect.incorrect_code);
                    
                    break;
                    
                }
                
                break;
                
            }//end display frequency of correct/incorrect
       
            case ('6'):
            {
                Exit_Program();
                
                break;
                
            }//end exit
            
            default:
            {
                printf ("\nPlease enter a option between 1 and 6 \n");
                
            }//end error checking
            
        }//end switch
        
    }//end while
    
    return 0;
    
}//end main

//function to store the code that the user entered or generate numbers randomly and error checking
int Numbers_Entered(int *Code_Entered)
{
    int option, i = 0;
    
    printf ("\nEnter 1 to enter code or 2 to generate a random code? \n");
    
    scanf ("%d", &option);
    
    getchar();
    
    switch (option)
    {
        case (1):
        {
            printf ("\nEnter 4 numbers from 0 to 9 \n");
            
            for (i = 0; i < SIZE; i++)
            {
                scanf ("%d", (Code_Entered + i) );
                
                getchar();
                
                //to stop user from entering a number less than 0 or more than 9
                if ( *(Code_Entered + i) <  0 || *(Code_Entered + i) > 9 )
                {
                    printf ("Error, Enter Number again \n");
                    
                    i--;
                    
                }
                
            }//end loop
            
            printf ("Your code is: ");
            
            //displays the code
            for (int i = 0; i < SIZE; i++)
            {
                printf ("%d", *(Code_Entered + i) );
                
            }
            
            printf ("\nCode store, please enter any of the options to continue. \n");
            
            break;
            
        }//end case to let user enter code
        
        case (2):
        {
            printf ("\nGenerating code, Please wait \n");
            
            //this is the random number generator, uses time to let numbers change, uses casting as time is a long and i needed an int
            srand ((int) time (0) );
            
            for (i = 0; i < SIZE; i++)
            {
                *(Code_Entered + i) = rand() % 9 + 1;
                
            }//end outer loop
            
            printf ("Code generated, Your code is: ");
            
            //displays the code randomly generated
            for (int i = 0; i < SIZE; i++)
            {
                printf ("%d", *(Code_Entered + i) );
                
            }
            
            break;
            
        }
        
        default:
        {
            Numbers_Entered(& *(Code_Entered) );
            
        }
        
    }//end switch to enter code or generate code randomly
    
    return *Code_Entered;
    
} //end Numbers_Entered

//this function encrypts the code previously entered or generated
int Encrypt_Code (int *Code_Entered)
{
    int swap = *(Code_Entered + 0);
    int swap2 = *(Code_Entered + 1);
    
    //swap 1st and 3rd number
    *(Code_Entered + 0) = *(Code_Entered + 2);
    *(Code_Entered + 2) = swap;
    
    //swap 2nd and 4th number
    *(Code_Entered + 1) = *(Code_Entered + 3);
    *(Code_Entered + 3) = swap2;
    
    //add 1 to each number
    for (int i = 0; i < SIZE; i++)
    {
        *(Code_Entered + i) = *(Code_Entered + i) + 1;
        
        //changes number from more than 9 to 0
        if ( *(Code_Entered + i) > 9)
        {
            *(Code_Entered + i) = 0;
            
        }
        
    }//end loop
    
    printf ("Your encrypted code is: ");
    
    //display encrypted code
    for (int i = 0; i < SIZE; i++)
    {
        printf ("%d", *(Code_Entered + i) );
        
    }
    
    return *Code_Entered;
    
}//end Encrypt_Code

//this function Compares the code entered by the user and the fixed access code it also increases the frequency of times the user entered their password correctly or incorrectly
int Compare_Codes(int *Code_Entered, int *Correct, int *Incorrect)
{
    int access_code[SIZE] = {4,5,2,3};
    int Matching_Num = 0;
    
    for (int i = 0; i < SIZE; i++)
    {
        //compare codes
        if (*(Code_Entered + i) == *(access_code + i) )
        {
            Matching_Num = Matching_Num + 1;
            
        }
        
    }//end loop
    
    //keeps count of correct and incorrect attempts
    if (Matching_Num == 4)
    {
        printf ("Correct Code Entered \n");
        
        *Correct = *(Correct) + 1;
        
        return *Correct;
        
    }
    else
    {
        printf ("Wrong Code Entered \n");
        
        *Incorrect = *(Incorrect) + 1;
        
        return *Incorrect;
        
    }
    
}//end Compare_Codes

//this function Decrypts the code entered by the user or generated randomly
void Decrypt_Code (int *Code_Entered)
{
    int i;
    
    //substracts 1 to each number
    for (i = 0; i < SIZE; i++)
    {
        *(Code_Entered + i) = *(Code_Entered + i) - 1;
        
        //changes number from less than 0 to 9
        if ( *(Code_Entered + i) < 0)
        {
            *(Code_Entered + i) = 9;
            
        }
        
    }
    
    int swap = *(Code_Entered + 0);
    int swap2 = *(Code_Entered + 1);
    
    //swap 1st and 3rd number
    *(Code_Entered + 0) = *(Code_Entered + 2);
    *(Code_Entered + 2) = swap;
    
    //swap 2nd and 4th number
    *(Code_Entered + 1) = *(Code_Entered + 3);
    *(Code_Entered + 3) = swap2;
    
    printf ("Your decrypted code is: ");
    
    //display the code
    for (i = 0; i < SIZE; i++)
    {
        printf ("%d", *(Code_Entered + i) );
        
    }
    
}//end Decrypt_Code

//this function displays the frequency of correct times and incorrect times the user entered their code
void Frequency_Correct_Incorrect (int *Correct, int *Incorrect)
{
    if (*Correct > 0 || *Incorrect > 0)
    {
        printf ("Number of times password was entered Correct: %d \n", *Correct);
        printf ("Number of times password was entered Incorrect: %d \n", *Incorrect);
        
    }
    else
    {
        printf ("Please check if the code are the same \n");
        
    }
    
}//end Frequency_Correct_Incorrect

//This function will stop the user from entering a character that is not N,n,Y,y
void Yes_No (char *Option2)
{
    for (int i = 0; i < SIZE_i; i++)
    {
        if (*Option2 == 'Y' || *Option2 == 'y' || *Option2 == 'N' || *Option2 == 'n')
        {
            i = SIZE_i;
            
            switch (*Option2)
            {
                case 'Y':
                case 'y':
                {
                    printf ("\nThank You \n\n");
                    
                    exit(0);
                    
                    break;
                    
                }
                
                case 'N':
                case 'n':
                {
                    printf ("\nGoing back to menu \n");
                    
                    break;
                    
                }
                
            }//end inner switch
            
        }//end if
        else
        {
            printf ("\nPlease enter N or Y \n");
            
            scanf ("%1s", Option2);
            
            getchar();
            
        }
        
    }//end for
    
}//end Yes_No
        
//this function ask the user if they want to exit the game or not
void Exit_Program (void)
{
    char Option2 = '\0';
    
    printf ("Are you sure you want to exit the program? \n");
    printf ("Enter \"N\" to continue the program or \"Y\" to exit the program \n");
    
    scanf ("%1s", & (Option2) );
    
    getchar();
    
    switch (Option2)
    {
        case 'Y':
        case 'y':
        {
            printf ("\nThank You \n\n");
            
            exit(0);
            
            break;
            
        }
        
        case 'N':
        case 'n':
        {
            printf ("\nGoing back to menu \n");
            
            break;
            
        }
        
        default:
        {
            Yes_No(&Option2);
            
        }
        
    }//end switch
    
}//end Exit_Program


