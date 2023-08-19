# Program to print string from beginning to half
Word = input("Enter a word: ")


def first_half(word):
    if len(word) % 2 == 0:
        return word[:len(word) // 2]

    else:
        return "Please enter an even letter word"


first_half(Word)
print(first_half(Word))
