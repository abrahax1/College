# function to enter a number and print from 0 to the number entered
# Multiplies N by 9
Number = int(input("Enter a number: "))


# Function to print number from 1 to N and multiplies N by 9
def multiply(number):
    for i in range(number + 1):
        print(i, "* 9 = ", i * 9)


multiply(Number)
