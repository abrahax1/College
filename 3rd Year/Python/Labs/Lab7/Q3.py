# Program to compare the first letter of an element on a list and count the times
# the comparison was true
List = ['Always', 'look', 'on', 'the', 'bright', 'side', 'of', 'life']


def starting_letter(letter):
    total = 0
    j = 0
    for i in letter:
        if letter[j][0] == 'o':
            total += 1

        j += 1

    print(total)


starting_letter(List)
