# program to encrypt strings inputted (code is letter + 1) a --> b
Word = input("Enter a word: ")

for i in range(len(Word)):
    # changes char to UFX number
    Unicode = ord(Word[i])

    # adds + 1 to UFX num in other string
    Encryption = Unicode + 1

    # turns UFX num to char
    print(chr(Encryption), end="")

##################
# Faster way
# Word = "abc"
# new_Word = ""
# for char in Word:
#     new_Word += chr(ord(char) + 1)
#
# print(new_Word)
