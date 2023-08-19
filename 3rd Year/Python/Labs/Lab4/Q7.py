# Program to play pig latin, if word starts with vowel the add 'yay' at the end
# If word starts with consonant move consonants to the end until a vowel appears and add 'ay' at the end
# Repeatedly plays program until player wants to exit game by entering '.'
Vowels = "a", "A", "e", "E", "i", "I", "o", "O", "u", "U"

while True:
    Word = input("Enter a word or Enter '.' to exit game: ")
    i = 0
    Length = len(Word)

    # exit
    if Word == ".":
        print("\nThanks for playing")
        break

    # word start with vowel
    elif Word[0] in Vowels:
        Word += "yay"
        print(Word)

    # word start with consonant
    elif Word[i] not in Vowels:
        Change = ""
        for j in Word:
            if j not in Vowels:
                # make new string to store consonants and add them to the end of new word
                Change += j
                New_Word = Word[i + 1:Length] + Change
                i += 1

            else:
                break

        Word = New_Word + "ay"

        print(Word)
