# Ask For 2 numbers prints if 1st N. is larger, smaller or equal than 2nd N.

Number1, Number2 = input("Enter 2 Numbers: ").split()

if Number1 > Number2:
    print("Larger")

elif Number1 < Number2:
    print("Smaller")

else:
    print("Equal")
