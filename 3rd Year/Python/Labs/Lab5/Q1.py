# Program to convert decimal number to binary
integer = int(input("Enter a number: "))
binary = ""
remainder = 0
Quotient = 0

for i in range(integer + 1):
    # Conversion from decimal to binary
    if integer >= 1:
        Quotient = integer // 2
        remainder = integer % 2
        integer = Quotient

        if remainder == 0:
            binary += "0"

        else:
            binary += "1"

        # Error checking
        if integer == 0:
            break

    # Error checking
    elif integer == 0:
        print("0 is equal to 0 in binary")
        break

    # Error checking NOT WORKING (i don't understand why)
    elif integer < 0:
        print("Error, number is negative")
        break

print(binary[len(binary)::-1])
