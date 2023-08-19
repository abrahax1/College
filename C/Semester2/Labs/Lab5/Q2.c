/*  Program Description: program given to understand what is happening using strings
    Author: Abraham Izarra
    Date: 1 March 2020
*/

#include <stdio.h>
#include <string.h>

int main()
{
    char name[7] = {'R', 'o', 'b', 'e', 'r', 't'};
    char name2[7] = {'P', 'h', 'i', 'l', 'i', 'p'};
    int i;
    
    puts(name) ; //nothing wrong with this code
    scanf ("%s", &*(name) ); //warning is given because name is an array so it requires the dereference operator, also it will only scan one letter and stored it as the first element of the array
    strcpy(name, "Philip");//Compiles but gives an error instanstly, as the array name did not have a size defined
    *(name + 5) = 'a'; //Compiles but displays a number fixed by changing double quotes to single quotes (" to ')
    for (i = 0; i < 7; i++)
    {
        *(name + i) = *(name2 + i);
    }
    //last one does not work at all (name = "Philip") had to add a different array and a loop
    
    return 0;
}
