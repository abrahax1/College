/*  Program Description: This program
    Author: Abraham Izarra
    Date: 25 mar 2020
*/

#define SIZE 20

struct DOB
{
    int date, month, year;
    
};//end DOB

struct Data_of_Person_INTEGERS
{
    int height, weight;
    
    struct DOB date_of_birth;
    
};//end Data_of_Person_INTEGERS

struct Data_of_Person_CHARACTERS
{
    char firstname[SIZE], surname[SIZE], eye_colour[SIZE], country_of_citezenship[SIZE];
    
    struct Data_of_Person_INTEGERS Integers;
    
};//end Data_of_Person_CHARACTERS

#include <stdio.h>
#include <string.h>

int main()
{
    struct Data_of_Person_CHARACTERS Person1, Person2;
    
    //enter data
    printf ("Enter First name: ");
    scanf ("%s", Person1.firstname);
    
    printf ("\nEnter Surname: ");
    scanf ("%s", Person1.surname);
    
    printf ("\nEnter Date of birth: ");
    scanf ("%d", &Person1.Integers.date_of_birth.date);
    
    printf ("\nEnter Month of birth: ");
    scanf ("%d", &Person1.Integers.date_of_birth.month);
    
    printf ("\nEnter Year of birth: ");
    scanf ("%d", &Person1.Integers.date_of_birth.year);
    
    printf ("\nEnter Height: ");
    scanf ("%d", &Person1.Integers.height);
    
    printf ("\nEnter Weight: ");
    scanf ("%d", &Person1.Integers.weight);
    
    printf ("\nEnter Eye Colour: ");
    scanf ("%s", Person1.eye_colour);
    
    printf ("\nEnter Country of Citizenship: ");
    scanf ("%s", Person1.country_of_citezenship);
    
    //display the data for person1
    printf ("\n\nFirstname: %s \nSurname: %s \nDate of Birth: %d/%d/%d \nHeight: %d \nWeight: %d \nEye Colour: %s \nCountry of Citizenship: %s \n\n", Person1.firstname, Person1.surname, Person1.Integers.date_of_birth.date, Person1.Integers.date_of_birth.month, Person1.Integers.date_of_birth.year, Person1.Integers.height, Person1.Integers.weight, Person1.eye_colour, Person1.country_of_citezenship);
    
    //copy data from person1 to person2
    strcpy(Person2.firstname, Person1.firstname);
    strcpy(Person2.surname, Person1.surname);
    Person2.Integers.date_of_birth.date = Person1.Integers.date_of_birth.date;
    Person2.Integers.date_of_birth.month = Person1.Integers.date_of_birth.month;
    Person2.Integers.date_of_birth.year = Person1.Integers.date_of_birth.year;
    Person2.Integers.height = Person1.Integers.height;
    Person2.Integers.weight = Person1.Integers.weight;
    strcpy(Person2.eye_colour, Person1.eye_colour);
    strcpy(Person2.country_of_citezenship, Person1.country_of_citezenship);
    
    //change data for person2
    char *ptr1 = Person2.firstname;
    char *ptr2 = Person2.surname;
    char *ptr3 = Person2.eye_colour;
    char *ptr4 = Person2.country_of_citezenship;
    char *ptr5 = Person2.Integers.height;
    char *ptr6 = Person2.Integers.weight;
    char *ptr7 = Person2.Integers.date_of_birth.date;
    char *ptr8 = Person2.Integers.date_of_birth.month;
    char *ptr9 = Person2.Integers.date_of_birth.year;
    
    ptr1 = "Dolores";
    
    struct Data_of_Person_CHARACTERS Person3 = {"Dolores", "Delano","Brown", "Ireland", 170, 60, 20, 6, 1999};
    
    //display new data for person2
        printf ("\n\nFirstname: %s \nSurname: %s \nDate of Birth: %d/%d/%d \nHeight: %d \nWeight: %d \nEye Colour: %s \nCountry of Citizenship: %s \n\n", Person3.firstname, Person3.surname, Person3.Integers.date_of_birth.date, Person3.Integers.date_of_birth.month, Person3.Integers.date_of_birth.year, Person3.Integers.height, Person3.Integers.weight, Person3.eye_colour, Person3.country_of_citezenship);
    
    printf ("TEST TEST %s", ptr1 );
    return 0;
}
