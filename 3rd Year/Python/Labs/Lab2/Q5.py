# Program to test if-else statements
# Part 1
Cigars = int(input("Enter amount of Cigars: "))
Weekend = input("Enter 'Y' or 'N' if it's the weekend: ")
X, Y = 40, 60

# Comparisons and Error checking
if (Cigars < X or Cigars > Y) and (Weekend == 'N' or Weekend == 'n'):
    print("False")

    # Error checking and comparison
    if (Weekend == 'Y' or Weekend == 'y') and Cigars >= X:
        print("True")

# Comparison ( (cigars > 40 or cigars < 60) and (Weekend == Y or y) )
else:
    print("True")

# Part 2
Temperature = int(input("Enter the temperature: "))
Summer = input("Enter 'Y' or 'N' if it's the Summer: ")
X, Y = 60, 90

# Comparisons and Error checking
if (Temperature < X or Temperature > Y) and (Summer == 'N' or Summer == 'n'):
    print("False")

    # Error checking and comparison
    if (Summer == 'Y' or Summer == 'y') and (Temperature >= X or Temperature <= 100):
        print("True")

# Comparison ( (Temperature > 60 or Temperature < 90) and (Summer == Y or y) )
else:
    print("True")

# Part 3
Speed = int(input("Enter the Speed: "))
Birthday = input("Enter 'Y' or 'N' if it's your Birthday: ")
X, Y = 60, 80

# Comparison and Error checking IF true add 5 to X and Y
if Birthday == 'Y' or Birthday == 'y':
    X += 5
    Y += 5

    # Comparisons
    if Speed <= X:
        print("0")

    elif X < Speed <= Y:
        print("1")

    else:
        print("2")

# Comparison
else:
    # Comparisons
    if Speed <= X:
        print("0")

    elif X < Speed <= Y:
        print("1")

    else:
        print("2")
