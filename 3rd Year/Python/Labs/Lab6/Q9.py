# Program to add a string in the middle of a string
Word = input("Enter a word: ")


def insert_string_middle(word):
    counter = 0
    # print first part of string
    print("{ {", end='')

    # print in between string
    for i in word:
        print(i, end='')
        counter += 1

        # print last part of string
        if counter == len(word):
            print("} }", end='')


insert_string_middle(Word)
