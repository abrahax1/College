# function to enter a number and print from 0 to the number entered
# check if they are even or odd
Number = int(input("Enter a number: "))


# Function to print number from 1 to N and check even or odd
def even_odd(number):
    for i in range(number + 1):
        if i % 2 == 0:
            print(i, "Even")

        else:
            print(i, "Odd")


even_odd(Number)
