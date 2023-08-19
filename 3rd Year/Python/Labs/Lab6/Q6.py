# Program to remove duplicate letters from a word with more than 4 letters
Word = input("Enter a word or sentence with more than 4 letters: ")


def mix_word(word):
    if len(word) > 4:
        new_word = word[:2] + word[len(word) - 2: len(word)]
        return new_word
    else:
        return "Error"


mix_word(Word)
print(mix_word(Word))
