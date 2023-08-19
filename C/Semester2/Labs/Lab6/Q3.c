/*  Program Description: This program
   Author: Abraham Izarra
   Date: 5 March 2020
*/

#include <stdio.h>
#include <string.h>

#define SIZE 1000

char Frequency (char[]);
void Calculate (void);
char Join (char);

int main()
{
    char Sentence[SIZE];
    int  Counter = 0;
    
    printf ("Enter your sentence \n\n");
    
    gets(Sentence);
    
    Counter = Frequency(Sentence);
    
    printf ("Amount of times the word \"is\" was in the sentence was %d \n\n", Counter);
    
    return 0;
    
}//end main

//function to calculate the frequency of the word "is" in the sentence entered
//also calculates the length of the sentence
char Frequency (char Sentence[])
{
    int  Counter = 0;
    char Word[3] = {"is"};
    long Length = strlen(Sentence);

    if (strcmp (Sentence, Word) == 0)
    {
        Counter++;
    }
    
    printf ("Length of the array was %ld \n", Length);
    
    return Counter;
    
}
