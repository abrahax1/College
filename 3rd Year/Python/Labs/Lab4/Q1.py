# Program that reverses string using loop
S = input("Enter a word: ")

Length = len(S)
for i in range(len(S)):
    print(S[Length - 1], end="")
    Length -= 1
