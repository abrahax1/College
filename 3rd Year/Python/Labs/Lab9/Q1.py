# Program that asks for float and repeats forever until user inputs a float
number_str = input("Input a floating-point number: ")

while True:
    try:
        number_float = float(number_str)

    except ValueError:
        number_str = input("Wrong input, Please enter a float: ")

    else:
        break

print("Number is", number_float)
