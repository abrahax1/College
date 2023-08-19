# input a number and then add consecutively until the inputted number is reach
# eg X = 5 then 1 + 2 + 3 + 4 + 5 = 15
# X = int(input("Enter a number: "))
# number = 1
# Total = 0
#
# for i in range(X):
#     if number < X:
#         print(number, '+ ', end='')
#         number += 1
#         Total += number
#
#     else:
#         print(number, '=', Total + 1, end='\n')


###############
# Part B

# X = int(input("Enter a number: "))
#
# for i in range(1, X + 1):
#     Total = 0
#     for j in range(1, i + 1):
#         Total += j
#
#         if j < i:
#             print(j, '+ ', end='')
#
#         else:
#             print(j, '= ', end='')
#
#     print(Total)

###########
# Part C
X = int(input("Enter a number: "))

for i in range(1, X + 1):
    Total = 0
    count = 0
    result = ""

    for j in range(1, i + 1):
        Total += j
        count += 1

        if j < i:
            result += str(j) + " + "

        else:
            result += str(j) + " = "

    if Total % count == 0:
        print(result, Total)
