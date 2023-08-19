# Program to represent a bank account
class BankAccount:
    def __init__(self, iban=0, acc_number=0, funds=0, transactions=()):
        self.iban = iban
        self.acc_number = acc_number
        self.funds = funds
        self.transactions = transactions

        choice = input('Do you want to Withdraw or Deposit money?: ')

        if choice == 'W' or choice == 'w':
            taken = int(input('How much do you want to take: '))
            self.funds -= taken
            if self.funds < 0:
                self.funds = funds
                print('\nYou do not have enough money, current balance is {}\n'.format(self.funds))

        elif choice == 'D' or choice == 'd':
            deposited = int(input('How much do you want to deposit: '))
            self.funds += deposited

    def __str__(self):
        return 'IBAN is {}, Acc_Number is {}, \nAvailable funds {}, Last 5 transactions: {}'.format(self.iban,
                                                                                                 self.acc_number,
                                                                                                 self.funds,
                                                                                                 self.transactions)


Transaction = (-50, -3, -20, -10, 100)
bank_account = BankAccount(12345678, 1234, 100, Transaction)
print(bank_account)



