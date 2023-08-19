# Program to find if sentence is a hetereogram
def heterogram(sentece):
    alphabets = [ch for ch in sentece if (ord('a') <= ord(ch) <= ord('z'))]

    if len(set(alphabets)) == len(alphabets):
        print('Yes')

    else:
        print('No')


Sentence = 'the big dwarf only jumps'
heterogram(Sentence)
