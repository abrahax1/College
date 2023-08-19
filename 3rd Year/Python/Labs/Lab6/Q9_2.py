# Program to remove a range of chars from numbers inputted
Word = input("Enter a word: ")
X, Y = map(int, input("Enter 2 numbers: ").split())


def remove_substring(word):
    print(word[:X] + word[Y + 1:])


remove_substring(Word)
