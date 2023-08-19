# program to remove duplicates
duplicates = [1, 1, 2, 2, 3, 3, 4, 4, 5, 5, 6, 6]
Length = len(duplicates)

for i in range(len(duplicates)):
    if duplicates[i] == duplicates[i+1]:
        if i >= Length - 2:
            print(duplicates[i], end='')
            break

    else:
        print(duplicates[i], end=',')
