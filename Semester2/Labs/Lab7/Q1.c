/*  Program Description: This program uses different functions (a)count number of times a vowel occurs in a sentence / (b) find the number of characters and displays them in reverse order / (c) joins two string together
    Author: Abraham Izarra
    Date: 24 Mar 2020
*/

void count_number_of_Vowels (char[]);
void number_of_characters_AND_reverse_order (char[]);
void concatenate_strings (char[],char[]);

#include <stdio.h>
#include <string.h>

#define SIZE 100

int main()
{
    char Words[SIZE];
    char sentence[40] = "I entered the string: ";
    
    printf ("Enter a sentence please \n");
    
    gets(Words);
    
    count_number_of_Vowels(Words);
    
    number_of_characters_AND_reverse_order(Words);
    
    concatenate_strings(Words, sentence);
    
    return 0;
    
}//end main

//this function counts the number of vowels in a sentence
void count_number_of_Vowels (char Words[])
{
    int Vowels = 0;
    long length;
    
    length = strlen(Words);
    
    for (int i = 0; i < length; i++)
    {
        switch (Words[i])
        {
            case ('a'):
            case ('A'):
            {
                Vowels++;
                
                break;
            }
            case ('e'):
            case ('E'):
            {
                Vowels++;
                
                break;
            }
            case ('i'):
            case ('I'):
            {
                Vowels++;
                
                break;
            }
            case ('o'):
            case ('O'):
            {
                Vowels++;
                
                break;
            }
            case ('u'):
            case ('U'):
            {
                Vowels++;
                
                break;
            }
                
        }//end switch
        
    }//end for
    
    printf ("There were %d vowels in the sentence \n", Vowels);
    
}//end count_number_of_Vowels

//this function finds the number of characters in a sentence and then reverses the order of the string
void number_of_characters_AND_reverse_order (char Words[])
{
    long length;
    
    length = strlen(Words);
    
    for (long i = length; i >= 0; i--)
    {
        printf ("%c", Words[i]);
        
    }
    
    printf ("\n");
    
}//end number_of_characters_AND_reverse_order

//this function joins two strings together and displays them
void concatenate_strings (char Words[], char sentence[])
{
    strcat(sentence, Words);
    
    puts (sentence);
    
}// end concatenate_strings
