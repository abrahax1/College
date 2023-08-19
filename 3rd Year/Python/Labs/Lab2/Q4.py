# ask for 3 values and checks which is the largest
Number1, Number2, Number3 = input("Enter 3 numbers: ").split(',')

# Comparisons
if Number1 > Number2 and Number1 > Number3:
    print("Largest Number is Number 1: ", Number1)

elif Number2 > Number1 and Number2 > Number3:
    print("Largest Number is Number 2: ", Number2)

# error checking
elif Number1 == Number2 and Number1 == Number3:
    print("They are all the same value")

else:
    print("Largest Number is Number 3: ", Number3)
