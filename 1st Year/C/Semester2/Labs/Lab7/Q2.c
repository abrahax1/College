/*  Program Description: This program finds the occurrences of a word (or more) in a sentence
    Author: Abraham Izarra
    Date: 24 Mar 2020
*/

#include <stdio.h>
#include <string.h>

#define SIZE 100

int count_occurrences(char * str, char * toSearch);

int main()
{
    char Sentece[SIZE];
    char Word[SIZE];
    int count;

    printf("Enter sentence: \n");
    
    gets(Sentece);
    
    printf("Enter word to search occurrences: ");
    
    gets(Word);

    count = count_occurrences(Sentece, Word);

    printf("Total occurrences of '%s': %d \n\n", Word, count);

    return 0;
    
}//end main

//this function gets the total number of occurrences of a word in a sentence
int count_occurrences(char * str, char * toSearch)
{
    int i, j, found, count;
    long stringLen, searchLen;

    stringLen = strlen(str);      // length of sentence
    searchLen = strlen(toSearch); // length of word to be searched

    count = 0;

    for(i = 0; i <= stringLen - searchLen; i++)
    {
        //Match word with string
        found = 1;
        
        for(j = 0; j < searchLen; j++)
        {
            if(str[i + j] != toSearch[j])
            {
                found = 0;
                break;
            }
            
        }
        
        if(found == 1)
        {
            count++;
        }
        
    }
    
    return count;
    
}//end count_occurrences
