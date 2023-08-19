# print only even numbers from a list
List = [1, 2, 3, 4, 5, 6]


def sum_list(even):
    for i in even:
        if i % 2 == 0:
            print(i, end=' ')


sum_list(List)
