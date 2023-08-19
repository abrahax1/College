# function to enter a number and print from 1 to the number entered
Number = int(input("Enter a number: "))


# Function to print number from 1 to N
def input_number(number):
    for i in range(1, number + 1):
        print(i, end=' ')


input_number(Number)
