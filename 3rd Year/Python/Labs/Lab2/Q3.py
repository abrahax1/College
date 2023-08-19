# small calculator
# ask for 2 values
Number1 = int(input("Enter 1st number: "))
Number2 = int(input("Enter 2nd number: "))
Total = 0

# loop for error checking of operator
while True:
    operation = input("Enter what operation you wish to do (+,-,*,/): ")

    if operation == '+':
        Total = Number1 + Number2
        print(Total)
        break

    elif operation == '-':
        Total = Number1 - Number2
        print(Total)
        break

    elif operation == '*':
        Total = Number1 * Number2
        print(Total)
        break

    elif operation == '/':
        Total = Number1 / Number2
        print(Total)
        break

    else:
        print("Please enter a valid operator")
        continue




