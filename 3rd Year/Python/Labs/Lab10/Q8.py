# Program to find if the sentence is a pangram or not
import string


def check(sentence):
    return(set(string.ascii_lowercase) - set(sentence.lower()) == set([]))


Sentence = 'The quick brown fox jumps over the lazy'
if check(Sentence):
    print('sentence is a pangram')
else:
    print('sentence is not a pangram')
