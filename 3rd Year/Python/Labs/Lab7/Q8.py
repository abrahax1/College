# program to remove common numbers between two lists
List1 = [1, 2, 3, 4, 5, 6]
List2 = [10, 9, 8, 7, 6]

# part a
for i in range(len(List1)):
    for j in range(len(List2)):
        if List1[i] == List2[j]:
            counter = i
            break

# part b
for i in range(len(List2)):
    for j in range(len(List1)):
        if List2[i] == List1[j]:
            counter2 = i
            break

print(List1[:counter])
print(List2[:counter2])
