/*  Program Description: This program lets the user play a lotto game it has a menu and inside each option a function with the task required for each option
    Author: Abraham Izarra
    Date: 24 Feb 2020
    Compiler / OS: Xcode / macOS Catalina
*/

#include <stdio.h>
#include <stdbool.h>
#include <stdlib.h>

#define LOTTO 43
#define USER_N 6

int  Numbers_Entered (int [], int []);
void Display_Numbers_Entered (int []);
int  Sort_Numbers (int []);
void swap (int *, int *);
void  Compare_Numbers (int [], int []);
void Numbers_Frequency (int [], int[], int[]);
void Yes_No (char);
void Exit_Game (void);

int main()
{
    //Lotto_Numbers array fill with 1 to 42 for frequency, Histogram fill with 0 for frequency, User_number are entered numbers
    int Lotto_Numbers[LOTTO] = {0}, Histogram[LOTTO] = {0}, User_Numbers[USER_N], Winning_Numbers[USER_N] = {1,3,5,7,9,11};
    
    char Option = '\0';
    
    //allow stop user from entering other options without having entered their numbers
    //allow2 stop user from entering option 4 without having sorted (option 3) their numbers first
    bool allow = false, allow2 = false;
    
    while (Option != '6')
    {
        printf ("\n\n ⭐︎⭐︎⭐︎⭐︎⭐︎⭐︎⭐︎⭐︎⭐︎⭐︎⭐︎⭐︎THIS IS YOUR MENU⭐︎⭐︎⭐︎⭐︎⭐︎⭐︎⭐︎⭐︎⭐︎⭐︎⭐︎⭐︎ \n");
        printf ("Enter 1 to enter the 6 numbers (from 1 to 42) you wish to play. \n");
        printf ("Enter 2 to display the 6 numbers you have entered. \n");
        printf ("Enter 3 to sort the numbers from the smallest to largest. \n");
        printf ("Enter 4 to compare the 6 numbers you have entered with the winning numbers. \n");
        printf ("Enter 5 to print the frequency of numbers you have entered. \n");
        printf ("Enter 6 to Exit the game. \n\n");
        
        scanf ("%1s", & Option);
        
        
        switch (Option)
        {
            case ('1'):
            {
                Numbers_Entered(User_Numbers, Lotto_Numbers);
                
                printf ("\nNumbers store, please enter any of the options to continue. \n");
                
                allow = true;
                
                break;
            }
                
            case ('2'):
            {
                //error checking to stop user from selecting this option without having entered any numbers
                if (allow == false)
                {
                    printf ("\nPlease enter your 6 numbers first \n");
                    
                    break;
                }
                
                Display_Numbers_Entered(User_Numbers);
                
                break;
            }
                 
            case ('3'):
            {
                if (allow == false)
                {
                    printf ("\nPlease enter your 6 numbers first \n");
                    
                    break;
                }
                
                Sort_Numbers(User_Numbers);
                allow2 = true;
                
                break;
                
            }
            
            case ('4'):
            {
                if (allow == false)
                {
                    printf ("\nPlease enter your 6 numbers first \n");
                    
                    break;
                }
                if (allow2 == false)
                {
                    printf ("\nPlease Enter option 3 before to compare your numbers \n");
                    
                    break;
                }
                
                Compare_Numbers(User_Numbers, Winning_Numbers);
                
                break;
                
            }
                
            case ('5'):
            {
                if (allow == false)
                {
                    printf ("\nPlease enter your 6 numbers first \n");
                    
                    break;
                    
                }
                
                Numbers_Frequency(Lotto_Numbers,Histogram, User_Numbers);
                
                allow = false;
                
                break;
                
            }
            
            case ('6'):
            {
                Exit_Game();
                
                break;
            }
            
            default:
            {
                printf ("\nPlease enter a option between 1 and 6 \n");
                
            }
            
        }//end switch
        
    }//end while
    
    return 0;
    
}//end main

//function to store the numbers that the user entered
int Numbers_Entered(int User_Numbers[USER_N], int Lotto_Numbers[LOTTO])
{
    int i;
    
    printf ("\nEnter 6 numbers from 1 to 42 \n");
    
    for (i = 0; i < USER_N; i++)
    {
        scanf ("%d", & *(User_Numbers + i) );
        getchar();
        
        //statement to stop user from entering a number less than 1 or more than 42
        if (*(User_Numbers + i) <  1 || *(User_Numbers + i) > 42 )
        {
            printf ("ERRRRRROOORROORRR \nEnter Number again \n");
            
            i--;
            
        }
        
        //statement to stop user from entering the same number again
        for (int j = 0; j < i; j++)
        {
            if (*(User_Numbers + i) == *(User_Numbers + j) && i != j)
            {
                printf ("ERRRRRROOORROORRR \nCan't Enter the same number again \n");
                
                i--;
                
            }
            
        }//end inner loop
        
    }//end outer loop
    
    return Lotto_Numbers[LOTTO];
    
} //end Numbers_Entered

//function to print the numbers the user entered
void Display_Numbers_Entered (int User_Numbers [])
{
    int i;
    
    printf ("\nThe numbers you have entered are: ");
    
    for (i = 0; i < USER_N; i++)
    {
        if (i == USER_N - 1)
        {
            printf ("%d \n\n", *(User_Numbers + i) );
            
        }
        else
        {
            printf ("%d, ", *(User_Numbers + i) );
            
        }
    }
    
}//end Display_Numbers_Entered

//function to swap numbers
void swap(int *Num1, int *Num2)
{
    int temp = *Num1;
    *Num1 = *Num2;
    *Num2 = temp;
    
}//end swap

//function to sort the numbers entered by the user using Bubble Sort
int Sort_Numbers (int User_Numbers [])
{
    int i, j, Min;
    
    //move one by one the unsorted array
    for (i = 0; i < USER_N - 1; i++)
    {
        //find the minimum element in unsorted array
        Min = i;
        
        for (j = i + 1; j < USER_N; j++)
        {
            if (User_Numbers[j] < User_Numbers[Min])
            {
                Min = j;
                
            }//end if
            
        }//end inner for
        
        //Swap the found minimum element with the first element
        swap(&User_Numbers[Min], &User_Numbers[i]);
        
    }//end outer for
    
    Display_Numbers_Entered(User_Numbers);
    
    return User_Numbers[USER_N];
    
}//end Sort_Numbers

//this function compares the numbers the user had entered with the winning numbers
void Compare_Numbers (int User_Numbers[], int Winning_Numbers[])
{
    int Numbers_Right = 0, i;
    
    for (i = 0; i < USER_N; i++)
    {
        if (*(User_Numbers + i) == *(Winning_Numbers + i) )
        {
            Numbers_Right++;
            
        }
        
    }
    
    if (Numbers_Right == 0 || Numbers_Right == 1 || Numbers_Right == 2)
    {
        printf ("\nYou got Nothing Better Luck Next Time \n");
        
    }
    if (Numbers_Right == 3)
    {
        printf ("\nYou got a Cinema Pass :) \n");
        
    }
    if (Numbers_Right == 4)
    {
        printf ("\nYou got a Weekend Away :) \n");
        
    }
    if (Numbers_Right == 5)
    {
        printf ("\nYou got a New Car :) \n");
        
    }
    if (Numbers_Right == 6)
    {
        printf ("\nYOU WIN THE LOTTERY!!!!! \n");
        
    }
    
}//end Compare_Numbers

//this function shows the Frequency of the numbers entered by the user
void Numbers_Frequency (int Lotto_Numbers[],int Histogram[], int User_Numbers[])
{
    int i;
    
     //fills array with numbers from 1 to 42
     for (i = 1; i < LOTTO; i++)
     {
         *(Lotto_Numbers + i) = i;
         
     }
    
    for (i = 0; i < USER_N; i++)
       {
            *(Histogram + *(User_Numbers + i) ) = *(Histogram + *(User_Numbers + i) ) + 1;
           
       }
    
     for (i = 1; i < LOTTO; i++)
    {
    
        if (*(Histogram + i) > 1)
        {
            printf ("Number %d was used %d times \n", *(Lotto_Numbers + i), *(Histogram + i) );
            
        }
        if (*(Histogram + i) == 1 )
        {
            printf ("Number %d was used %d time \n", *(Lotto_Numbers + i), *(Histogram + i) );
            
        }
        
    }
    
}//end Numbers_Frequency

//This function will stop the user from entering a character that is not N,n,Y,y
void Yes_No (char Option2)
{
    //Problem when saying no and entering numbers again FIX
    int i;
    
    for (i = 0; i < 10; i++)
    {
        if (Option2 == 'Y' || Option2 == 'y' || Option2 == 'N' || Option2 == 'n')
        {
            i = 10;
            
            switch (Option2)
            {
                case 'Y':
                case 'y':
                {
                    printf ("\nThank You For Playing :) \n\n");
                    
                    exit(0);
                    
                    break;
                    
                }
                
                case 'N':
                case 'n':
                {
                    printf ("\nGood Luck :) \n");
                    
                    break;
                    
                }
                
            }//end inner switch
            
        }//end if
        else
        {
            printf ("\nPlease enter N or Y \n");
            
            scanf ("%1s", & Option2);
            
        }
        
    }//end for
            
}//end Yes_No
        

//this function ask the user if they want to exit the game or not
void Exit_Game (void)
{
    char Option2;
    
    printf ("Are you sure you want to exit the game? \n");
    printf ("Enter \"N\" to continue playing or \"Y\" to exit the game \n");
    
    scanf ("%1s", & Option2);
    
    switch (Option2)
    {
        case 'Y':
        case 'y':
        {
            printf ("\nThank You For Playing :) \n\n");
            
            exit(0);
            
            break;
            
        }
        
        case 'N':
        case 'n':
        {
            printf ("\nGood Luck :) \n");
            
            break;
            
        }
        
        default:
        {
            Yes_No(Option2);
            
        }
        
    }
        
}//end Exit_game
