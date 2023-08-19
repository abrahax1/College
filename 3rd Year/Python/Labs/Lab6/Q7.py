# Program that does not print odd letters
Word = input("Enter a word: ")


def remove_odd_letters(word):
    counter = 0

    for i in word:
        if counter % 2 == 0:
            print(i, end='')
            counter += 1

        else:
            counter += 1


remove_odd_letters(Word)
