# Program to swap a letters in a word 
import random

Word = "Hello"

X = random.randint(0, len(Word) - 1)
Y = random.randint(0, len(Word) - 1)

while X >= Y:
    X = random.randint(0, len(Word) - 1)
    Y = random.randint(0, len(Word) - 1)

new_Word = Word[:X] + Word[Y] + Word[X + 1: Y] + Word[X] + Word[Y + 1:]

print("Result", new_Word)
print("Characters swapped: ", Word[X], Word[Y])
