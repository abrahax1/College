# sum numbers from 0 to N
Number = int(input("Enter a number: "))


# Function to sum numbers from 0 to N
def sum(number):
    total = 0

    for i in range(number + 1):
        total += i

    return total


sum(Number)

Total = sum(Number)
print(Total)
