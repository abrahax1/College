# Program to convert binary to decimal number
binary = input("Enter a binary number: ")
Reverse_bin = ""
j = 1

# Reverse binary so we are able to sum it later
for i in binary:
    Length = (len(binary) - j)
    Reverse_bin += binary[Length]
    j += 1

Same = 2
sum = 2
j = 0
Total = 0

# Conversion of binary to decimal
for i in Reverse_bin:
    if i == "1":
        sum = 1 * Same ** j
        Total += sum

    j += 1

print(Total)
