# Part A
# Loop to calculate numbers from 1 to 10 multiplied by 9
for i in range(0, 11):
    Number = i
    Number *= 9
    print(i, "* 9 =", Number)

#############
# Part B
# Two loops to show all tables from 1 to 10

Count = 0
for i in range(1, 11):
    for j in range(1, 11):
        Total = j * i
        Count += 1
        print(Count, ".-", j, "*", i, "=", Total)

