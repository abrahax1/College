# program to find common numbers between two lists
List1 = [1, 2, 3, 4, 5, 6]
List2 = [10, 9, 8, 7, 6]


def common_number(sample1, sample2):
    for i in range(len(sample1)):
        for j in range(len(sample2)):
            if sample1[i] == sample2[j]:
                print("True")


common_number(List1, List2)
