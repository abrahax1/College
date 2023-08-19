/*  Program Description: this program contains different structures 
    Author: Abraham Izarra
    Date: 25 mar 2020
*/

#define SIZE 20

struct Cards
{
    char Card[SIZE];
    
};//end cards

#define SIZE2 20

struct Stock_Record
{
    int stock_number;
    char stock_description[SIZE2];
    int stock_quantity;
    
};//end Stock_Record

#define SIZE3 13
#define SIZE4 30
#define SIZE5 25

struct Book_Record
{
    char ISBN[SIZE3], book_title[SIZE4], book_author[SIZE5];
    
    float book_price;
    
};//end Book_Record

#define SIZE6 25
#define SIZE7 45

struct Customer_Record
{
    unsigned int customer_number;
    
    char customer_name[SIZE6], customer_address[SIZE7];
    
    double outstanding_balance;
    
};//end Customer_Record

#define SIZE8 3

struct Transaction_Record
{
    char transaction_type;
    
    int transaction_date[SIZE8];
    
    float transaction_amount;
    
};//end Transaction_Record

#define SIZE9 2

struct time_of_date
{
    int hours[2], minutes[SIZE9], seconds[SIZE9];
    
    char am_pm[SIZE9];
    
};//end time_of_date

struct Geographical_Position
{
    int degrees, minutes;
    
    char direction_N_S_E_W;
    
};//end Geographical_Position

#define SIZE10 20

struct League_Teams
{
    char team_name[SIZE10];
    
    int home_number_of_wins, home_number_of_draws, home_number_of_losses;
    int away_number_of_wins, away_number_of_draws, away_number_of_losses;
    
};//end League_Teams

#include <stdio.h>

int main()
{
    
    return 0;
}
