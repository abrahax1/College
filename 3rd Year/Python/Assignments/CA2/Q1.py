# Program to simulate a shopping website, with customer creation, shopping cart (add/remove items) and pay
# Author: Abraham Izarra
# Date: 7 Dec 2020

# Class to create customer
class CreateCustomer(object):
    def __init__(self, customer_f_name='test\n', customer_s_name='test'):
        self.customer_f_name = customer_f_name
        self.customer_s_name = customer_s_name

    def __str__(self):
        return self


# function to open, read and write file that will store customer names and surnames (login)
def open_close_file(new_doc, customer_f_name, customer_s_name):
    file = open("Customers.txt", "a+")
    file2 = open("Customers.txt")
    new_doc2 = ''

    # Store file as a list
    for lines in file2:
        new_doc += [lines]

    # split new doc2 word by words
    new_doc2 = new_doc2.join(new_doc)
    new_doc2 = new_doc2.split()

    # check for name, surname in file, returns 1 for loyal customer
    if customer_f_name in new_doc2 and customer_s_name in new_doc2:
        file.close()
        return 1

    else:

        # Error checking with registration of new customer
        while True:
            choice = input('Would you like to register?, Enter "Y" or "N" ')

            # writes customer name and surname into txt file and returns 2 for bargain hunter customer
            if choice == 'Y' or choice == 'y':
                file.write('\nCustomer firstname: {} \nCustomer surname: {} \n'
                           .format(customer_f_name, customer_s_name))
                print('\nCustomer account registered')
                file.close()
                return 2

            # returns 3 for normal customer
            if choice == 'N' or choice == 'n':
                file.close()
                return 3

            else:
                print('\nWrong input, Please enter option again \n')


# subclass of CreateCustomer, a customer will be loyal if their name is on the file created in the lines above
class LoyalCustomer(CreateCustomer):
    def __init__(self, loyal_customer, customer_s_name, customer_f_name):
        super().__init__(customer_s_name, customer_f_name)
        self.loyal_customer = loyal_customer

    def __str__(self):
        return f'\nWelcome Back! {self.customer_f_name} {self.customer_s_name}'


# subclass of CreateCustomer, a customer will be a bargain hunter if they decided to register on the lines above
class BargainHunter(CreateCustomer):
    def __init__(self, bargain_hunter, customer_s_name, customer_f_name):
        super().__init__(customer_s_name, customer_f_name)
        self.bargain_hunter = bargain_hunter

    def __str__(self):
        return 'Welcome to Amazone'


# Class to define what items are listed to add to the shopping cart, depends if user is loyal, bargain hunter or none
# I used this class to display the items in the shop
class ItemList(object):
    def __init__(self, list_of_products='Shoes, Shirts, Jeans, Laptop, Phone, Tablet', loyal_or_bargain=None,
                 update_list=None):
        self.not_registered_list = list_of_products
        self.not_registered_list = {'Shoes': 60, 'Shirts': 10, 'Jeans': 25}
        self.loyal_list = {'Laptop': 600, 'Phone': 300, 'Tablet': 400, 'Desk': 80, 'Kitchen': 200, 'Dishwasher': 150}
        self.bargain_hunter_list = {'Desk': 80, 'Kitchen': 200, 'Dishwasher': 150}
        self.loyal_or_bargain = loyal_or_bargain
        self.update_list = update_list

        # 1 is for loyal customers, this will add all items to what they can add to the basket
        if self.loyal_or_bargain == 1:
            self.not_registered_list.update(self.loyal_list)

        # 2 is for bargain hunter customers, this will add some items to what they can add to the basket
        elif self.loyal_or_bargain == 2:
            self.not_registered_list.update(self.bargain_hunter_list)

        # 3 is for normal customers (not registered), this will have basic items to what they can add to the basket
        elif self.loyal_or_bargain == 3:
            pass

    def __str__(self):
        return f'{self.not_registered_list}'


# Subclass of ItemList, it defines the removal and addition of items to shopping cart
# uses a menu to choose if you want to add, remove or exit
# and then uses a second menu to ask what items you want to add, remove or exit
class AddRemoveItems(ItemList):
    def __init__(self, list_of_products=None, shopping_cart=None, update_list=None):
        super().__init__(list_of_products)
        self.shopping_cart = shopping_cart
        self.shopping_cart = {}
        self.update_list = update_list

        # I re-did this part because the .update from Itemlist Class was not working correctly

        # 1 is for loyal customers, this will add all items to what they can add to the basket
        if self.update_list == 1:
            self.not_registered_list.update(self.loyal_list)

        # 2 is for bargain hunter customers, this will add some items to what they can add to the basket
        elif self.update_list == 2:
            self.not_registered_list.update(self.bargain_hunter_list)

        # 3 is for normal customers (not registered), this will have basic items to what they can add to the basket
        elif self.update_list == 3:
            pass

        # Loop for error checking and enter 1st menu (asks if user wants to add, remove or exit)
        while True:
            choice = input('Enter (A) to Add or (R) to Remove items (E) to Exit: ')

            # enters second menu (ask user what they want to add from shown list)
            if choice == 'A' or choice == 'a':
                # loop for error checking (if item is in the list to add)
                while True:
                    item_choice = input('\nWhat item would you like to add? \n{}: '.format(list_of_products))
                    capitalise_choice = item_choice.capitalize()

                    if capitalise_choice == 'Exit' or capitalise_choice == 'e' or capitalise_choice == 'E':
                        break

                    # Add item to shopping cart
                    else:
                        if capitalise_choice in self.not_registered_list:
                            self.shopping_cart[capitalise_choice] = self.not_registered_list[capitalise_choice]
                            print('\nItem added \nIf you wish to stop adding items, enter "Exit"')

                        else:
                            print('\nItem not found, Please enter item again')

            # enters second menu (ask user what they want to remove from shown list)
            elif choice == 'R' or choice == 'r':
                if self.shopping_cart == {}:
                    print('\nThere is no items to remove\n')

                else:
                    while True:
                        item_choice = input('\nWhat item would you like to remove? \n{}: '.format(self.shopping_cart))
                        capitalise_choice = item_choice.capitalize()

                        if capitalise_choice == 'Exit' or capitalise_choice == 'e' or capitalise_choice == 'E':
                            break

                        # Remove item from shopping cart
                        else:
                            if capitalise_choice in self.not_registered_list:
                                self.shopping_cart.pop(capitalise_choice)
                                print('\nItem removed \nIf you wish to stop removing items, enter "Exit"')

                            else:
                                print('\nItem not found, Please enter item again')

            elif choice == 'E' or choice == 'e':
                break

            # Error checking
            else:
                print('Wrong input, Please enter option again')

    # returns shopping cart
    def __str__(self):
        return f'{self.shopping_cart}'


# Class to define the checkout
class Checkout(object):
    def __init__(self, shopping_cart):
        shopping_cart2 = AddRemoveItems.__str__

        self.shopping_cart = shopping_cart
        self.new = shopping_cart2
        self.new = self.shopping_cart

    def __str__(self):
        return f'{self.new}'


# function to change currency
def currency_change(total):
    # Loop for error checking
    while True:
        choice = input('Would you like to change currency? Enter Y or N: \n')
        choice = choice.capitalize()

        # ask what do they want to convert to
        if choice == 'Y':
            while True:
                currency_type = input('Which currency would you like to change to? \nUSD, GBP: ')
                currency_type = currency_type.upper()

                # converts € to $
                if currency_type == 'USD':
                    total *= 1.23
                    return f'\nYour new total is ${total}\n'

                # converts € to £
                elif currency_type == 'GBP':
                    total /= 0.90
                    return f'\nYour new total is £{total}\n'

                else:
                    print('Wrong input, enter currency type again \n')

        elif choice == 'N':
            return f'\nYour total is €{total}\n'

        else:
            print('\nWrong input, enter option again \n')


# Class to define the bank details of user to pay
class BankDetails(object):
    def __init__(self, card_n=1234567891234567, card_e=12.20, card_cvv=123):
        self.card_n = card_n
        self.card_e = card_e
        self.card_cvv = card_cvv
        self.correct1 = False
        self.correct2 = False
        self.correct3 = False

        self.correct1 = BankDetails.__CardN__(self, self.card_n, self.correct1)
        self.correct2 = BankDetails.__CardE__(self, self.card_e, self.correct2)
        self.correct3 = BankDetails.__CardCvv__(self, self.card_cvv, self.correct3)
        BankDetails.__CheckCorrect__(self, self.correct1, self.correct2, self.correct3)

    def __len__(self):
        return 1

    # method to ask for card number
    def __CardN__(self, card_n, correct1):
        # error checking
        while True:
            card_n = input('Please enter your 16 digit card number: ')

            try:
                card_n = int(card_n)

            except ValueError:
                print('Wrong details, Please enter details again')

            else:
                # converts int to list and checks if len of card number is == 16
                if len(list(map(int, str(card_n)))) == 16:
                    correct1 = True
                    return correct1

                else:
                    correct1 = False
                    return correct1

    # method to ask for card expiry date
    def __CardE__(self, card_e, correct2):
        # error checking
        while True:
            card_e = input('\nPlease enter you card expiry date (mm.yy): ')
            try:
                card_e = float(card_e)

            except ValueError:
                print('Wrong details, Please enter details again')

            else:
                if card_e >= 1.21:
                    correct2 = True
                    return correct2

                else:
                    correct2 = False
                    return correct2

    # method to ask for card cvv
    def __CardCvv__(self, card_cvv, correct3):
        # error checking
        while True:
            card_cvv = input('\nPlease enter you card cvv: ')
            try:
                card_cvv = int(card_cvv)

            except ValueError:
                print('Wrong details, Please enter details again')

            else:
                # converts int to list and checks if len of card cvv is == 3
                if len(list(map(int, str(card_cvv)))) == 3:
                    correct3 = True
                    return correct3

                else:
                    correct3 = False
                    return correct3

    # method to check if all details entered are correct
    def __CheckCorrect__(self, correct1, correct2, correct3):
        # Loop for error checking
        while True:
            if correct1 is True and correct2 is True and correct3 is True:
                print('All details entered correctly, Please wait \n')
                print('Payment Processed \n')
                print('Thank you for shopping with us today \n')
                return 0

            elif correct1 is False:
                print('Card number was not correct please enter it again \n')
                # enters cardN method and ask for number again
                correct1 = BankDetails.__CardN__(self, self.card_n, self.correct1)

            elif correct2 is False:
                print('Card expiry date was not correct please enter it again \n')
                # enters cardE method and ask for expiry date again
                correct2 = BankDetails.__CardE__(self, self.card_e, self.correct2)

            elif correct3 is False:
                print('Card cvv was not correct please enter it again \n')
                # enters cardCvv method and ask for cvv again
                correct3 = BankDetails.__CardCvv__(self, self.card_cvv, self.correct3)


# function to define what the options of the menu will do
def menu(allow, shopping_cart, loyal_or_bargain, update_list):
    # displays menu + error checks
    choice = display_menu()

    # exits
    if choice == 6:
        print('Thank you for shopping with us today, Bye :) ')
        exit()

    # Create customer
    if choice == 1:
        allow = True
        new_doc = []
        customer_f_name = input('Please enter your first name to login: ').capitalize()
        customer_s_name = input('Please enter your surname to login: ').capitalize()

        # opens, reads, writes file to store customers, returns 1 for loyal,
        # 2 for bargain hunter and 3 for normal customer
        loyal_or_bargain_customer = open_close_file(new_doc, customer_f_name, customer_s_name)

        # Loyal customer
        if loyal_or_bargain_customer == 1:
            # returns what will be printed
            loyal = LoyalCustomer(loyal_or_bargain_customer, customer_f_name, customer_s_name)
            # loyal or bargain will be used in choice 2 of menu
            loyal_or_bargain = 1
            print(loyal)
            return Item_list, loyal_or_bargain, Shopping_cart, update_list

        # bargain hunter customer (this is pretty much the exact the same as the one above)
        elif loyal_or_bargain_customer == 2:
            bargain_hunter = BargainHunter(loyal_or_bargain_customer, customer_f_name, customer_s_name)
            loyal_or_bargain = 2
            print(bargain_hunter)
            return Item_list, loyal_or_bargain, Shopping_cart, update_list

        # normal customer
        elif loyal_or_bargain_customer == 3:
            # for normal customer I am not printing anything just changing loyal or bargain for choice 2 of menu
            loyal_or_bargain = 3
            return Item_list, loyal_or_bargain, Shopping_cart, update_list

    # error checking to not let user enter any other option without login in first
    if allow:
        if choice == 2:
            # displays items for loyal customers
            if loyal_or_bargain == 1:
                # update list was used for choice 3 of menu (as .update was not working correctly in this choice)
                update_list = 1
                # returns item list
                item_list = ItemList(loyal_or_bargain=loyal_or_bargain, update_list=update_list)
                print(item_list)
                return item_list, loyal_or_bargain, Shopping_cart, update_list

            # displays items for bargain hunter customers (same as above)
            elif loyal_or_bargain == 2:
                update_list = 2
                item_list = ItemList(loyal_or_bargain=loyal_or_bargain, update_list=update_list)
                print(item_list)
                return item_list, loyal_or_bargain, Shopping_cart, update_list

            # displays items for normal customers (same as above)
            elif loyal_or_bargain == 3:
                update_list = 3
                item_list = ItemList(update_list=update_list)
                print(item_list)
                return item_list, loyal_or_bargain, Shopping_cart, update_list

        # add/remove products from shopping cart
        elif choice == 3:
            # returns shopping cart
            shopping_cart = AddRemoveItems(Item_list, update_list=update_list)
            return Item_list, loyal_or_bargain, shopping_cart, update_list

        # displays shopping cart
        elif choice == 4:
            print(shopping_cart)
            return Item_list, loyal_or_bargain, shopping_cart, update_list

        # Checkout + choice to change currency and enter card details to pay + address
        elif choice == 5:
            total = Checkout(shopping_cart)
            total2 = 0

            # stores value of dict shopping cart and adds them
            for key, value in total.shopping_cart.shopping_cart.items():
                total2 += value

            print('Your total amount to pay is: €{}'.format(total2))
            # Enters currency change (ask if customer wishes to change currency)
            total2 = currency_change(total2)
            print(total2, '\nPlease enter your card details to pay\n')
            # Enters Bank details (asks user to enter bank details to 'pay')
            BankDetails()

            return Item_list, loyal_or_bargain, shopping_cart, update_list

        # exits (once again because it the code enters a 'different' menu when allow changes to True)
        elif choice == 6:
            print('Thank you for shopping with us today, Bye :) ')
            exit()

    # error checking
    else:
        print('\n** Please enter option 1 first **\n')
        return Item_list, Loyal_or_BargainHunter, Shopping_cart, Update_List


# function to print the menu + error checking
def display_menu():
    print('\n1. Create a customer \n2. List products \n3. Add/remove a product from shopping cart '
          '\n4. See current shopping cart \n5. Checkout \n6. Exit')
    choice = input('\n--Please enter an option--: ')

    # error checking
    while True:
        try:
            choice = int(choice)
        except ValueError:
            choice = input('Wrong input, Please enter option again: ')

        else:
            return choice


# Main
Shopping_cart = {}
Item_list = {}
counter = 0
Loyal_or_BargainHunter = 3
Update_List = 3

# loop for error checking
while True:
    if counter > 0:
        Allow = True
    else:
        Allow = False

    Item_list, Loyal_or_BargainHunter, Shopping_cart, Update_List = menu(Allow, Shopping_cart, Loyal_or_BargainHunter,
                                                                         Update_List)
    counter += 1

