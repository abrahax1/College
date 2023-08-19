# finding how many 3 digit numbers are perfectly divisible by 17
# Number = range(100, 1000) # range starts at number and ends at number - 1
for i in range(100, 1000):
    if i % 17 == 0:
        print(i)
