# Program to find words in a document 
# Author: Abraham Izarra
# Date: 2 Nov 2020

New_Doc = []
Key_with_value = {}
Word_by_Word = {}
Repeated_word = ()


# Function to open doc, store in list
def open_doc(new_doc, filename):
    file = open(filename)
    for lines in file:
        new_doc += [lines]

    new_doc = [each_string.lower() for each_string in new_doc]

    return new_doc


# Function to divide the document
def divide_doc(new_doc, key_and_value):
    i = 0
    division_of_doc = {}

    # loop to store the document on list to a dictionary
    for lines1 in new_doc:
        if lines1 == new_doc[0]:  # new_doc[0] is '<New Document>'
            division_of_doc['Document {}'.format(i)] = key_and_value

            key_and_value = ''
            i += 1

        else:
            key_and_value += lines1

    # adds the last lines1 to the dictionary
    division_of_doc['Document {}'.format(i)] = key_and_value

    # deletes document 0 which contains nothing
    del division_of_doc['Document {}'.format(0)]

    return division_of_doc


# Function to divide doc word by word
def divide_word_by_word(new_doc, word_by_word, repeated_word):
    split_doc = []
    string1 = ''
    i = 0

    # loop to split file, word by word
    for words in new_doc:
        split_doc += words.split()

    print("Program is processing, Please wait")
    # Loop to store words one by one to a dict and its placement, and store repeated words and its placement
    # (Takes a while to complete execution)
    for words in split_doc:
        if words not in word_by_word:
            word_by_word[words] = i
            i += 1

        # the else statement is the reason the program takes long to execute
        else:
            # Store repeated words and their placement
            repeated_word += (words, i)
            i += 1

    return word_by_word, repeated_word


def search_word(word_by_word, key_with_value, repeated_word, search):
    words_to_search = {}

    amount_of_words = len(search.split())
    items = []

    # stores the words inside the documents and converts them from dict to list
    for key, value in key_with_value.items():
        temp = value
        items.append(temp)

    # checks the amount of words entered by user
    if amount_of_words > 1:
        search = search.split()

        # stores split words entered by user in dict (min 2 words)
        for w in search:
            i = 0
            words_to_search[w] = w

            # checks if words entered by user is in word by word
            if words_to_search[w] in word_by_word:
                print('\n"{}" is in place: '.format(words_to_search[w]), word_by_word[words_to_search[w]])
                i += 1

            # Searches where a word is repeated
            for word in repeated_word:
                if words_to_search[w] == word:
                    print('"{}" is repeated in place: '.format(words_to_search[w]), repeated_word[i])
                i += 1

            counter = 0
            # separates the list, compares word entered by user and prints document where word is
            for words2 in items:
                separated_item = words2.split()
                counter += 1

                if words_to_search[w] in separated_item:
                    print('\nDocument {}\n'.format(counter), Key_with_value['Document {}'.format(counter)])

    else:
        i = 0

        # checks if word entered by user is in word by word (max 1)
        if search in word_by_word:
            print('\n"{}" is in place: '.format(search), word_by_word[search])

        # Searches where a word is repeated
        for word in repeated_word:
            i += 1
            if search == word:
                print('"{}" is repeated in place: '.format(search), repeated_word[i])

        counter = 0
        # separates the list, compares word entered by user and prints document where word is
        for words2 in items:
            separated_item = words2.split()
            counter += 1

            if search in separated_item:
                print('\nDocument {}\n'.format(counter), Key_with_value['Document {}'.format(counter)])


# Main function, shows menu and call functions
Filename = 'ap_docs2.txt'
Search = ''

# function call to open doc and pass contents to a list
New_Doc = open_doc(New_Doc, Filename)

# function call to convert new doc to dictionary
Key_with_value = (divide_doc(New_Doc, Key_with_value))

# function call to divide new doc word by word
Word_by_Word, Repeated_word = divide_word_by_word(New_Doc, Word_by_Word, Repeated_word)

while True:
    answer = input("What would you like to do? \n1. Search for documents \n2. Read Document \n3. Quit Program \n")

    while True:
        try:
            answer = int(answer)
            break

        except ValueError:
            answer = input('Please enter option 1, option 2 or option 3: ')

    if answer == 1:
        Search = input('Please enter a word to find: ')
        Search = Search.lower()

    elif answer == 2:
        search_word(Word_by_Word, Key_with_value, Repeated_word, Search)

    elif answer == 3:
        print("Thank you, bye :)")
        exit()
