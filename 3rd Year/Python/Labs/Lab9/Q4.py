# Program that catches Value errors and Zero division error
Num1 = input("Enter 1st number: ")
Num2 = input("Enter 2nd number: ")
Num3 = input("Enter 3rd number: ")
Total = 0

while True:
    while True:
        try:
            Num1 = int(Num1)

        except ValueError:
            Num1 = input("Enter 1st number again: ")

        else:
            break

    while True:
        try:
            Num2 = int(Num2)

        except ValueError:
            Num2 = input("Enter 2nd number again: ")

        else:
            break

    while True:
        try:
            Num3 = int(Num3)

        except ValueError:
            Num3 = input("Enter 3rd number again: ")

        else:
            break

    try:
        Total = Num1 / Num2

    except ZeroDivisionError:
        Num2 = input("Enter 2nd number again: ")

    else:
        Total += Num3
        break

print(Total)
