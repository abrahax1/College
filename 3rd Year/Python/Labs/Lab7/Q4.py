# Program to enter many string, convert them to a list, compare the first letter
# of each element and count if comparison is true
List = input("Enter many words: ")
Char = input("Enter a character: ")


def starting_letter(words, letter):
    total = 0
    j = 0
    new_list = words.split()

    for i in new_list:
        if new_list[j][0] == letter:
            total += 1

        j += 1

    print(total)


starting_letter(List, Char)
