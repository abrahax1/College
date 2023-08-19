# Program to calculate the factorial of a number
X = int(input("Enter Number: "))
Total = X

for i in range(0, X):
    if X > 1:
        Total *= (X - 1)  # eg: 4 * 3 = 12 * 2 = 24
        print(X, "*", end=' ')
        X -= 1

    # Error checking
    else:
        print(X, end='')

print("\n\nTotal is:", Total)
