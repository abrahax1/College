/*  Program Description: this program uses structures and ask the user to enter values to the members of the structure.
    Author: Abraham Izarra
    Date: 25 mar 2020
*/

struct stock_record
{
    int no;
    char description[21];
    float price;
    int qty;
    
};//end stock_record

#include <stdio.h>

int main()
{
    //assign value to items
    struct stock_record stock_item1 = {01, "Candy", 24, 50};
    
    struct stock_record stock_item2;
    
    //ask user to enter values for items
    printf ("Enter a number for stock records: ");
    
    scanf ("%d", & stock_item2.no);
    
    printf ("\nEnter a description for stock records: ");
    
    scanf ("%s", & *(stock_item2.description) );
    
    printf ("\nEnter a price for stock records: ");
    
    scanf ("%f", & stock_item2.price);
    
    printf ("\nEnter a quantity for stock records: ");
    
    scanf ("%d", & stock_item2.qty);
    
    //print the values inside items
    printf ("\nItem number: %d \nDescription: %s \nPrice: %.2f \nQuantity %d \n\n\n", stock_item1.no, stock_item1.description, stock_item1.price, stock_item1.qty);
    
     printf ("Item number: %d \nDescription: %s \nPrice: %.2f \nQuantity %d \n\n", stock_item2.no, stock_item2.description, stock_item2.price, stock_item2.qty);
    
    
    return 0;
    
}//end main

