# Factorial Numbers
Number = int(input("Enter a number: "))


# function to multiply N * N - 1 (factorial)
def factorial(number):
    total = number

    for i in range(number):
        i += 1
        if i < number:
            total *= number - i

        else:
            break

    return total


factorial(Number)
print(factorial(Number))
